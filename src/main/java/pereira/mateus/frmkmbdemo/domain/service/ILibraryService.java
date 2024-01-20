package pereira.mateus.frmkmbdemo.domain.service;

import pereira.mateus.frmkmbdemo.domain.model.Book;

import java.util.List;

public interface ILibraryService {

    public List<Book> findAll();
    public Book findById(Long id);
    public Book save(Book book);

}
