package secao16_VerificadorDeSenha;

import java.util.Scanner;

public class VerificadorForcaSenha {
    public static void main(String[] args) {
        
        /* 1 - Importar Scanner: Importar a classe Scanner para capturar a entrada do usuário.
           2 - Receber senha: Solicitar ao usuário que digite uma senha e armazená-la em uma variável.
           3 - Verificar forca da senha: Chamar o método verificarForcaSenha para avaliar a forca da senha.
            -> Mais de x caracteres
            -> se tem letras
            -> se tem caracteres especiais
            -> se tem numeros

           4 - Avaliar e exibir resultado: Exibir uma mensagem indicando a forca da senha com base no valor retornado.
           5 - Fechar Scanner: Fechar o Scanner para liberar recursos.
         */

         Scanner scanner = new Scanner(System.in);

         // Pegar a senha do usuario
         System.out.println("Digite a senha: ");
         String senha = scanner.next();

         // Verificar a forca da senha
         int forca = verificarForcaSenha(senha);

         // Passar a mensagem para o usuário dependendo da foca
         if(forca <= 2) {
            System.out.println("Sua senha é fraca.");
         } else if(forca == 3) {
            System.out.println("Sua senha é média.");

         } else if(forca == 4) {
            System.out.println("Sua senha é segura.");

         } else {
            System.out.println("Sua senha é muito forte.");
         }

        scanner.close();


    }

    public static int verificarForcaSenha(String senha) {

        int forca = 0;

        // Logica para verificar se a senha é forte
        if(senha.length() > 8) {
            forca++;
        }

        // Letras maiusculas de A a Z
        if(senha.matches(".*[A-Z].*")) {
            forca++;

        }

        // Letras minusculas de A a Z
        if(senha.matches(".*[a-z].*")) {
            forca++;
        }

        // Se tem numeros
        if(senha.matches(".*\\d.*")) {
            forca++;
        }

        // Se tem caracteres especiais
        if(senha.matches(".*[!@#$%&*()\\-_?<>].*")) {
            forca++;
        }




        return forca;

    }
}
