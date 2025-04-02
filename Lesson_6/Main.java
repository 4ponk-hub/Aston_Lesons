package Lesson_6;

class Product {
    String name;
    String productionDate;
    String manufacturer;
    String country;
    int price;
    boolean isBooked;

    public Product(String name, String productionDate, String manufacturer, String country, int price, boolean isBooked) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isBooked = isBooked;
    }

    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + country);
        System.out.println("Цена: " + price + "₽");
        System.out.println("Забронирован: " + (isBooked ? "Да" : "Нет"));
        System.out.println("-----------------------------");
    }
}

class Park {
    class Attraction {
        String name;
        String workingHours;
        int price;

        public Attraction(String name, String workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + "₽");
            System.out.println("-----------------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Массив товаров
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 16 Pro", "15.03.2025", "Apple Inc.", "USA", 9999, false);
        productsArray[2] = new Product("Xiaomi Mi 15", "20.01.2025", "Xiaomi Ltd.", "China", 3999, true);
        productsArray[3] = new Product("Sony Xperia Z", "10.12.2024", "Sony Corp.", "Japan", 4599, false);
        productsArray[4] = new Product("Huawei Nova 12", "05.02.2025", "Huawei Tech.", "China", 4299, true);

        System.out.println("Информация о товарах:");
        for (Product product : productsArray) {
            product.printInfo();
        }

        // Аттракцион
        Park park = new Park();
        Park.Attraction attraction = park.new Attraction("Американские горки", "10:00 - 20:00", 500);
        System.out.println("Информация об аттракционе:");
        attraction.printInfo();
    }
}
