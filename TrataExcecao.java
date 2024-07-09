public class TrataExcecao { 

    public static void main(String[] args) {
        try {

            int resultado = 10 / 0;
            System.out.println("Resultado" + resultado); 


        } catch (Exception e) {
            System.out.println("Voce nao pode dividir um numero por zero.");

        }
    }




} // fim do blcoco public class 