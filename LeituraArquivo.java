
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class LeituraArquivo {
    public static void main(String[] args) {
        BufferedReader reader = null; 
        try {
            reader = new BufferedReader(new FileReader("dados.txt")); 
            String line; 
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
           try {
                if (reader != null) 
                    reader.close(); 
           } catch (IOException e) {
            System.out.println("Erro ao fechar o leitor: " + e.getMessage());
           }    
        }
    }
}