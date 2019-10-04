/**
        Get Forked Mac
**/


import java.util.Scanner;
public class rocket {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter rocket scale: ");
        int scale = scnr.nextInt();
        drawTop(scale);
        drawBar(scale);
        drawBody(scale);
        drawBody1(scale);
        drawBar(scale);
        drawBody1(scale);
        drawBody(scale);
        drawBar(scale);
        drawTop(scale);

    }
// this method comtroled the creatiom of the most top and bottem of the rocket
    public static void drawTop(int scale){
        for (int line = 1; line <= (scale * 2) -1; line++){
                for (int space = 1; space <= (line * -1) + (scale * 2); space++){
                    System.out.print(" ");
                }
                for (int hash = 1; hash <= line; hash++){
                    System.out.print("/");
                }

                System.out.print("**");

                for (int hash = 1; hash <= line; hash++){
                    System.out.print("\\");
                }
                for (int space = 1; space <= (line * -1) + (2 * scale); space++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }


/**
        This is a joke
**/
// this method comtrols the creation of the top part of the body 
    public static void drawBody(int scale){
        for(int line = 1; line <= scale; line++){ // this loop controls the amout of lines 
                System.out.print("|"); 
                for(int dots = 1; dots <= (line * -1) + scale; dots++){ // this loop controls the amount frist dots in each line 
                    System.out.print(".");
                }
                for (int cone = 1; cone <= line ; cone++){ // this loop controls the amount of cones in each line
                    System.out.print("/\\");
                }
                for(int dots1 = 1; dots1 <= (-2 * line) + (2 * scale); dots1++){ // this loop controls amount of middle dots in each line 
                    System.out.print(".");
                }
                 for (int cone = 1; cone <= line ; cone++){ // this a repeat of the cone loop
                    System.out.print("/\\");
                }
                 for(int dots = 1; dots <= (line * -1) + scale; dots++){ // repeat of the first dot loop
                    System.out.print(".");
                }
                System.out.print("|");
                System.out.println();
            }
        }
    public static void drawBody1(int scale){
        for(int line = 1;  line <= scale; line++){ // creates the line amout of lines 
            System.out.print("|");
            for(int dots = 1; dots <= (line - 1); dots++){ // the reverse of the first dot loop
                System.out.print(".");
            }
           for(int cone = 1; cone <= (line * -1) + (scale + 1); cone++){ // the reverse of the cone loop  
               System.out.print("\\/");
           }
           for(int dots1 = 1; dots1 <= (2 * line) -2; dots1++){ // the reverse of the middle dot loop
                    System.out.print(".");
            }
              for(int cone = 1; cone <= (line * -1) + (scale + 1); cone++){ // repeat reverse cone loop
              
               System.out.print("\\/");
            }
             for(int dots = 1; dots <= (line - 1); dots++){ // repeat of the first dot loop 
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }
    }

/**
        If you manage to find out who I am, good for you.
**/
    public static void drawBar(int scale){
        System.out.print("+");
        for(int bar = 1; bar <= scale * 2; bar++){ // this controls the amoumt plus equals depending on the scale
            System.out.print("=*");
        }
        System.out.print("+");
        System.out.println();
    }
}

//heyo how are you doing
