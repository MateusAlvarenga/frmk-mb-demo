package pereira.mateus.frmkmbdemo.domain.service;

import org.springframework.stereotype.Service;
import pereira.mateus.frmkmbdemo.domain.model.Book;

import java.util.List;

@Service
public class LibraryService implements ILibraryService{


    @Override
    public List<Book> findAll() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Book findById(Long id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Book save(Book book) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
