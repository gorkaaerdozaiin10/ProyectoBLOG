
public class Post {

	private String Titulo = "";
	private String Autor = "";
    private String Fecha = "";
    
    public Post( String titulo, String autor, String fecha) {
        this.Titulo = titulo;
        this.Autor = autor;
        this.Fecha = fecha;
    }

    public Post() {
    }
    
    public String getAutor() {
        return Autor;
    }
    
    public void setAutor(String autor) {
        this.Autor = autor;
    }
    
    public String getTitulo() {
        return Titulo;
    }
    
    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }
    
    public String getFecha() {
        return Fecha;
    }
    
    public void setFecha(String fecha) {
        this.Fecha = fecha;
    }

    public String toString() {
        return "Post [Autor=" + Autor + ", Titulo=" + Titulo + ", Fecha=" + Fecha + "]";
    }
	
}
