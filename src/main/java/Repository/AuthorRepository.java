package Repository;

import guru.springframework.spring5webapp.vo.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
