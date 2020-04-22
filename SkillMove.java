public class SkillMove {

  private String type;
  private String name;
  private double dmg;
  private double missRate;


  
 public SkillMove(String type, String name, double dmg, double missRate) {
   this.type = type;
   this.name = name;
   this.dmg = dmg;
   this.missRate = missRate;
 }


 // Helper methods goes here
 //
 //

 public String getType() { return type; }

 public void setType(String type) { this.type = type; }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public double getDmg() {
  return dmg;
 }

 public void setDmg(double dmg) {
  this.dmg = dmg;
 }

 public double getMissRate() {
  return missRate;
 }

 public void setMissRate(double missRate) {
  this.missRate = missRate;
 }

 public String toString() { return ""+name + " (" + type+")";
 }

}
