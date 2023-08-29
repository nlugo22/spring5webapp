package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/** created by nlugo
 *  8/25/23
 */
public interface AuthorRepository extends CrudRepository<Author, Long>{
}
