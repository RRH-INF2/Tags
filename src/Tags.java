// enum Tag {
//    CITIES, CITY, NAME, STATE, COORDINATES; // les éléments s'écrivent entièrement en majuscules en Java
//    
//    public String toString() {
//       return name().charAt(0) + name().substring(1).toLowerCase();     
//    }
// }   
// 
// public class Tags {
// 
//    public static void main(String args[]) {
//       
//       final Tag[] TAGS = Tag.values(); // La méthode statique (implicite) values() retourne un tableau des valeurs du type enum 
//       
//       // Quelques exemples
//       System.out.println(TAGS[0]);                          // affichera Cities
//       System.out.println(TAGS[3]);                          // affichera State
//       System.out.println(TAGS[Tag.COORDINATES.ordinal()]);  // affichera Coordinates
//       String s = TAGS[Tag.NAME.ordinal()].toString();
//       System.out.println(s);                                // affichera Name
//    }
// }

enum Tag {
   CITIES("Cities"), CITY("City"), NAME("Name"), STATE("State"), COORDINATES("Coordinates");
   
   private final String label;
   
   Tag(String label) {
      this.label = label;
   }   
   
   @Override
   public String toString() {
      return label;
   }   
}   

public class Tags {

   public static void main(String args[]) {
      
      // Quelques exemples
      for (Tag tag : Tag.values()) {
         System.out.println(tag);            // affichera Cities, City, etc.
      }
      
      System.out.println(Tag.COORDINATES);   // affichera Coordinates
      
      String s = Tag.NAME.toString();
      System.out.println(s);                 // affichera Name
   }
}