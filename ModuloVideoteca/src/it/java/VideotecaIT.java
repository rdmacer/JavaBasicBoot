import org.junit.Test;

public class VideotecaIT {
  @Test
  public void testVideotecaIT_Pelicula1() {
    System.out.println("Iniciando testVideotecaIT_Pelicula1");
    Pelicula test = new Pelicula();
    System.out.println("La pelicula encontrada es: " + test.retornaNombrePeliculaPorId(1));
  }

  @Test
  public void testVideotecaIT_Pelicula2() {
    System.out.println("Iniciando testVideotecaIT_Pelicula2");
    Pelicula test = new Pelicula();
    System.out.println("La pelicula encontrada es: " + test.retornaNombrePeliculaPorId(2));
  }

  @Test
  public void testVideotecaIT_Pelicula3() {
    System.out.println("Iniciando testVideotecaIT_Pelicula3");
    Pelicula test = new Pelicula();
    System.out.println("La pelicula encontrada es: " + test.retornaNombrePeliculaPorId(3));
  }

  @Test
  public void testVideotecaIT_Pelicula4() {
    System.out.println("Iniciando testVideotecaIT_Pelicula4");
    Pelicula test = new Pelicula();
    System.out.println("La pelicula encontrada es: " + test.retornaNombrePeliculaPorId(4));
  }
}
