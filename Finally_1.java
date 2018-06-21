import java.awt.Graphics;
import java.util.*;
import java.applet.*;
import java.awt.*;

class Finally
    { 
    public static void main(String args[])
    {
        int n,b;
        do
        {
        System.out.println("Enter your choice:");
        System.out.println("1.System A, System B & System C details"); 
        System.out.println("2.Sensor database");
        System.out.println("3.Log of sensor nodes along a Transmission path");
        System.out.println("4. Exit");
        Scanner console=new Scanner(System.in);
        n=console.nextInt();
        Clusters a=new Clusters();
        Paths x=new Paths();
        SensorDB s=new SensorDB();
        Graphics g;
         switch(n)
         {
             case 1:
             {
                  a.temp();
                  a.display();
                  System.out.println();
                  a.pvalues();
                  a.hvalues();
                  a.copy();
                  a.displaypressure();
                  System.out.println();
                  a.discardduplicate();                  
                  System.out.println();
                  a.displayhumidity();
                 break;
             }
             case 2:
             {
                 System.out.println("Please exit the loop and run SensorDB file in the Projects list! Technical Error!");
                 System.out.println();
                 System.out.println();
                 break;
             }
             case 3:
             {
                 trial:
                 do
                 {
                 System.out.println("Choose a transmission path");
                 System.out.println("1.S1-S2-S5-S8-S10");
                 System.out.println("2.S1-S3-S6-S10");
                 System.out.println("3.S1-S4-S7-S9-S10");
                 System.out.println("4.Break out of this");
                 b=console.nextInt();
                 switch(b)
                 {
                     case 1:
                     {
                         x.path1();
                         break;
                     }
                     case 2:
                     {
                         x.path2();
                         break;
                     }
                     case 3:
                     {
                         x.path3();
                         break;
                     }
                     case 4:
                     {
                         break trial;
                     }
                     default:
                         System.out.println("Enter valid choice");
                 }
             }
             while(b!=4);                 
             break;
             }
             case 4:
             {
                 System.exit(0);
                 break;
             }
             default:
                 System.out.println("Enter valid choice");
             }
        }
        while(n!=4);
        
    }
}