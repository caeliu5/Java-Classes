public class Counter{

    private int count=1;
    private int step=1;
    private final int MAX_COUNT=50;

    public void displayCount(){

      //No se muestra en CounterTest.java
        
      while (MAX_COUNT <= count ) {

          System.out.println(count);
          System.out.println("De aqui sale algo no?");
          count=count+step=1;
       }
            

    }
}
