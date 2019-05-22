import java.util.Scanner;
  class Practice{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    //Grade1
    System.out.println("What is Grade 1?");
    double g1 = in.nextDouble();
    System.out.println("What is Grade 2?");
    double g2 = in.nextDouble();
    System.out.println("What is Grade 3?");
    double g3 = in.nextDouble();
    double avg = (g1 +g2 +g3)/3.0;
    if (avg >=50)
      System.out.println("You passed bisshh");
    else
      System.out.println("ya failed hoeee");
      
  }
}