package dp.tdtu.singletonlogger;

public class SingletonLogger {

   //create an object of SingleObject
   private static SingletonLogger instance = new SingletonLogger();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingletonLogger(){}

   //Get the only object available
   public static SingletonLogger getInstance(){
      return instance;
   }

   public void log(String message){
      System.out.println(message);
   }
}