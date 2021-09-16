public class MaskName {
 
   public static void main(String[] args) {
 
      String str = "Sabbir Poonawala";
      System.out.println("str: " + str);
 
      System.out.println("Masked string examples:");
 
      
      System.out.println(maskName(str, "##xxxx ###xxxxxx"));
 
      
   }
  public static String maskName(String str, String mask) {
 
      int index = 0;
      StringBuilder masked = new StringBuilder();
      for (int i = 0; i < mask.length(); i++) {
         char c = mask.charAt(i);
         if (c == '#') {
            masked.append(str.charAt(index));
            index++;
         } else if (c == 'x') {
            masked.append(c);
            index++;
         } else {
            masked.append(c);
         }
      }
      return masked.toString();
   }
}