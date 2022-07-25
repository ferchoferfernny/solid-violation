public class Envio implements calculoTiempo  {

  String tipo;
  Integer precio;
  String tiempo;

  Envio(String tipo, Integer precio, String tiempo) {
    this.tipo = tipo;
    this.precio = precio;
    this.tiempo = tiempo;
  }

  String getTipoEnvio() {
    return this.tipo;
  }
}
public class gestionEnvios {
  
  public void crearTipoEnvio(Envio envio) {
    //Save Envio DB
  }
  
@Override
 public void showtiempoenprint (){
   System.out.println(this.tiempo)
 }
  
}
