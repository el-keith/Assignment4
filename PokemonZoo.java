import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class PokemonZoo {
 private ArrayList<SkillMove> movesList = new ArrayList<SkillMove>(); //move list
 private ArrayList<Pokemon> pokeList = new ArrayList<Pokemon>(); //pokemon list
 private Random rand = new Random(10);

 public PokemonZoo()   {
  loadMoves();
  loadPokemon();
 }

 public ArrayList<SkillMove> getMovesList() {
  return movesList;
 }

 public ArrayList<Pokemon> getPokeList() {
  return pokeList;
 }


 public void loadMoves() {

     try {
         FileReader fr = new FileReader("skillMove.txt");
         BufferedReader br = new BufferedReader(fr);


         String s = br.readLine();
         String [] data;
         while(s != null) {

             data = s.split(" ");
             String name = data[0];
             String type = data[1];
             Double dmg = Double.parseDouble(data[2]);
             Double missRate = Double.parseDouble(data[3]);

             SkillMove skill = new SkillMove(name, type, dmg, missRate);
             movesList.add(skill);
             s = br.readLine();

         }
        br.close();
        fr.close();




     } catch (FileNotFoundException e) {
         e.printStackTrace();

     } catch (IOException e) {
         e.printStackTrace();
     }
 }

 public void loadPokemon()   {

   // you should use getRandomInt method here.
   // e.g.  movesList.get(getRandomInt(movesList.size()))
     try {

     FileReader fr = new FileReader("pokemons.txt");
     BufferedReader br = new BufferedReader(fr);


         String s = br.readLine();
         String [] data;

         while(s != null) {

             data = s.split(" ");
             String name = data[0];
             double  maxHealth = Double.parseDouble(data[1]);
             String type = data[2];
             int numOfMoves = Integer.parseInt(data[3]);
             ArrayList<SkillMove> newMovesList = new ArrayList<SkillMove>();
             int i = 0;
             while (i < numOfMoves) {
                 SkillMove temp = movesList.get(getRandomInt(movesList.size()));
                 if (type.equals(temp.getType())){
                     newMovesList.add(temp);
                     i ++;
                 }
             }
             Pokemon p = new Pokemon (name, maxHealth, type,newMovesList);
             pokeList.add(p);
             s = br.readLine();

         }
//         System.out.println(pokeList);
         br.close();
         fr.close();

     } catch (FileNotFoundException e) {
         e.printStackTrace();

     } catch (IOException e) {
         e.printStackTrace();
     }


 }

 // The range include the last element
 private int getRandomInt(int range) {
     return rand.nextInt(range);
 }
 
}


