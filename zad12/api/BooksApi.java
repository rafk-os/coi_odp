/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.rafal.bookservice.api;

import org.rafal.bookservice.models.Book;
import org.rafal.bookservice.models.BooksService;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-07T03:11:58.532191700+01:00[Europe/Warsaw]")

@Validated
@Api(value = "books", description = "the books API")
public interface BooksApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /books/{iban} : Get book by iban number
     *
     * @param iban  (required)
     * @return book by id (status code 200)
     */
    @ApiOperation(value = "Get book by iban number", nickname = "getBookbyIban", notes = "", response = Book.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "book by id", response = Book.class) })
    @RequestMapping(value = "/books/{iban}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Book> getBookbyIban(@ApiParam(value = "",required=true) @PathVariable("iban") String iban) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"author\" : \"author\", \"iban\" : \"iban\", \"title\" : \"title\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /books/findByTitle : Get book by title number
     *
     * @param title  (required)
     * @return book by title (status code 200)
     */
    @ApiOperation(value = "Get book by title number", nickname = "getBookbyTitle", notes = "", response = Book.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "book by title", response = Book.class) })
    @RequestMapping(value = "/books/findByTitle",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Book> getBookbyTitle(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "title", required = true) String title) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"author\" : \"author\", \"iban\" : \"iban\", \"title\" : \"title\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /books : Gets list of books
     *
     * @return books list (status code 200)
     */
    @ApiOperation(value = "Gets list of books", nickname = "getBooks", notes = "", response = BooksService.class, tags={ "books", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "books list", response = BooksService.class) })
    @RequestMapping(value = "/books",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<BooksService> getBooks() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"array_of_books\" : [ { \"author\" : \"author\", \"iban\" : \"iban\", \"title\" : \"title\" }, { \"author\" : \"author\", \"iban\" : \"iban\", \"title\" : \"title\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
