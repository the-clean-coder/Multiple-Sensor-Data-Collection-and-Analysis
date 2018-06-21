import java.io.*;
class S7 extends Thread
{
    int ch;
    FileInputStream in;
    public File file1=new File("S1.txt");
    public File file4=new File("S4.txt");
    public File file7=new File("S7.txt");
public void run()
{
        StringBuffer str=new StringBuffer("");        
        try
        {
        in=new FileInputStream(file1);
        while((ch=in.read())!=-1)
        str.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File1 not found!");
        }
        try
        {
        in=new FileInputStream(file4);
        while((ch=in.read())!=-1)
        str.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File4 not found!");
        }
        try
        {
        in=new FileInputStream(file7);
        while((ch=in.read())!=-1)
        str.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File7 not found!");
        }
        System.out.println(str);
}
}