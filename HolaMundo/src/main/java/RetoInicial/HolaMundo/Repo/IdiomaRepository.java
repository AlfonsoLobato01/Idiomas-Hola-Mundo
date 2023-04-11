package RetoInicial.HolaMundo.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import RetoInicial.HolaMundo.Entity.Idioma;


public interface IdiomaRepository extends CrudRepository<Idioma, Long> {

    List<Idioma> findAll();

    Optional<Idioma> findById(Long id);
    
    Optional<Idioma> findByCodigo(String codigo);

    <S extends Idioma> S save(S idioma);
    
    void deleteById(Long id);
    
}