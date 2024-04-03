public class Main {
  public static void main(String[] args) {
    // Describing a case
    // seasons and fitting clothing for them
    String season = "qwerty";

    if (season == "winter") {
      System.out.println("Wear a warm jacket!");
    }
    else if (season == "spring") {
      System.out.println("Wear a T-shirt!");
    }
    else if (season == "summer") {
      System.out.println("Wear a swimming suite!");
    }
    else if (season == "autumn") {
      System.out.println("Wear a rain coat!");
    }
    else {
      System.out.println("I do not recongnize this season!");
    }
    
    int temp = -3;

    if (temp < 5) {
      System.out.println("Wear super warm!");
    } 
    else if (temp > 6 && temp < 15) {
      System.out.println("Wear warm!");
    }
    else if (temp > 16 && temp < 30) {
      System.out.println("Dress casual");
    }
    else if (temp > 31) {
      System.out.println("Chillax");
    }
    else {
      System.out.println("Invalid temp");
    }
    

    

    
  }
}
