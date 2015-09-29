public class Fish extends Organism{

    public boolean isFreshWater;
    public int numberOfFins;
    public boolean hasLightOnHead;


    public Fish (boolean isFreshWater, int numberOfFins, boolean hasLightOnHead){

        this.isFreshWater = isFreshWater;
        this.numberOfFins = numberOfFins;
        this.hasLightOnHead = hasLightOnHead;


    }
    public boolean isVertebrate()
    {
        return true;
    }

    public  int numberOfLegs()
    {
        return 0;
    }

    public String fishInfo(){

        return ("Fish info:" + " Is fresh water: " + isFreshWater + ", Number of fins: " + numberOfFins +", Has a light on head: " + hasLightOnHead + ", Species: " + species + ", Sex: " + gender + ", Colour: " + colour+", Age: "+age+", Weight: "+weight+", length: "+length) ;

    }

    public void speak()  {

        System.out.println("blub..");
    }



}
