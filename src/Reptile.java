public class Reptile extends Organism{

    public boolean livesInWater;
    public boolean canChangeColour;

    //constructor
    public Reptile(boolean livesInWater, boolean canChangeColour) {


        this.livesInWater = livesInWater;
        this.canChangeColour = canChangeColour;

    }


    public boolean isVertebrate()
    {
        return true;
    }

    public  int numberOfLegs()
    {
    return 4;
    }
    public String reptileInfo(){

        return ("Reptile info:" + "Can change colour: " + canChangeColour + ", lives in water: " + livesInWater + ", Species: " + species + ", Sex: " + gender + ", Colour: " + colour+", Age: "+age+", Weight: "+weight+", length: "+length) ;



    }
    public void speak()  {

        System.out.println("Hissss..");
    }

}


