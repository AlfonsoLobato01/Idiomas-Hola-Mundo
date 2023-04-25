package RetoInicial.HolaMundo.Repo;

import java.util.List;
import java.util.Optional;

import RetoInicial.HolaMundo.Idioma.Idioma;


public interface IdiomaRepository{

    List<Idioma> findAll();

    Optional<Idioma> findById(Long id);
    
    Optional<Idioma> findByCodigo(String CODIGO);

    <S extends Idioma> S save(S idioma);
    
    void deleteById(Long id);
    
}