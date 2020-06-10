import org.junit.Test;

public class PeliculaTest {
  @Test
  public void test_Pelicula1() {
    System.out.println("Iniciando test_Libro1");
    Pelicula test = new Pelicula();
    System.out.println("La pelicula encontrada es: " + test.retornaNombrePeliculaPorId(1));
  }

  @Test
  public void test_Pelicula3() {
    System.out.println("Iniciando test_Libro3");
    Pelicula test = new Pelicula();
    System.out.println("La pelicula encontrada es: " + test.retornaNombrePeliculaPorId(3));
  }
}
