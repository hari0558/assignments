import java.util.*;  
import java.util.stream.Collectors;  
 public class ArrayListExample1{  
 public static void main(String args[]){  
  List<String> list=new ArrayList<String>();//Creating arraylist    
      list.add("Mango");//Adding object in arraylist    
      list.add("Apple");    
      list.add("Banana");    
      list.add("Grapes");    
      //Printing the arraylist object   
      System.out.println(list);  
 List<String>list2=list.stream().map(fruits->{
     char ch=Character.toUpperCase(fruits.charAt(2));
     fruits=fruits.substring(0,2)+ch+fruits.substring(3);
     return fruits;
 }).collect(Collectors.toList());
 for(String names:list2){
     System.out.println(names);
 }  
 }
}  