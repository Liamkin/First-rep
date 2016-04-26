package firstobject;

/**
 * Created by miroslavlyamkin on 27.01.16.
 *
 * Создано с помощью инструкции по адресу
 * http://gooodjava.blogspot.com/2013_07_01_archive.html
 */

public class firstclass {

    private double weight;
    private String name;
    private int ram;
    private int mem;

//    public firstclass (String name, double weight, int ram, int mem) {
//        // Теперь мы можем прописать значение переменных как свойства конструктора
//        // при обращении к нему через запятую в том же порядке, в котором они здесь обозначены.
//        this.name = name;
//        this.weight = weight;
//        this.ram = ram;
//        this.mem = mem;
//    }

    // Либо мы можем прописать геттеры и сеттеры для доступа к ЗНАЧЕНИЯМ приватных переменных извне данного класса.
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public int getRam() {
        return ram;
    }
    public int getMem() {
        return mem;
    }

    public void setName (String newName) {
        name = newName;
    }

    public void setWeight(double newWeight) {
        if (newWeight > 0) {
            this.weight = newWeight;
        } else {
            System.out.println("value can not be less than zero");
        }
    }

    public void setRam(int newRam) {
        if (newRam > 0) {
            this.ram = newRam;
        } else {
            System.out.println("value can not be less than zero");
        }
    }

    public void setMem(int newMem) {
        if (newMem > 0) {
            this.mem = newMem;
        } else {
            System.out.println("value can not be less than zero");
        }
    }
    // А это методы, которые мы используем в данном классе.
    // Их можно использовать в других классах через вызов из объекта этого класса.
    // Пример такого вызова в helloworld.
    public void on() {
        print("I'm on " + ram);
    }

    public void off() { print("I'm off " + weight +" "+ mem);
    }

    public void load() {
        print("I'm loading " + name);
    }

    private void print (String str) {  //incapsulating printing method
        System.out.println(str);
    }

}
