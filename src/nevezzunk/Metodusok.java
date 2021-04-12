package nevezzunk;

public class Metodusok {
    public static String firstUpper(String nev){
    String szoveg = nev;
     
    char[] charArray = szoveg.toCharArray();
    boolean uresHely = true;

    for(int i = 0; i < charArray.length; i++) {

      if(Character.isLetter(charArray[i])) {

        if(uresHely) {

          charArray[i] = Character.toUpperCase(charArray[i]);
          uresHely = false;
        }
      }

      else {
        uresHely = true;
      }
    }
      szoveg = String.valueOf(charArray);
      return szoveg;
    
    }
    
}