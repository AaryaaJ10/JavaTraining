public class Pokemon {

    String name;
    int level;
    int health;
    

    static int trainerPokemon = 0;
    
    Pokemon(String name){
        this.health = 1000;
        this.level = 100;
        this.name = name;
        trainerPokemon++;
    }
    // public Pokemon() {
    //     //TODO Auto-generated constructor stub
    // }
    // public int attack(Pokemon opponent, int damage) {
    //     opponent.health -= damage;
    //     return opponent.health;
    // }
    
    public int heal(int amount) {
        this.health += amount;
        return health;
    }
}