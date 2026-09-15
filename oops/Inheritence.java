package oops;
class Pokemon{  //parent
    int power;
    String Type;
    Pokemon(int power,String type){
        this.power=power;
        this.Type=Type;

    }
    Pokemon(){
    }
    void print(){
        System.out.println(power+" "+Type);
    }
}
class Legendarypokemon extends Pokemon{  //child
    String ability;
}
class Strongpokemon extends Pokemon{
    Double speed;
}
class godpokemon extends Strongpokemon{
    int rating ;
}
public class Inheritence {
    public static void main(String[] args) {
        Legendarypokemon x1 = new Legendarypokemon();
        x1.ability = "unlimited";
        Pokemon x2 = new Pokemon();
        x2.Type = "yellow";
        Strongpokemon x3 = new Strongpokemon();
        x3.speed = 89.9;
        godpokemon x4 = new godpokemon();
        x4.rating = 10;


    }
}
