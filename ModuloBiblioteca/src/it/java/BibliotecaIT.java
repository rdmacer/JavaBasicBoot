import org.junit.Test;

public class BibliotecaIT {
  @Test
  public void testBibliotecaIT_Libro1() {
    System.out.println("Iniciando testBibliotecaIT_Libro1");
    Libro test = new Libro();
    System.out.println("El libro encontrado es: " + test.retornaNombreLibroPorId(1));
  }

  @Test
  public void testBibliotecaIT_Libro2() {
    System.out.println("Iniciando testBibliotecaIT_Libro2");
    Libro test = new Libro();
    System.out.println("El libro encontrado es: " + test.retornaNombreLibroPorId(2));
  }

  @Test
  public void testBibliotecaIT_Libro3() {
    System.out.println("Iniciando testBibliotecaIT_Libro3");
    Libro test = new Libro();
    System.out.println("El libro encontrado es: " + test.retornaNombreLibroPorId(3));
  }

  @Test
  public void testBibliotecaIT_Libro4() {
    System.out.println("Iniciando testBibliotecaIT_Libro4");
    Libro test = new Libro();
    System.out.println("El libro encontrado es: " + test.retornaNombreLibroPorId(4));
  }
}
