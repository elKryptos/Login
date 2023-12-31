import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        String nome1 = "", password = "";
        
        System.out.println("Inserisci il valore dell'usuario: ");
        nome1 = in.nextLine();
        System.out.println("Inserisci la password dell'usuario: ");
        password = in.nextLine();

        if (nome1.equals("elKryptos") && password.equals("qwerty")){
        System.out.println("Nome nome dell'usuario e la password inseriti risultano corretti.");
        }else{
            System.out.println("Riprova, nome usuario e/o password non corretti.");
        } 
    }
}
