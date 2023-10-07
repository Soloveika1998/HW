public class Task2 {
    public static void main(String[] args) {
        // В этом коде можно ограничиться использованием if или while, чтобы не нагружать программу try catch
        // так как ислючение, выбрасываемое try catch, относится к RunTimeExcepcion 
        double [] intArray = {1,2,3,4,5,6,7,8,9,10};
        int d = 1;
        if (d == 0) {
            System.out.println("Введите валидное число ");
        }
        else {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }   
    }  
}
