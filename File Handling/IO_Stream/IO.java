import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class IO {
    public static void main(String[] args) throws Exception 
    {
        File f = new File("Sample File");
        f.createNewFile();

        try (FileOutputStream fos = new FileOutputStream(f)) 
        {
            String text = "This is a new file";
            fos.write(text.getBytes());
            System.out.println("This is new file");
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
        FileInputStream fis = new FileInputStream(f);
        for(int i = fis.read(); i==-1; i++)
        {
            char c = (char) i;
            System.out.println(c);
        }    
        fis.close();
    }
}
