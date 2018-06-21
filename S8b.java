import java.io.*;
class S8b extends Thread
{
    int ch;
    FileInputStream in;
    public File file1=new File("S1.txt");
    public File file8=new File("S8.txt");
    public File file3=new File("S3.txt");
    public File file6=new File("S6.txt");
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
        in=new FileInputStream(file8);
        while((ch=in.read())!=-1)
        str.append((char)ch);
        in.close();
        }
        catch(IOException e)
        {
            System.out.println("File8 not found!");
        }
        System.out.println(str);
}
}