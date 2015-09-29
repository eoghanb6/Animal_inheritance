
public abstract class Organism {

    public String species;
    public Gender gender;
    public String colour;
    public int age;
    public float weight;
    public float length;
    public boolean isCarnivorous;
    public boolean isWarmBlooded;

    public abstract boolean isVertebrate();
    public abstract int numberOfLegs();


    public abstract void speak();
}

