package br.com.andersonchoren.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.andersonchoren.library.model.dto.BookDTO;
import br.com.andersonchoren.library.service.BookService;
import br.com.andersonchoren.library.util.BookMapping;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public String formInsert(Model model) {
        BookDTO book = new BookDTO();
        model.addAttribute("objBook", book);
        return "pages/register";
    }

    @PostMapping
    public String insert(@ModelAttribute BookDTO bookDTO) {
        var book = bookService.insertOrUpdate(
                BookMapping.toBook(bookDTO));
        if (book.getId() != 0) {
            return "pages/success";
        } else {
            return "pages/error";
        }
    }
}
