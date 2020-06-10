import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JavaBasicBoot {

  @Test
  public void test_Libro1() {
    System.out.println("Iniciando test_Libro1");
    JavaBasicBootClass test = new JavaBasicBootClass();
    System.out.println("El libro encontrado es: " + test.retornaNonmbreLibroPorId(1));
  }

  @Test
  public void test_Libro2() {
    System.out.println("Iniciando test_Libro2");
    JavaBasicBootClass test = new JavaBasicBootClass();
    System.out.println("El libro encontrado es: " + test.retornaNonmbreLibroPorId(2));
  }

}

