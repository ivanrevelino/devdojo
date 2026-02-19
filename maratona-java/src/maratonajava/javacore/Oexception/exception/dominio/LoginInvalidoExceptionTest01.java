package maratonajava.javacore.Oexception.exception.dominio;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.print("Usuario: ");
        String userNameDigitado = scanner.nextLine();
        System.out.print("Senha: ");
        String senhaDigitada = scanner.nextLine();

        if (!usernameDB.equals(userNameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuario ou senha Invalidos");
        }

        System.out.println("Usuario logado com sucesso");
    }
}
