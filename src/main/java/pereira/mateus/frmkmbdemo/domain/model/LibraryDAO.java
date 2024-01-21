package pereira.mateus.frmkmbdemo.domain.model;

import java.util.List;

public interface LibraryDAO {
      
      public int a = 0;

      List<Book> listAllBooks();

       List<Book> genericQuery(Query query);
}
