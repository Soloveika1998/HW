public class Task3 {
    public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 1;
       System.out.println(a / b);
       printSum(1, 234);
       int[] abc = { 1, 2, 3};
       abc[3] = 9;
    //Здесь при вызове catch не нужно было первый exception делать Throwable, так как последующий смысл в проверках
    //исключений не имеет смысла.
   } catch (ArithmeticException ex) {
       System.out.println("Делить на 0 нельзя");
   }catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
//Метод printSum может бросить исключение FileNotFoundException, которое не может относится к возможным проблемам
//в данном методе, так как оно связано с работой с файлами, а у нас с методе такой работы нет! 
//Можно заменить на ArithmeticException
public static void printSum(Integer a, Integer b) throws ArithmeticException {
   System.out.println(a + b);
}

}
