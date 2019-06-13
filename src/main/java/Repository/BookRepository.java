package Repository;

import guru.springframework.spring5webapp.vo.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
