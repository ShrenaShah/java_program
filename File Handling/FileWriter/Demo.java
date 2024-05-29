import java.io.File;
import java.io.PrintWriter;

class Demo 
{
    public static void main(String[] args) throws Exception
    {
        File f = new File("print writer file");
        f.createNewFile();

        try(PrintWriter pw = new PrintWriter(f))
        {
            pw.println("Hello World");
        }
        catch(Exception e)
        {
            System.out.println("an error ouccur");
            e.printStackTrace();
        }
    }
    
}
