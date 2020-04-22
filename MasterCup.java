//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Random;
//
//public class MasterCup {
// private Random rand = new Random(10);
// private ArrayList<PokemonTrainer> playerList = new ArrayList<PokemonTrainer>();
//
// public static void main(String[] args) {
//  MasterCup m = new MasterCup();
// }
//
// public MasterCup() {
//  PokemonZoo zoo = new PokemonZoo();
//  createTrainers(5, zoo.getPokeList());
//  startMatch();
//  writeScores();
//  System.out.println(playerList);
// }
//
// public void writeScores() {
//   // Your code goes here
//
// }
// public void createTrainers(int x, ArrayList<Pokemon> pokeList) {
//  try {
//   FileReader f = new FileReader("name.txt");
//   BufferedReader br = new BufferedReader(f);
//   String line = br.readLine();
//   int i = 0;
//   while (line != null && i < x) {
//
//    ArrayList<Pokemon> team = new ArrayList<Pokemon>();
//    for (int j = 0; j < 5; j++) {
//     int z = getRandomInt(pokeList.size());
//     team.add(pokeList.get(z));
//
//    }
//
//    String[] splitString = line.split(" "); // split
//    playerList.add(new PokemonTrainer(splitString[0], team));
//    line = br.readLine();
//    i++;
//   }
//
//  } catch (IOException e) {
//   e.printStackTrace();
//  }
// }
//
// //match
// public void startMatch() {
//  for (int i = 0; i < playerList.size(); i++) {
//   for (int j = 0; j < playerList.size(); j++) {
//    if (i == j)
//     continue;
//    PokemonTrainer p1 = playerList.get(i);
//    PokemonTrainer p2 = playerList.get(j);
//    healAll(p1);
//    healAll(p2);
//    pvp(p1,p2);
//   }
//  }
//
// }
//
// //pvp goes here
// public void pvp(PokemonTrainer trainer1, PokemonTrainer trainer2) {
//  int i = 0;
//  int j = 0;
//  int count = 1;
//  while(i < 5 && j < 5) {
//   Pokemon pokemon1 = trainer1.getTeam().get(i);
//   Pokemon pokemon2 = trainer2.getTeam().get(j);
//   pokemon1.attack(pokemon2);
//
//   if(pokemon2.getCurrentHealth() <=0) {
//    j++;
//    continue;
//   }
//
//    pokemon1 = trainer1.getTeam().get(i);
//    pokemon2 = trainer2.getTeam().get(j);
//
//   pokemon2.attack(pokemon1);
//
//   if(pokemon1.getCurrentHealth() <=0) {
//    i++;
//   }
//   count ++;
//  }
//
//  if(j == 5) {
//   trainer1.setWin(trainer1.getWin()+1);
//  }else {
//   trainer2.setWin(trainer2.getWin()+1);
//  }
//
//  healAll(trainer1);
//  healAll(trainer2);
//
// }
//
// //heal all pokemons
// public void healAll(PokemonTrainer p) {
//  for (Pokemon poke : p.getTeam()) {
//   poke.setHealth(poke.getMaxHealth());
//  }
// }
//
// // The range should include the last element
// private int getRandomInt(int range) {
//  return rand.nextInt(range);
//
// }
//
//}
