import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PokemonTrainer {
 private String name = "";
 private int win = 0;
 private ArrayList<Pokemon> team = new ArrayList<Pokemon>();

 public PokemonTrainer(String name, ArrayList<Pokemon> team) {
   this.name = name;
   this.team = team;
 }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public ArrayList<Pokemon> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Pokemon> team) {
        this.team = team;
    }

    // Helper methods goes here
 //
 //
 public String toString() {
  return "\n\nTrainer: "+ name + ", Wins: " + win + ", team:" + team;
 }
}
