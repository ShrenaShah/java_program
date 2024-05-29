import java.io.File;

class FileCreating {
    public static void main(String[] args) throws Exception {
        File f = new File("Hello.txt");
        f.createNewFile();
        System.out.println("File Created");
    }
}