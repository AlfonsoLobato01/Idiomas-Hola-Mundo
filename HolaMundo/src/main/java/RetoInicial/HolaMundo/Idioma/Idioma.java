package RetoInicial.HolaMundo.Idioma;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Idioma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    
    private String codigo;
    
    private String saludo;
    
    public Idioma() {}
    
    public Idioma(String nombre, String codigo, String saludo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.saludo = saludo;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getSaludo() {
        return saludo;
    }
    
    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }



}
	
	

	
	
	
	
	
	
	

