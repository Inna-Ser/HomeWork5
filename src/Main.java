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
        // Высокосный год
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным.");
            }
        else {
            System.out.println(year + " год не является високосным.");
        }
        // Доставка карт
        int deliveryDistance = 81;
        int distanceStep = 40;
        if (deliveryDistance < 20) {
            System.out.println("Доставка карты займет одни сутки.");
        }
        else if (deliveryDistance >= 20 && deliveryDistance <= 20 + distanceStep) {
            System.out.println("Доставка карты займет двое суток.");
        }
        else if (deliveryDistance >= 20 + (distanceStep * 1) && deliveryDistance <= 20 + (distanceStep * 2)) {
            System.out.println("Доставка карты займет трое суток.");
        }
        else {
            System.out.println("Доставки нет.");
        }
        // Времена года
        int monthNumber = 15;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Время года - зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года - весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года - лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года - осень.");
                break;
            default: System.out.println("Такого месяца не существует.");
        }
    }
}
