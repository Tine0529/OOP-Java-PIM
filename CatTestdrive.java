// คลาส Cat
class Cat {
    
    // Attributes (คุณลักษณะ)
    String voice;
    String furcolor;
    String eyecolor;
    int weight;
    String breed;
    String name;
    
    // Methods (พฤติกรรม)
    void sleep() {
        System.out.println(name + " is sleeping");
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void scratch() {
        System.out.println(name + " is scratching");
    }

    void bite() {
        System.out.println(name + " is biting");
    }
}

// คลาสทดสอบ Cat
public class CatTestdrive {
    
    public static void main(String[] args) {
        
        // สร้างวัตถุแมว
        Cat khaikhaw = new Cat(); 
        khaikhaw.name = "ไข่ขาว";
        khaikhaw.furcolor = "white";
        khaikhaw.eyecolor = "skyblue";
        khaikhaw.weight = 4;
        khaikhaw.breed = "Persian";
        khaikhaw.voice = "Meow";

        // แสดงคุณลักษณะ
        System.out.println("ชื่อแมว: " + khaikhaw.name);
        System.out.println("สีขน: " + khaikhaw.furcolor);
        System.out.println("สีตา: " + khaikhaw.eyecolor);
        System.out.println("น้ำหนัก: " + khaikhaw.weight + " kg");
        System.out.println("สายพันธุ์: " + khaikhaw.breed);
        System.out.println("เสียง: " + khaikhaw.voice);

    
    }
}
