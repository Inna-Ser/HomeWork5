public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        boolean IOS = clientOS == 0;
        if (IOS) {System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        }
}