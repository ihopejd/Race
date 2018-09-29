package AnimalThread;

import java.lang.InterruptedException;

public class AnimalThread extends Thread {
    AnimalThread(String name, int priority){
        setName(name);
        setPriority(priority);
    }

    //Цикл для потока и смена приоритета потока.

    @Override
    public void run(){
        System.out.printf("%s. Приоритет: %s \n", getName(), getPriority());
        System.out.println();

        for(int i = 0; i <= 50000; i++){
            if(i % 10000 == 0){
                System.out.printf("%s прошел %d метров \n", getName(), i);
            }
            if( i % 100000 == 0){
                if(getPriority() == 10){
                    setPriority(1);
                    System.out.printf("%s приоритет = %d \n", getName(), getPriority());
                } else {
                    setPriority(10);
                    System.out.printf("%s приоритет = %d \n", getName(), getPriority());
                }
            }
        }
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
