public class Main {
    public static void main(String[] args) {
        // ссылкка на приложение
        int clientOS = 0;
        int clientDeviceYear = 2017;
        if(clientOS == 0) {
            if(clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
            else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
            }
        else if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
            }
        }
    }