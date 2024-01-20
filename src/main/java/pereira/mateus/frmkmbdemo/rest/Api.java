package pereira.mateus.frmkmbdemo.rest;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pereira.mateus.frmkmbdemo.domain.model.Book;
import pereira.mateus.frmkmbdemo.domain.service.ILibraryService;

import java.util.List;

@RestController
@AllArgsConstructor
public class Api {

    @Autowired
    ILibraryService libraryService;

    @GetMapping("/books")
    public List<Book> books() {
        return libraryService.listAllBooks();
    }
}
