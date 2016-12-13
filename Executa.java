public class Executa{
  public static void main(String[] args) throws InterruptedException{
    Agendador agendador = new Agendador();
    if(agendador.podeExecutar(2016, 12, 12, 22, 55, 0)){
      System.out.println("CHAMAR TAREFA XPTO");
    } else {
      System.out.println("Erro");
    }
  }
}
