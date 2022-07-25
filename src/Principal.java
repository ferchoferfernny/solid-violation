public class Principal {

  public static void main(String[] args) {
    Envio[] envios = {
        new Envio("Municipal",5000,"Tiempo envio 12 horas"),
        new Envio("Intermunicipal",15000,"Tiempo envio 36 horas"),
        new Envio("Internacional",25000, "Tiempo envio 90 horas")
    };
    imprimirTiempoDeEnvio(envios);
    imprimirTiempoDeEnvio(envios);
  }

  public static void imprimirTiempoDeEnvio(Envio[] envios){
    for (Envio coche : envios) {
      showtiempoenprint ()
    }
  }
}
