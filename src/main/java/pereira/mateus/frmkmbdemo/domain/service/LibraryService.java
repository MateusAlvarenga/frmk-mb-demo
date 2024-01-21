package pereira.mateus.frmkmbdemo.domain.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pereira.mateus.frmkmbdemo.domain.model.Book;
import pereira.mateus.frmkmbdemo.domain.model.LibraryDAO;
import pereira.mateus.frmkmbdemo.domain.model.Query;

import java.util.List;

@Service
public class LibraryService implements ILibraryService{

    private final SqlSessionFactory sqlSessionFactory;

    @Autowired
    public LibraryService(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public List<Book> listAllBooks() {
//        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
//            LibraryDAO libraryDAO = sqlSession.getMapper(LibraryDAO.class);
//            return libraryDAO.listAllBooks();
//        }catch (Exception e){
//            throw new RuntimeException(e);
//        }

        SqlSession sqlSession = sqlSessionFactory.openSession();
        LibraryDAO libraryDAO = sqlSession.getMapper(LibraryDAO.class);
        Query query = new Query();
        query.setQuery("select * from Book");
        return libraryDAO.genericQuery(query);
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
