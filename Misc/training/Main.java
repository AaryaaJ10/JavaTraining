public class Main {


  public static void main(String[] args) {
    Pokemon rudra = new Pokemon("rudra");
    rudra.health = 50;
    System.out.println(Pokemon.trainerPokemon);

    Pokemon neel = new Pokemon("neel");
    neel.health = 100;
    System.out.println(Pokemon.trainerPokemon);

    rudra.attack(neel, 75);

    neel.heal(75);

    System.out.println(rudra.health);
    System.out.println(neel.health);
  }

  static void compare(int arr[], int value){
    for(int i = 0; arr.length > i; i++){
      if(arr[i] > value){
        System.out.println(arr[i]);
      }
    }
  }
}