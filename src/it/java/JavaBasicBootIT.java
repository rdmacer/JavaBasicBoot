import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaBasicBootIT {

  @Test
  public void test_1() {
    System.out.println("Iniciando test_1");

    String template = "/controller/{CustomerId}/somethingElse/";
    Object replacements = "33";
    Pattern pattern = Pattern.compile("\\{(.+?)}");
    Matcher matcher = pattern.matcher(template);
    StringBuffer buffer = new StringBuffer();
    int index = 0;
    while (matcher.find()) {
      /*if (index >= replacements.length) {
        continue;
      }*/
      Object replacement = replacements;
      matcher.appendReplacement(buffer, replacement != null ? Matcher.quoteReplacement(replacement.toString()) : "null");
    }
    matcher.appendTail(buffer);
    // return buffer.toString();
    System.out.println(buffer.toString());
  }
}
