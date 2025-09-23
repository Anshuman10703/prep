package gameoops;

public class Player {
string name;
int guess;
player(String name){
  this.name =name;
}

void makeguess() {
    guess = (int) (Math.random() * 10);
    System.out.println(name + " guessed " + guess);
}
