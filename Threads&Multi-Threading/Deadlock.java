// Main class
public class DeadLock {

    public static void main(String[] args) {
        Library sharedLibrary = new Library();

        Multiple m = new Multiple(sharedLibrary);
        Multiple2 m2 = new Multiple2(sharedLibrary);

        m2.start();
        m.start();
    }
}

// To run multiple class with same object to get DeadLock error
class Multiple extends Thread {
    Library li1;
    public Multiple(Library lib) {
        this.li1 = lib;
    }
    public void run() {
        try {
            li1.readBook();		
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Multiple2 extends Thread {
    Library li1;
    public Multiple2(Library lib) {
        this.li1 = lib;
    }
    public void run() {
        try {
            li1.readBook2();		
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// order of accesing data in sequence
class Library {
    String Book1 = "Java";
    String Book2 = "Python";
    String Book3 = "SQL";

    public void readBook() throws InterruptedException {
        synchronized(Book1) {
            System.out.println("reading The book from lib 1 book1: " + Book1);
            Thread.sleep(1000);
            synchronized(Book2) {
                System.out.println("reading The book from lib 1 book2: " + Book2);
                Thread.sleep(1000);
                synchronized(Book3) {
                    System.out.println("reading The book from lib 1 book3: " + Book3);
                    Thread.sleep(1000);
                }
            }
        }
    }
// order of accesing data in reverse
    public void readBook2() throws InterruptedException {
        synchronized(Book3) {
            System.out.println("reading The book from lib 2 book1: " + Book3);
            Thread.sleep(1000);
            synchronized(Book2) {
                System.out.println("reading The book from lib 2 book2: " + Book2);
                Thread.sleep(1000);
                synchronized(Book1) {
                    System.out.println("reading The book from lib 2 book3: " + Book1);
                    Thread.sleep(1000);
                }
            }
        }
    }
}
