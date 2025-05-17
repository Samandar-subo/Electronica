import java.util.ArrayList;
public class Save {


    ArrayList<Phone> phones;
    ArrayList<Laptop> laptops;
    ArrayList<SmartWhach> smartWhaches;
    ArrayList<Headphones> headphones;

    public Save() {
        phones = new ArrayList<>();
        laptops = new ArrayList<>();
        smartWhaches = new ArrayList<>();
        headphones = new ArrayList<>();

        // for phone

        // Iphones
        phones.add(new Phone("Iphone 11 pro", 2019, 240000, 5));
        phones.add(new Phone("Iphone 12 pro", 2020, 340000, 5));
        phones.add(new Phone("Iphone 13 pro", 2021, 440000, 5));
        phones.add(new Phone("Iphone 14 pro", 2022, 500000, 5));
        phones.add(new Phone("Iphone 15 pro", 2023, 550000, 5));
        phones.add(new Phone("Iphone 16 pro", 2024, 600000, 5));

        //Samsung
        phones.add(new Phone("Samsung Galaxy S25 Ultra", 2025, 757734, 7));
        phones.add(new Phone("Samsung Galaxy A56 5G", 2025, 322910, 7));
        phones.add(new Phone("Samsung Galaxy S24", 2024, 244175, 7));
        phones.add(new Phone("Samsung Galaxy S25", 2025, 540000, 5));
        phones.add(new Phone("Samsung Galaxy S24 FE", 2024, 277045, 3));

        //Xiaumi
        phones.add(new Phone("Xiaomi 15 Ultra", 2025, 700000, 9));
        phones.add(new Phone("Xiaomi 15", 2025, 500000, 12));
        phones.add(new Phone("Xiaomi 14T Pro", 2024, 234000, 8));
        phones.add(new Phone("Xiaomi Civi 4 Pro", 2025, 175000, 14));
        phones.add(new Phone("Xiaomi Poco F7 Ultra", 2025, 243000, 6));


        // for Laptop

        // Asus
        laptops.add(new Laptop("ASUS Zenbook A14 (UX3407)",  2025, 450000, 7));
        laptops.add(new Laptop("ASUS Zenbook Duo (UX8406)", 2025, 700000, 7));
        laptops.add(new Laptop("ASUS Zenbook S16 (UX5606 / UM5606)", 2025, 600000, 7));
        laptops.add(new Laptop("ASUS ROG Zephyrus G14 (2025)", 2025, 1000000, 7));
        laptops.add(new Laptop("ASUS ROG Flow Z13 (2025)", 2025, 800000, 7));

        // Hp
        laptops.add(new Laptop("Hp ZBook Ultra 14 G1a", 2025, 1200000, 8));
        laptops.add(new Laptop("Hp EliteBook Ultra G1i", 2025, 900000, 10));
        laptops.add(new Laptop("Hp OMEN Max 16", 2025, 1800000, 6));
        laptops.add(new Laptop("Hp 255 G10", 2025, 300000, 4));
        laptops.add(new Laptop("Hp Envy x360 14 (2025)", 2025, 400000, 11));

        // Mac
        laptops.add(new Laptop("MacBook Air 13 (M4, 2025)", 2025, 600000, 6));
        laptops.add(new Laptop("MacBook Air 15 (M4, 2025)", 2025, 700000, 7));
        laptops.add(new Laptop("MacBook Pro 14 (M4 Pro, 2025)", 2025, 1200000, 9));
        laptops.add(new Laptop("MacBook Pro 16 (M4 Max, 2025)", 2025, 1800000, 4));
        laptops.add(new Laptop("MacBook Pro 13 (M3, 2025)", 2025, 700000, 7));


        // for HEADPHONES

        // Air pods
        headphones.add(new Headphones("AirPods Pro (2-го поколения, USB-C)", 2023, 249000, 10));
        headphones.add(new Headphones("AirPods Max (USB-C)", 2024, 549000, 7));
        headphones.add(new Headphones("AirPods (4-го поколения)", 2024, 129000, 13));
        headphones.add(new Headphones("AirPods (4-го поколения) с активным шумоподавлением", 2024, 179000, 9));
        headphones.add(new Headphones("AirPods (3-го поколения)", 2021, 119000, 9));

        // Sony
        headphones.add(new Headphones("Sony WF-1000XM5", 2023, 298000, 5));
        headphones.add(new Headphones("Sony WF-1000XM4", 2021, 250000, 6));
        headphones.add(new Headphones("Sony WF-SP800N", 2020, 200000, 4));
        headphones.add(new Headphones("Sony WF-C500", 2021, 150000, 5));
        headphones.add(new Headphones("Sony LinkBuds S", 2022, 180000, 10));

        // Bose
        headphones.add(new Headphones("Bose QuietComfort Earbuds II", 2022, 250000, 7));
        headphones.add(new Headphones("Bose Sport Earbuds", 2020, 180000, 5));
        headphones.add(new Headphones("Bose SoundSport Free", 2017, 150000, 7));
        headphones.add(new Headphones("Bose QuietComfort 45", 2021, 300000, 9));
        headphones.add(new Headphones("Bose Noise Cancelling Headphones 700", 2019, 350000, 3));


        // for Smart Watch

        // Apple watch
        smartWhaches.add(new SmartWhach("Apple Watch Series 10", "all colors", 2024, 399000, 6));
        smartWhaches.add(new SmartWhach("Apple Watch Ultra 2", "all colors", 2023, 549000, 8));
        smartWhaches.add(new SmartWhach("Apple Watch Series 9", "all colors", 2023, 319733, 5));
        smartWhaches.add(new SmartWhach("Apple Watch Series 8", "all colors", 2022, 250000, 8));
        smartWhaches.add(new SmartWhach("Apple Watch SE (2-го поколения)", "all colors", 2022, 156000, 9));

        //Samsung

        smartWhaches.add(new SmartWhach("Samsung Galaxy Watch 6 Classic", "all color", 2023, 214000, 7));
        smartWhaches.add(new SmartWhach("Samsung Galaxy Watch 5 Pro", "all color", 2022, 158000, 6));
        smartWhaches.add(new SmartWhach("Samsung Galaxy Watch 4 Classic", "all color", 2021, 214000, 4));
        smartWhaches.add(new SmartWhach("Samsung Galaxy Watch 3", "all color", 2020, 180000, 9));
        smartWhaches.add(new SmartWhach("Samsung Galaxy Watch Active 2", "all colors", 2019, 72000, 10));

        //Huawei

        smartWhaches.add(new SmartWhach("Huawei Watch GT 3 Pro", " all colors", 2022, 294000, 5));
        smartWhaches.add(new SmartWhach("Huawei Watch GT 3", " all colors", 2021, 134750, 9));
        smartWhaches.add(new SmartWhach("Huawei Huawei Watch Fit 3", "all colors", 2024, 46800, 10));
        smartWhaches.add(new SmartWhach("Huawei Watch D", " all colors", 2022, 200000, 4));
        smartWhaches.add(new SmartWhach("Huawei Watch 4 Pro", "all colors", 2023, 232200, 5));


    }
}
