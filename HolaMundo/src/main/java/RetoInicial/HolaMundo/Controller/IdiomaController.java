package RetoInicial.HolaMundo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RetoInicial.HolaMundo.Idioma.Idioma;
import RetoInicial.HolaMundo.service.IdiomaService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/idiomas")
public class IdiomaController {

    @Autowired
    private IdiomaService holaMundoService;

    @GetMapping
    public List<Idioma> obtenerIdiomas() {
        return holaMundoService.obtenerIdiomas();
    }

    @GetMapping("/{id}")
    public Idioma obtenerIdiomaPorId(@PathVariable Long id) {
        return holaMundoService.obtenerIdiomaPorId(id);
    }

    @GetMapping("/codigo/{codigo}")
    public Idioma obtenerIdiomaPorCodigo(@PathVariable String codigo) {
        return holaMundoService.obtenerIdiomaPorCodigo(codigo);
    }

    @PostMapping
    public Idioma crearIdioma(@RequestBody Idioma idioma) {
        return holaMundoService.crearIdioma(idioma);
    }

    @PutMapping("/{id}")
    public Idioma actualizarIdioma(@PathVariable Long id, @RequestBody Idioma idioma) {
        return holaMundoService.actualizarIdioma(id, idioma);
    }

    @DeleteMapping("/{id}")
    public void borrarIdioma(@PathVariable Long id) {
        holaMundoService.borrarIdioma(id);
    }
}
