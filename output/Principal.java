public class Principal {
    public static void main(String args[]){
  
  try {
   Thread.sleep(1000);
  } catch (InterruptedException ex) {
            System.out.println("teste");
  }
        System.out.println("este é o metodo principal ");
        OutraClasse c = new OutraClasse();
  try {
   Thread.sleep(1000);
  } catch (InterruptedException ex) {
            System.out.println("teste");
  }
        c.Mensagem();
  try {
   Thread.sleep(1000);
  } catch (InterruptedException ex) {
            System.out.println("teste");
  }
        Parametro p = new Parametro();
        p.Mensagem("texto por parametro");
  try {
   Thread.sleep(1000);
  } catch (InterruptedException ex) {
            System.out.println("teste");
  }
        Explicacao e = new Explicacao();
        e.Mensagem();
  try {
   Thread.sleep(1000);
  } catch (InterruptedException ex) {
            System.out.println("teste");
  }
    }
}
