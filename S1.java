import java.io.*;
class S1 extends Thread
{
    int ch;
    FileInputStream in;
    public File file1=new File("S1.txt");
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
        System.out.println(str);
}
}