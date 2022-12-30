public class Main {


    public static void main(String[] args) {
          task1();
          task2();
    }
    public static void printYesYear(){
        System.out.println( " год - високосный год");
    }
    public static void  printNoYear(){
        System.out.println(" год - невисокосный год");
    }

     public static void task1() {
      System.out.println("Задача №1");
       int year = 2022;
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        // System.out.print(year); printYesYear();
      } else  {
          System.out.print(year); printNoYear();
        }
       }
      public static void task2(){
         System.out.println("Задача №2");
        int clientDeviceYear = 2016;
        int clientOs = 0;
       if (clientOs == 0 && clientDeviceYear < 2015) {
           System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if ( clientOs == 1 && clientDeviceYear >= 2015) {
             System.out.println("Установите облегченную версию приложения для Android по ссылке");
         } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите предложение для ios");
         } else  {
            System.out.println("Установите приложение для Android");
         }
         }

}

