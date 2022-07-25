public class Envio {

  String tipo;
  Integer precio;

  Envio(String tipo, Integer precio) {
    this.tipo = tipo;
    this.precio = precio;
  }

  String getTipoEnvio() {
    return this.tipo;
  }
}
public class gestionEnvios {
  
  public void crearTipoEnvio(Envio envio) {
    //Save Envio DB
  }
}
