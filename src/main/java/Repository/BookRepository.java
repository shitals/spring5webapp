package Repository;

import guru.springframework.spring5webapp.vo.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
