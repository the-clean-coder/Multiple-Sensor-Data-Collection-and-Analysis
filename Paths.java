import java.io.*;
import java.util.Scanner;
class Paths
{
    Scanner console=new Scanner(System.in);
    S1 o=new S1();
    S2 p=new S2();
    S3 q=new S3();
    S4 r=new S4();
    S5 s=new S5();
    S6 t=new S6();
    S7 u=new S7();
    S8a v=new S8a();
    S8b v1=new S8b();
    S9a w=new S9a();
    S9b w1=new S9b();
    S10a x1=new S10a();
    S10b x2=new S10b();
    S10c x3=new S10c();
    void path1()
    {
        System.out.println("Enter the node to get its data log(S1-S2-S5-S8-S10)");
        int c=console.nextInt();        
        switch(c)
        {
            case 1:
            {
                 o.start();
                 break;
            }
            case 2:
            {
                p.start();
                break;
            }
            case 5:
            {
                s.start();
                break;
            }
            case 8:
            {
                v.start();
                break;
            }
            case 10:
            {
                x1.start();
                break;
            }
            default:
                System.out.println("Enter valid choice:");
        }
    }
    void path2()
    {
        System.out.println("Enter the node to get its data log(S1-S3-S6-S8/S9-S10)");
        int c=console.nextInt();
        switch(c)
        {
            case 1:
            {
                o.start();
                 break;
            }
            case 3:
            {
                q.start();
                break;
            }
            case 6:
            {
                t.start();
                break;
            }
            case 8:
            {
                v1.start();
                break;
            }
            case 9:
            {
                w1.start();
            }
            case 10:
            {
                x2.start();
                break;
            }
            default:
                System.out.println("Enter valid choice:");
        }
    }
    void path3()
    {
        System.out.println("Enter the node to get its data log(S1-S4-S7-S9-S10)or 0 to exit");
        int c=console.nextInt();
        switch(c)
        {
            case 1:
            {
                o.start();
                 break;
            }
            case 4:
            {
                r.start();
                break;
            }
            case 7:
            {
                u.start();
                break;
            }
            case 9:
            {
                w.start();
                break;
            }
            case 10:
            {
                x3.start();
                break;
            }
            default:
                System.out.println("Enter valid choice:");
        }
    }
}