package RetoInicial.HolaMundo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RetoInicial.HolaMundo.Idioma.Idioma;
import RetoInicial.HolaMundo.service.IdiomaService;


@RestController
@RequestMapping("/idiomas")
public class IdiomaController {

    @Autowired
    private IdiomaService idiomaService;

    @GetMapping
    public List<Idioma> obtenerIdiomas() {
        return idiomaService.obtenerIdiomas();
    }

    @GetMapping("/{id}")
    public Idioma obtenerIdiomaPorId(@PathVariable Long id) {
        return idiomaService.obtenerIdiomaPorId(id);
    }

    @GetMapping("/codigo/{codigo}")
    public Idioma obtenerIdiomaPorCodigo(@PathVariable String codigo) {
        return idiomaService.obtenerIdiomaPorCodigo(codigo);
    }

    @PostMapping
    public Idioma crearIdioma(@RequestBody Idioma idioma) {
        return idiomaService.crearIdioma(idioma);
    }

    @PutMapping("/{id}")
    public Idioma actualizarIdioma(@PathVariable Long id, @RequestBody Idioma idioma) {
        return idiomaService.actualizarIdioma(id, idioma);
    }

    @DeleteMapping("/{id}")
    public void borrarIdioma(@PathVariable Long id) {
    	idiomaService.borrarIdioma(id);
    }
}
