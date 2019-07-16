import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<Hero>();

        // TODO 2 : Add those heroes to the list
        Hero Widow = new Hero("Black Widow" , 34);
        Hero Captain = new Hero("Captain America" , 100);
        Hero Vision = new Hero("Vision" , 3);
        Hero Iron = new Hero("Iron Man" , 48);
        Hero Scarlet = new Hero("Scarlet Witch" , 29);
        Hero Thor = new Hero("Thor" , 1500);
        Hero Spider = new Hero("Spider-Man" , 18);
        Hero Hulk = new Hero("Hulk" , 49);
        Hero Strange = new Hero("Doctor Strange" , 42);

        heroes.add(Widow);
        heroes.add(Captain);
        heroes.add(Vision);
        heroes.add(Iron);
        heroes.add(Scarlet);
        heroes.add(Thor);
        heroes.add(Spider);
        heroes.add(Hulk);
        heroes.add(Strange);

        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Spider-Man, age: 18
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        // TODO 3 : It's Thor birthday, now he's 1501
        int thorAge = Thor.getAge();
        Thor.setAge(thorAge++);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
        List<Hero> heroes1 = heroes.subList(0, heroes.size()/2);

        //heroes = (ArrayList<Hero>) heroes.subList(0,3);
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero hero : heroes1){
            System.out.println(hero.getName());
        }
    }
}