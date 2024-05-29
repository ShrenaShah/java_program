import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class BufferReader
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Enter a number");
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        int num = Integer.parseInt(br.readLine());
        System.out.println(num);
    }
}