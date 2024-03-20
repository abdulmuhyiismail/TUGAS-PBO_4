class StringManipulator {
    // Overloaded methods to manipulate strings in different ways
    public String manipulate(String str) {
        return str.toUpperCase(); // Convert string to uppercase
    }

    public String manipulate(String str, int startIndex) {
        return str.substring(startIndex); // Get substring starting from the given index
    }

    public String manipulate(String str, String replacement) {
        return str.replaceAll("\\s+", replacement); // Replace spaces with the given string
    }

    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        System.out.println("Uppercase string: " + manipulator.manipulate("hello"));
        System.out.println("Substring: " + manipulator.manipulate("hello world", 6));
        System.out.println("Replaced string: " + manipulator.manipulate("hello world", "_"));
    }
}
