import org.junit.Test;

public class JavaBasicBoot {

  @Test
  public void test_1() {
    System.out.println("Iniciando test_1");
    JavaBasicBootClass test = new JavaBasicBootClass();
    System.out.println("El libro encontrado es: " + test.retornaNonmbreLibroPorId(1));
  }

  @Test
  public void test_2() {
    System.out.println("Iniciando test_2");
    JavaBasicBootClass test = new JavaBasicBootClass();
    System.out.println("El libro encontrado es: " + test.retornaNonmbreLibroPorId(2));
  }

}

