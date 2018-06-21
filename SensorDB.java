import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class SensorDB extends Applet implements ActionListener
{
    StringBuffer str1=new StringBuffer("");
    StringBuffer str2=new StringBuffer("");
    StringBuffer str3=new StringBuffer("");
    StringBuffer str4=new StringBuffer("");
    StringBuffer str5=new StringBuffer("");
    StringBuffer str6=new StringBuffer("");
    StringBuffer str7=new StringBuffer("");
    StringBuffer str8=new StringBuffer("");
    StringBuffer str9=new StringBuffer("");
    StringBuffer str10=new StringBuffer("");
    File file1=new File("S1.txt");
    File file2=new File("S2.txt");
    File file3=new File("S3.txt");
    File file4=new File("S4.txt");
    File file5=new File("S5.txt");
    File file6=new File("S6.txt");
    File file7=new File("S7.txt");
    File file8=new File("S8.txt");
    File file9=new File("S9.txt");
    File file10=new File("S10.txt");
    FileInputStream in;
    int ch;
    Button button1=new Button("Applet Indeed!");
    Button button2=new Button("Exit");
    public void paint(Graphics g)
    {
        g.drawString("Choose",10,10);
    }
    public void init()
    {
        add(button1);
        add(button2);
        button1.addActionListener(this);
        button2.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e1)
    {
        if(e1.getSource()==button1)
        {
            try
        {
        in=new FileInputStream(file1);
        while((ch=in.read())!=-1)
        str1.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
           System.out.println("File1 not found!");
        }
        System.out.println(str1);
        try
        {
        in=new FileInputStream(file2);
        while((ch=in.read())!=-1)
        str2.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File2 not found!");
        }
        System.out.println(str2);
        try
        {
        in=new FileInputStream(file3);
        while((ch=in.read())!=-1)
        str3.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File3 not found!");
        }
        System.out.println(str3);
        try
        {
        in=new FileInputStream(file4);
        while((ch=in.read())!=-1)
        str4.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File4 not found!");
        }
        System.out.println(str4);
        try
        {
        in=new FileInputStream(file5);
        while((ch=in.read())!=-1)
        str5.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File5 not found!");
        }
        System.out.println(str5);
        try
        {
        in=new FileInputStream(file6);
        while((ch=in.read())!=-1)
        str6.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File6 not found!");
        }
        System.out.println(str6);
        try
        {
        in=new FileInputStream(file7);
        while((ch=in.read())!=-1)
        str7.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File7 not found!");
        }
        System.out.println(str7);
        try
        {
        in=new FileInputStream(file8);
        while((ch=in.read())!=-1)
        str8.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File8 not found!");
        }
        System.out.println(str8);
        try
        {
        in=new FileInputStream(file9);
        while((ch=in.read())!=-1)
        str9.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File9 not found!");
        }
        System.out.println(str9);
        try
        {
        in=new FileInputStream(file10);
        while((ch=in.read())!=-1)
        str10.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File10 not found!");
        }
        System.out.println(str10);
        }
        else if(e1.getSource()==button2)
        {
            System.exit(0);
        }
    }
}
        