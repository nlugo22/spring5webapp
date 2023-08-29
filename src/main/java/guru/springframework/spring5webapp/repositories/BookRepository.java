package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/** created by nlugo
 *  8/25/23
 */
public interface BookRepository extends CrudRepository<Book, Long>{
}
