import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

      Reptile myReptile = new Reptile(true, true);
        myReptile.species = "chamaleon" ;
        myReptile.gender = Gender.male ;
        myReptile.colour="red";
        myReptile.age= 47;
        myReptile.weight=1;
        myReptile.length=3;
        myReptile.isCarnivorous= false;
        myReptile.isWarmBlooded=false;

        Fish myFish = new Fish(true, 4, false) ;
        myFish.species = "Nemo" ;
        myFish.gender =Gender.male ;
        myFish.colour="Orange";
        myFish.age= 4;
        myFish.weight=2;
        myFish.length=2;
        myFish.isCarnivorous= false;
        myFish.isWarmBlooded=false;

        Bird myBird = new Bird(4, 3, false) ;
        myBird.species = "Phillip" ;
        myBird.gender =Gender.male ;
        myBird.colour="Grey";
        myBird.age= 1;
        myBird.weight=2;
        myBird.length=2;
        myBird.isCarnivorous= false;
        myBird.isWarmBlooded=true;






        System.out.println(myReptile.reptileInfo());
        System.out.println(myFish.fishInfo());
        System.out.println(myBird.birdInfo());



        ArrayList<Organism> values = new ArrayList<Organism>();

        values.add(myBird);
        values.add(myFish);
        values.add(myReptile);

        for (Organism value : values)
        {
            value.speak();
        }



    }
}
