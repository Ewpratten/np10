/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package np10;

public class App {
    public static void main(String[] args){
    if(args.length != 1){
      System.out.println("Usage: java main <number>");
      return;
    }
    
    for(int i = Integer.parseInt(args[0]) + 1; i != Integer.parseInt(args[0]) + 11; i += 1){
      System.out.print(i);
      System.out.print(" ");
    }
    
    System.out.print("\n\r");
    return;
  }
}
