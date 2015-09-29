public class Bird extends Organism{


    public int numberOfTalons;
    public float lengthOfBeak;
    public boolean canFly;

    public Bird (int numberOfTalons, float lengthOfBeak, boolean canFly){


        this.numberOfTalons = numberOfTalons;
        this.lengthOfBeak = lengthOfBeak;
        this.canFly = canFly;

    }



    public boolean isVertebrate()
    {
        return true;
    }

    public  int numberOfLegs()
    {
        return 2;
    }

    public String birdInfo(){

        return ("Bird info:" + " Number of talons: " + numberOfTalons + ", Length of beak: " + lengthOfBeak +", Can fly: " + canFly + ", Species: " + species + ", Sex: " + gender + ", Colour: " + colour+", Age: "+age+", Weight: "+weight+", length: "+length) ;

    }


    public void speak()  {

        System.out.println("tweet..");
    }

}
