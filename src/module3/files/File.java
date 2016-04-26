package module3.files;

/**
 * Trying to create all connections btwn classes
 */
public class File {
    private int size;
    private String name;
    private int age;

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public File(int size, String name, int age) {
        this.size = size;
        this.name = name;
        this.age = age;
    }
}


