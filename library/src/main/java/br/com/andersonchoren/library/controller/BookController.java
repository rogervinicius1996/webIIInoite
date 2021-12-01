package br.com.andersonchoren.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andersonchoren.library.model.dto.BookDTO;
import br.com.andersonchoren.library.service.BookService;
import br.com.andersonchoren.library.util.BookMapping;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService service;

    @PostMapping
    public ResponseEntity<BookDTO> insert(@RequestBody BookDTO dto) {
        if (dto.getId() != 0)
            return new ResponseEntity<>(new BookDTO(), HttpStatus.BAD_REQUEST);

        var book = service.insertOrUpdate(
                BookMapping.toBook(dto));

        if (book != null)
            return new ResponseEntity<>(
                    BookMapping.fromBook(book), HttpStatus.CREATED);
        return new ResponseEntity<>(new BookDTO(), HttpStatus.NOT_FOUND);
    }
}
