package com.example.bookservice;

import org.rafal.bookservice.api.BooksApi;
import org.rafal.bookservice.models.Book;
import org.rafal.bookservice.models.BooksService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController implements BooksApi {

   private final BooksService b = new BooksService();

    private void initStorage(){

        b.addArrayOfBooksItem(new Book().author("William Trzęsidzida").iban("PL10105000997603123456789123").title("Romeo i Julia"));
        b.addArrayOfBooksItem(new Book().author("Henryk Sienkiewicz").iban("PL53205030992603123256781125").title("W pustyni i W puszczy"));
        b.addArrayOfBooksItem(new Book().author("Leno Paleno").iban("PL52203030992303223251781126").title("Emotria"));

    }

    @Override
    public ResponseEntity<BooksService> getBooks() {
        initStorage();
        return new ResponseEntity<>(b, HttpStatus.OK);

    }

    @Override
    public ResponseEntity<Book> getBookbyIban(String iban) {
        for (Book book : b.getArrayOfBooks())
            if (book.getIban().equals(iban))
                return new ResponseEntity<>(book,HttpStatus.OK);
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<Book> getBookbyTitle(String title) {
        for (Book book : b.getArrayOfBooks())
            if (book.getTitle().contains(title))
                return new ResponseEntity<>(book,HttpStatus.OK);
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
}
