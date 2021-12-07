package org.rafal.bookservice.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.rafal.bookservice.models.Book;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BooksService
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-07T03:11:58.532191700+01:00[Europe/Warsaw]")

public class BooksService   {
  @JsonProperty("array_of_books")
  @Valid
  private List<Book> arrayOfBooks = null;

  public BooksService arrayOfBooks(List<Book> arrayOfBooks) {
    this.arrayOfBooks = arrayOfBooks;
    return this;
  }

  public BooksService addArrayOfBooksItem(Book arrayOfBooksItem) {
    if (this.arrayOfBooks == null) {
      this.arrayOfBooks = new ArrayList<>();
    }
    this.arrayOfBooks.add(arrayOfBooksItem);
    return this;
  }

  /**
   * Get arrayOfBooks
   * @return arrayOfBooks
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Book> getArrayOfBooks() {
    return arrayOfBooks;
  }

  public void setArrayOfBooks(List<Book> arrayOfBooks) {
    this.arrayOfBooks = arrayOfBooks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BooksService booksService = (BooksService) o;
    return Objects.equals(this.arrayOfBooks, booksService.arrayOfBooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayOfBooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BooksService {\n");
    
    sb.append("    arrayOfBooks: ").append(toIndentedString(arrayOfBooks)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

