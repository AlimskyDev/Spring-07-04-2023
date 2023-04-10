package kz.g111.spring.task11.Db;

import kz.g111.spring.task11.Models.Item;

import java.util.ArrayList;

public class Db {
    public static ArrayList<Item> items = new ArrayList<>();

    static {
        items.add(new Item(1L, "HP", "Ноутбук/Core i5/DOS/15.6/1920x1080px/Intel", 312739.0));
        items.add(new Item(2L, "Samsung Galaxy S21", "Смартфон/128GB/8GB RAM/Exynos 2100/6.2''/1080x2400px/5G", 74990.10));
        items.add(new Item(3L, "Apple MacBook Air", "Ноутбук/M1/512GB SSD/8GB RAM/MacOS/13.3''/2560x1600px", 99990.5));
        items.add(new Item(4L, "Sony WH-1000XM4", "Наушники/Bluetooth/ANC/30ч работы/черный", 25990.15));
        items.add(new Item(5L, "LG 55CX", "Телевизор/OLED/4K/Ultra HD/HDR10+/WebOS 5.0/55''", 99990.3));
        items.add(new Item(6L, "Canon EOS R6", "Камера/Full-Frame/20.1 МП/4K/ISO 102400/встроенный WiFi", 184990.2));
        items.add(new Item(7L, "ASUS ZenBook Pro Duo", "Ноутбук/Core i9/32GB RAM/1TB SSD/Win 10 Pro/15.6'' 4K OLED/14'' 4K ScreenPad Plus", 324990.0));
        items.add(new Item(8L, "Apple MacBook Pro", "Ноутбук/M1 Pro/16GB RAM/1TB SSD/MacOS/14''/3024x1964px", 219990.0));
        items.add(new Item(9L, "Dell XPS 13", "Ноутбук/Core i7/16GB RAM/1TB SSD/Win 10/13.4''/1920x1200px", 152891.50));
        items.add(new Item(10L, "HP Spectre x360", "Ноутбук/Core i7/16GB RAM/1TB SSD/Win 10/13.3''/1920x1080px", 168490.0));
        items.add(new Item(11L, "Lenovo ThinkPad X1 Carbon", "Ноутбук/Core i7/16GB RAM/1TB SSD/Win 10 Pro/14''/1920x1080px", 189990.0));
        items.add(new Item(12L, "MSI Creator Z16", "Ноутбук/Core i9/32GB RAM/1TB SSD/Win 10 Pro/16'' 4K mini-LED", 254990.0));
        items.add(new Item(13L, "Acer Predator Helios 500", "Игровой ноутбук/Core i9/32GB RAM/2TB SSD/Win 10/17.3''/1920x1080px/RTX 3080", 379990.0));
        items.add(new Item(14L, "Razer Blade Pro 17", "Игровой ноутбук/Core i7/16GB RAM/1TB SSD/Win 10 Pro/17.3''/1920x1080px/RTX 3060", 199990.0));
        items.add(new Item(15L, "Gigabyte Aorus 17G", "Игровой ноутбук/Core i7/16GB RAM/1TB SSD/Win 10/17.3''/1920x1080px/RTX 3070", 184990.0));
        items.add(new Item(16L, "Asus ROG Zephyrus G15", "Игровой ноутбук/Ryzen 9/16GB RAM/1TB SSD/Win 10/15.6''/1920x1080px/RTX 3060", 154990.02));
        items.add(new Item(17L, "HP Omen X 2S", "Игровой ноутбук/Core i9/32GB RAM/1TB SSD/Win 10/15.6''/1920x1080px/RTX 2080", 289990.0));
    }

    public static ArrayList<Item> getItems() {
        return items;
    }
    public static Item getItem(Long id){
        for (Item i : items) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }
    private static Long id = 18L;
    public static void addItem(Item item) {
        item.setId(id);
        items.add(item);
        id++;
    }
}
