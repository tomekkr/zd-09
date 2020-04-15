public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(11, 60, 61);
        Operations operations = new Operations();

        boolean result = operations.isRightTriangle(triangle);
        System.out.println("Czy ten trójkąt jest prostokątny? " + result);
    }
}
