package RetoInicial.HolaMundo.Idioma;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Idioma")
public class Idioma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String NOMBRE;
    
    @Column
    private String CODIGO;
    
    @Column
    private String SALUDO;
    
    public Idioma() {}
    
    public Idioma(String NOMBRE, String CODIGO, String SALUDO) {
        this.NOMBRE = NOMBRE;
        this.CODIGO = CODIGO;
        this.SALUDO = SALUDO;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNombre() {
        return NOMBRE;
    }
    
    public void setNombre(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }
    
    public String getCodigo() {
        return CODIGO;
    }
    
    public void setCodigo(String CODIGO) {
        this.CODIGO = CODIGO;
    }
    
    public String getSaludo() {
        return SALUDO;
    }
    
    public void setSaludo(String SALUDO) {
        this.SALUDO = SALUDO;
    }



}
	
	

	
	
	
	
	
	
	

