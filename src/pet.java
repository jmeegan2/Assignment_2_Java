public class pet {
    private String name;
    private int age;
    private double weight;          //Attributes for the animals at the clinic
    private String type;
    private String breed;


    public pet() {

    }


    public pet(String name, int age, double weight, String type, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;
        this.breed = breed;
    }

    //return the name
    public String getName() {
        return name;
    }

    // name parameter is set
    public void setName(String name) {
        this.name = name;
    }

    //return the age
    public int getAge() {
        return age;
    }

    // age parameter is set
    public void setAge(int age) {
        this.age = age;
    }

    //return the weight
    public double getWeight() {
        return weight;
    }

    // weight parameter is set
    public void setWeight(double weight) {
        this.weight = weight;
    }

    //return the type
    public String getType() {
        return type;
    }

    // type parameter is set
    public void setType(String type) {
        this.type = type;
    }

    //return the breed
    public String getBreed() {
        return breed;
    }

    // breed parameter is set
    public void setBreed(String breed) {
        this.breed = breed;
    }

    //toString method
    public String toString() {
        return "Pet : Name="+name+", Age="+age+", Weight="+weight+", Type="+type+", Breed="+breed;
    }
}