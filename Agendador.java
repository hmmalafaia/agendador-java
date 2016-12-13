import java.util.Calendar;
public class Agendador{
  public boolean podeExecutar(int ano, int mes, int dia, int hora, int minuto, int segundo) throws InterruptedException{
  Calendar dataAgendada = Calendar.getInstance();
  dataAgendada.set(ano, mes-1, dia, hora, minuto, segundo);
  System.out.println(dataAgendada.getTime());
  boolean tentarNovamente = true;
  while(tentarNovamente){
    Calendar dataAtual = Calendar.getInstance();
      if(dataAtual.getTime().before(dataAgendada.getTime())){
        System.out.println("Ainda nao chegou a hora");
        System.out.println("Agendado para: " + dataAgendada.getTime());
        System.out.println("Horario Atual: " + dataAtual.getTime());
        System.out.println("Vou aguardar 60 segundos");
        Thread.currentThread().sleep(60 * 1000);
      } else {
        System.out.println("Chegou a hora");
        tentarNovamente = false;
        return true;
      }
  }
  return false;
  }
}
