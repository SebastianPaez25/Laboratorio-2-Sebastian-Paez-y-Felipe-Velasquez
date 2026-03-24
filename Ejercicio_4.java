public class Ejercicio_4 {

    public static int mult(int a, int b) {
        // Caso base
        if (b == 0) {
            return 0;
        }
        // Caso recursivo
        return a + mult(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 4, b = 3;
        System.out.println("Resultado: " + mult(a, b));
    }
}