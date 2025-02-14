import java.io.BufferedReader;
import java.io.FileReader;

class ExceptionDemo {
    public static void main(String[] args) {
        String file = "05_ExceptionDemo.java";
        BufferedReader br = null;
        String data = null;
        try{
            br = new BufferedReader(new FileReader(file));
            while( (data = br.readLine())!=null){
                System.out.println(data);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            try{
                 br.close();
            }catch(Exception _){} // usage of _ as place holder
        }
    }
}
