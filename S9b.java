import java.io.*;
class S9b extends Thread
{
    int ch;
    FileInputStream in;
    public File file1=new File("S1.txt");
    public File file3=new File("S3.txt");
    public File file6=new File("S6.txt");
    public File file9=new File("S9.txt");
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
        in=new FileInputStream(file3);
        while((ch=in.read())!=-1)
        str.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File3 not found!");
        }
        try
        {
        in=new FileInputStream(file6);
        while((ch=in.read())!=-1)
        str.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File6 not found!");
        }
        try
        {
        in=new FileInputStream(file9);
        while((ch=in.read())!=-1)
        str.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File9 not found!");
        }
        System.out.println(str);
}
}