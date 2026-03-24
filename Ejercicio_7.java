public class Ejercicio_7 {
    public static int cuad(int n) {
        // Caso base
        if (n == 1) {
            return 1;
        }
        // Caso recursivo
        return (2 * n - 1) + cuad(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(cuad(4));  // 16
        System.out.println(cuad(1));  // 1
        System.out.println(cuad(5));  // 25
    }
}

