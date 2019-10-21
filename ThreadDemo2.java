
class Bye implements Runnable{
public void run(){
    for(int i=1; i <=5; i++){
        System.out.println("Bye");

        try{
            Thread.sleep(1000);
        } 
        catch(Exception e){}
    }
}
}

class GoodBye implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("GoodBye");

            try{
                Thread.sleep(1000);
            } 
            catch(Exception e){}
        }
    }
}

public class ThreadDemo2{
    public static void main (String [] args){

       Runnable obj1 = new Bye();
       Runnable obj2 = new GoodBye();

       Thread t1 = new Thread(obj1);
       Thread t2 = new Thread(obj2);

        t1.start();
       try{
           Thread.sleep(1000);
       }
       catch(Exception e){};
       t2.start();
    }
    
}