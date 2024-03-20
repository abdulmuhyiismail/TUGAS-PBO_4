class Printer {
    void display() {
        System.out.println("Displaying content");
    }
}

class DotMatrixPrinter extends Printer {
    // Method overriding to display content specific to dot matrix printers
    @Override
    void display() {
        System.out.println("Displaying content in dot matrix format");
    }
}

class LaserPrinter extends Printer {
    // Method overriding to display content specific to laser printers
    @Override
    void display() {
        System.out.println("Displaying content in high-resolution laser print format");
    }
}

public class PrinterTest {
    public static void main(String[] args) {
        Printer dotMatrix = new DotMatrixPrinter();
        Printer laser = new LaserPrinter();

        dotMatrix.display(); // Will print "Displaying content in dot matrix format"
        laser.display(); // Will print "Displaying content in high-resolution laser print format"
    }
}