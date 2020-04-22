import java.util.Random;
import java.util.ArrayList;

public class Pokemon {

 private String name;
 private double maxHealth;
 private double currentHealth;
 private String type;
 private  ArrayList<SkillMove> moves;

 private Random rand = new Random(10);


 public Pokemon(String name, double maxHealth, String type){
   this.name = name;
   this.maxHealth = maxHealth;
   this.type = type;
   getMoves();
 }

    public double getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(double currentHealth) {
        this.currentHealth = currentHealth;
    }

    public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public double getMaxHealth() {
  return maxHealth;
 }

 public void setMaxHealth(double maxHealth) {
  this.maxHealth = maxHealth;
 }

 public String getType() {
  return type;
 }

 public void setType(String type) {
  this.type = type;
 }

 public ArrayList<SkillMove> getMoves() {


  return moves;
 }

 public void setMoves(ArrayList<SkillMove> moves) {


  this.moves = moves;
 }

 public void attack(Pokemon p) {
  int rand = getRandomInt(moves.size());
//   if (!isMoveMissed(moves.get(rand).getMissRate())) {
//
//   }

 }


 // The others:
 public String toString() {
  return ("\n" + name + ", Moves:" + moves);
 }

 // The range  include the last element
 private int getRandomInt(int range) {
  return rand.nextInt(range);
 }

 // you should use this method to see if the skill move is missed.
 private boolean isMoveMissed(SkillMove m) {
  double d = rand.nextDouble();
  if (d > m.getMissRate()) {
   return false;
  }
  return true;
 }

}
