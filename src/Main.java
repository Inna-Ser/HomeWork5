public class Main {
    public static void main(String[] args) {
        // ссылкка на приложение
        int clientOS = 0;
        int clientDeviceYear = 2010;
        boolean a = clientDeviceYear >= 2015;
        if (a) {
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке.");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке.");
                break;
        }
        }
        if (!a) {
        switch (clientOS) {
            case 0:
                System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
                break;
            case 1:
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                break;
        }
        }
    }
}