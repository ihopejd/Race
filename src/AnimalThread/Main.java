package AnimalThread;

//Запускает потоки
public class Main{
    public static void main(String[]args){
        new AnimalThread("Turtle", 1).start();
        new AnimalThread("Rabbit", 10).start();
    }
}
