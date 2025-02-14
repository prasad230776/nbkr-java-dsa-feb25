import java.io.BufferedReader;
import java.io.FileReader;

class TryWithResourse {
    public static void main(String[] args) {
        String file = "05_ExceptionDemo.java";
        String data = null;
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            while( (data = br.readLine())!=null){
            System.out.println(data);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
