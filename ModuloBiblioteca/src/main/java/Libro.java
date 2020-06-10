public class Libro {

  private String nombreLibro;

  public String retornaNombreLibroPorId(Integer Id) {

    switch (Id) {
    case 1:
      nombreLibro = "The Rise of the Empire";
      break;
    case 2:
      nombreLibro = "Game of Thrones";
      break;
    case 3:
      nombreLibro = "Lord of the Rings";
      break;
    default:
      nombreLibro = "Libro no encontrado";
    }
    return nombreLibro;
  }

}
