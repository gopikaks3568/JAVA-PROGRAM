import java.util.Random;

class RandonThread extends Thread {
    public void run() {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int n = r.nextInt(100); // i will get a value between 0 and 100
            System.out.println("The generated number:"+n);
            if (n % 2 == 0) {
                new Even(n).start();
            } else {
                new Odd(n).start();
            }
        }
    }
}

class Even extends Thread {
    private int num;

    public Even(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Square of " + num + " =" + num * num);
    }
}

class Odd extends Thread {
    private int num;

    public Odd(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Cube of " + num + " =" + num * num * num);
    }
}

class multithredding{
    public static void main(String args[]) {
        RandonThread r = new RandonThread();
        r.start();
    }
}