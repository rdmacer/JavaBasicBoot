public class Pelicula {

  private String nombrePelicula;

  public String retornaNombrePeliculaPorId(Integer Id) {

    switch (Id) {
    case 1:
      nombrePelicula = "Return of the Jedi";
      break;
    case 2:
      nombrePelicula = "Avengers";
      break;
    case 3:
      nombrePelicula = "Inception";
      break;
    default:
      nombrePelicula = "Pelicula no encontrada";
    }
    return nombrePelicula;
  }
}
