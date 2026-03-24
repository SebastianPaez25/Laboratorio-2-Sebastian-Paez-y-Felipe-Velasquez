public class Ejercicio_6 {
    
    public static int sumPares(int n) {
        // Caso base
        if (n <= 0) {
            return 0;
        }
        // Caso recursivo
        if (n % 2 != 0) {
            return sumPares(n - 1);
        }
        // Caso recursivo
        return n + sumPares(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(sumPares(10)); // 30
        System.out.println(sumPares(5));  // 6
    }
}