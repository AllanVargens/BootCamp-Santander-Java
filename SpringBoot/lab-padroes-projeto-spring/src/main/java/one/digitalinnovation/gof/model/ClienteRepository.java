package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // opcional ja que CrudRepository ja indica que é um repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
