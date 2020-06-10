import org.junit.Test;

public class PeliculaTest {
  @Test
  public void test_Pelicula1() {
    System.out.println("Iniciando test_Pelicula1");
    Pelicula test = new Pelicula();
    System.out.println("La pelicula encontrada es: " + test.retornaNombrePeliculaPorId(1));
  }

  @Test
  public void test_Pelicula2() {
    System.out.println("Iniciando test_Pelicula2");
    Pelicula test = new Pelicula();
    System.out.println("La pelicula encontrada es: " + test.retornaNombrePeliculaPorId(2));
  }

  @Test
  public void test_Pelicula3() {
    System.out.println("Iniciando test_Pelicula3");
    Pelicula test = new Pelicula();
    System.out.println("La pelicula encontrada es: " + test.retornaNombrePeliculaPorId(3));
  }

  @Test
  public void test_Pelicula4() {
    System.out.println("Iniciando test_Pelicula4");
    Pelicula test = new Pelicula();
    System.out.println("La pelicula encontrada es: " + test.retornaNombrePeliculaPorId(4));
  }
}
