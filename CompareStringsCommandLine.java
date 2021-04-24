public class CompareStringsCommandLine {

    public static void main(String[] args) {
        String s1 = args[0]; // First Argument at Index 0
        String s2 = args[1]; // Second Argument at Index 1
        // Calling equals() method of String class
        // returns True if Strings are same, otherwise returns false
        if (s1.equals(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}