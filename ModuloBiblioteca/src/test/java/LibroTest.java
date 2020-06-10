import org.junit.Test;

public class LibroTest {

  @Test
  public void test_Libro1() {
    System.out.println("Iniciando test_Libro1");
    Libro test = new Libro();
    System.out.println("El libro encontrado es: " + test.retornaNombreLibroPorId(1));
  }

  @Test
  public void test_Libro2() {
    System.out.println("Iniciando test_Libro2");
    Libro test = new Libro();
    System.out.println("El libro encontrado es: " + test.retornaNombreLibroPorId(2));
  }
}
