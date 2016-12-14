public class Executa{
  public static void main(String[] args) throws InterruptedException{
    Agendador agendador = new Agendador();
                                 //Ano, Mes, Dia, Hora, Minuto, Segundo
    while(!agendador.podeExecutar(2016, 12, 13, 22, 23, 0)){
              Thread.currentThread().sleep(60 * 1000);
    }
    System.out.println("TimesUP");
  }
}
