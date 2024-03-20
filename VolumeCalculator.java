class VolumeCalculator {
    // Overloaded methods to calculate the volume of different shapes
    public double calculateVolume(int side) {
        return Math.pow(side, 3); // Volume of a cube
    }

    public double calculateVolume(int length, int breadth, int height) {
        return length * breadth * height; // Volume of a rectangular prism
    }

    public double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height; // Volume of a cylinder
    }

    public static void main(String[] args) {
        VolumeCalculator calc = new VolumeCalculator();
        System.out.println("Volume of cube: " + calc.calculateVolume(5));
        System.out.println("Volume of rectangular prism: " + calc.calculateVolume(4, 6, 3));
        System.out.println("Volume of cylinder: " + calc.calculateVolume(3.5, 7));
    }
}
