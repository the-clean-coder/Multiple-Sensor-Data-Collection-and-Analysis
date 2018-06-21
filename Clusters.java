import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.io.*;

class Clusters
    { 
    public File file1=new File("S1.txt");
    public File file2=new File("S2.txt");
    public File file3=new File("S3.txt");
    public File file4=new File("S4.txt");
    public File file5=new File("S5.txt");
    public File file6=new File("S6.txt");
    public File file7=new File("S7.txt");
    public File file8=new File("S8.txt");
    public File file9=new File("S9.txt");
    public File file10=new File("S10.txt");
    public FileOutputStream out;
    public PrintStream p;
    
    int k=0,l=0,m=0;
    int t=0,t2,h=1;
    int tempC[]=new int[10];
    int tempF[]=new int[10];
    int pvalues[]=new int[10];
    int hvalues[]=new int[10];
    String []srcid= {"103AD","106TV", "105RT", "509SO", "432UI","762HU","897OP","986TF","123DE","655FR"};
    Date date=new Date();
    DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");    
    void temp()
    {
            for(int i=0;i<10;i++) 
            {
            tempF[i]=(int)(Math.random()*99);
            tempC[i]=((tempF[i]-32)*5/9);
            }
    }
    void display()
    {
            df.setTimeZone(TimeZone.getTimeZone("IST"));    
            System.out.println("Temperature Log"+" on "+df.format(date));
            for(int i=0;i<10;i++) 
            {
            t2=++t;
            System.out.println("Node S"+t2+" with Source ID "+srcid[i]+" records "+tempF[i]+"F "+" ie. "+tempC[i]+"C ");            
            }
    }
    void pvalues()
    {
      for(int i=0;i<10;i++)
         {
             int pval=(int)(Math.random()*99);
             pvalues[i]=pval;
         }
    }
    void displaypressure()
    {
         df.setTimeZone(TimeZone.getTimeZone("IST"));
         System.out.println("Pressure Log on"+df.format(date));
         for(int i=0;i<10;i++)
         {
         int t3=++m;
         System.out.println("Node S"+m+" with Source Id "+srcid[i]+" records "+pvalues[i]+"Pa");
         }
    }
    void discardduplicate()
    {
         df.setTimeZone(TimeZone.getTimeZone("IST"));
         for(int i=0;i<9;i++)
         {
         int t4=++l;
         if(pvalues[i]==pvalues[i+1])
         {
         t4=++l;
         System.out.println("Node S"+t4+": Source Id:"+srcid[i+1]+"::"+pvalues[i+1]+"Pa"+"***");                         
         }
         else
         {
         continue;
         }  
         }
     }
    void hvalues()
    {
       for(int i=0;i<10;i++)
       {
        int hvalue=(int)(Math.random()*99);
        hvalues[i]=hvalue;
       } 
    }
    void displayhumidity()
    {  
            df.setTimeZone(TimeZone.getTimeZone("IST"));            
            System.out.println("Humidity and pressure(With discarded duplicates) log on "+df.format(date));
            for(int i=0;i<10;i++)
            {
                int h1=h++;
                if(i<9&&pvalues[i]==pvalues[i+1]) 
                    {                      
                     int t2=h1;
                     System.out.println("Node S"+t2+","+" with Source ID: " +srcid[i]+" records "+hvalues[i]+"%"+" and "+pvalues[i]+"Pa");      
                     i++;  
                     h++;
                    }
                else
                {
                    t2=h1;
                    System.out.println("Node S"+t2+","+" with Source ID: " +srcid[i]+" records "+hvalues[i]+"%"+" and "+pvalues[i]+"Pa");                      
                 }
             }  
         }
    void copy()
    {
        df.setTimeZone(TimeZone.getTimeZone("IST"));
        try
        {
        out=new FileOutputStream("S1.txt");
        p= new PrintStream(out);
        p.println("Data log in Node S1 with Source ID "+srcid[0]+" on "+df.format(date));
        p.println("Temperature log: "+tempF[0]+ "F"+" i.e "+tempC[0]+"C");
        p.println("Pressure Log: "+pvalues[0]+"Pa");
        p.println("Humidity Log: "+hvalues[0]+"%");
        p.close();
        }
        catch(Exception e)
                {
                    System.out.println("File1 not written");
                }
        try
        {
        out=new FileOutputStream("S2.txt");
        p= new PrintStream(out);
        p.println("Data log in Node S2 with Source ID "+srcid[1]+" on "+df.format(date));
        p.println("Temperature log: "+tempF[1]+ "F"+" i.e "+tempC[1]+"C");
        p.println("Pressure Log: "+pvalues[1]+"Pa");
        p.println("Humidity Log: "+hvalues[1]+"%");
        p.close();
        }
        catch(Exception e)
                {
                    System.out.println("File2 not written");
                }  
        try
        {
        out=new FileOutputStream("S3.txt");
        p= new PrintStream(out);
        p.println("Data log in Node S3 with Source ID "+srcid[2]+" on "+df.format(date));
        p.println("Temperature log: "+tempF[2]+ "F"+" i.e "+tempC[2]+"C");
        p.println("Pressure Log: "+pvalues[2]+"Pa");
        p.println("Humidity Log: "+hvalues[2]+"%");
        p.close();
        }
        catch(Exception e)
                {
                    System.out.println("File3 not written");
                } 
        try
        {
        out=new FileOutputStream("S4.txt");
        p= new PrintStream(out);
        p.println("Data log in Node S4 with Source ID "+srcid[3]+" on "+df.format(date));
        p.println("Temperature log: "+tempF[3]+ "F"+" i.e "+tempC[3]+"C");
        p.println("Pressure Log: "+pvalues[3]+"Pa");
        p.println("Humidity Log: "+hvalues[3]+"%");
        p.close();
        }
        catch(Exception e)
                {
                    System.out.println("File4 not written");
                }  
        try
        {
        out=new FileOutputStream("S5.txt");
        p= new PrintStream(out);
        p.println("Data log in Node S5 with Source ID "+srcid[4]+" on "+df.format(date));
        p.println("Temperature log: "+tempF[4]+ "F"+" i.e "+tempC[4]+"C");
        p.println("Pressure Log: "+pvalues[4]+"Pa");
        p.println("Humidity Log: "+hvalues[4]+"%");
        p.close();
        }
        catch(Exception e)
                {
                    System.out.println("File5 not written");
                }
        try
        {
        out=new FileOutputStream("S6.txt");
        p= new PrintStream(out);
        p.println("Data log in Node S6 with Source ID "+srcid[5]+" on "+df.format(date));
        p.println("Temperature log: "+tempF[5]+ "F"+" i.e "+tempC[5]+"C");
        p.println("Pressure Log: "+pvalues[5]+"Pa");
        p.println("Humidity Log: "+hvalues[5]+"%");
        p.close();
        }
        catch(Exception e)
                {
                    System.out.println("File6 not written");
                }
        try
        {
        out=new FileOutputStream("S7.txt");
        p= new PrintStream(out);
        p.println("Data log in Node S7 with Source ID "+srcid[6]+" on "+df.format(date));
        p.println("Temperature log: "+tempF[6]+ "F"+" i.e "+tempC[6]+"C");
        p.println("Pressure Log: "+pvalues[6]+"Pa");
        p.println("Humidity Log: "+hvalues[6]+"%");
        p.close();
        }
        catch(Exception e)
                {
                    System.out.println("File7 not written");
                }  
        try
        {
        out=new FileOutputStream("S8.txt");
        p= new PrintStream(out);
        p.println("Data log in Node S8 with Source ID "+srcid[7]+" on "+df.format(date));
        p.println("Temperature log: "+tempF[7]+ "F"+" i.e "+tempC[7]+"C");
        p.println("Pressure Log: "+pvalues[7]+"Pa");
        p.println("Humidity Log: "+hvalues[7]+"%");
        p.close();
        }
        catch(Exception e)
                {
                    System.out.println("File8 not written");
                }  
        try
        {
        out=new FileOutputStream("S9.txt");
        p= new PrintStream(out);
        p.println("Data log in Node S9 with Source ID "+srcid[8]+" on "+df.format(date));
        p.println("Temperature log: "+tempF[8]+ "F"+" i.e "+tempC[8]+"C");
        p.println("Pressure Log: "+pvalues[8]+"Pa");
        p.println("Humidity Log: "+hvalues[8]+"%");
        p.close();
        }
        catch(Exception e)
                {
                    System.out.println("File9 not written");
                }  
        try
        {
        out=new FileOutputStream("S10.txt");
        p= new PrintStream(out);
        p.println("Data log in Node S10 with Source ID "+srcid[9]+" on "+df.format(date));
        p.println("Temperature log: "+tempF[9]+ "F"+" i.e "+tempC[9]+"C");
        p.println("Pressure Log: "+pvalues[9]+"Pa");
        p.println("Humidity Log: "+hvalues[9]+"%");
        p.close();
        }
        catch(Exception e)
                {
                    System.out.println("File10 not written");
                }  
    }
}