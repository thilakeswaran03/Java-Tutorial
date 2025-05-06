public class Multithread extends Thread {
    public static void main(String[] args) {
        Multithread multithread = new Multithread();
        multithread.start();

        Multithread multithread2 = new Multithread();
        multithread2.start();

        Multithread multithread3 = new Multithread();
        multithread3.start();
    }

    @Override

    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Thread " + Thread.currentThread().getName() + " is running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
