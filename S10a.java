import java.io.*;
class S10a extends Thread
{
    int ch;
    FileInputStream in;
    public File file1=new File("S1.txt");
    public File file2=new File("S2.txt");
    public File file5=new File("S5.txt");
    public File file8=new File("S8.txt");
    public File file10=new File("S10.txt");
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
        in=new FileInputStream(file2);
        while((ch=in.read())!=-1)
        str.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File2 not found!");
        }
        try
        {
        in=new FileInputStream(file5);
        while((ch=in.read())!=-1)
        str.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File5 not found!");
        }
        try
        {
        in=new FileInputStream(file8);
        while((ch=in.read())!=-1)
        str.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File8 not found!");
        }
        try
        {
        in=new FileInputStream(file10);
        while((ch=in.read())!=-1)
        str.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File10 not found!");
        }
        System.out.println(str);
}
}