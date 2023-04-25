package RetoInicial.HolaMundo.service;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import RetoInicial.HolaMundo.Exception.IdiomaNotFoundException;
import RetoInicial.HolaMundo.Idioma.Idioma;
import RetoInicial.HolaMundo.Repo.IdiomaRepository;

@Service
public class IdiomaService {

    private IdiomaRepository idiomaRepository;

    public IdiomaService(IdiomaRepository idiomaRepository) {
        this.idiomaRepository = idiomaRepository;
    }

    public String getSaludo(String codigoIdioma) {
        Optional<Idioma> optionalIdioma = idiomaRepository.findByCodigo(codigoIdioma);
        if (optionalIdioma.isPresent()) {
        	return optionalIdioma.get().getSaludo();
        } else {
            throw new IdiomaNotFoundException("Idioma no encontrado: " + codigoIdioma);
        }
    }

    public Idioma crearIdioma(Idioma idioma) {
        return idiomaRepository.save(idioma);
    }
    
    public Idioma obtenerIdiomaPorId(Long id) {
        Optional<Idioma> optionalIdioma = idiomaRepository.findById(id);
        if (optionalIdioma.isPresent()) {
            return optionalIdioma.get();
        } else {
            throw new IdiomaNotFoundException("Idioma no encontrado con el id: " + id);
        }
    }

    public Idioma obtenerIdiomaPorCodigo(String codigo) {
        Optional<Idioma> optionalIdioma = idiomaRepository.findByCodigo(codigo);
        if (optionalIdioma.isPresent()) {
            return optionalIdioma.get();
        } else {
            throw new IdiomaNotFoundException("Idioma no encontrado con el código: " + codigo);
        }
    }

    public Idioma actualizarIdioma(Long id, Idioma idiomaActualizado) {
        Optional<Idioma> optionalIdioma = idiomaRepository.findById(id);
        if (optionalIdioma.isPresent()) {
            Idioma idioma = optionalIdioma.get();
            idioma.setNombre(idiomaActualizado.getNombre());
            idioma.setCodigo(idiomaActualizado.getCodigo());
            return idiomaRepository.save(idioma);
        } else {
            throw new IdiomaNotFoundException("Idioma no encontrado con id: " + id);
        }
    }

    public void borrarIdioma(Long id) {
        Optional<Idioma> optionalIdioma = idiomaRepository.findById(id);
        if (optionalIdioma.isPresent()) {
            idiomaRepository.deleteById(id);
        } else {
            throw new IdiomaNotFoundException("Idioma no encontrado con id: " + id);
        }
    }

    public List<Idioma> obtenerIdiomas() {
        return (List<Idioma>) idiomaRepository.findAll();
    }
}
