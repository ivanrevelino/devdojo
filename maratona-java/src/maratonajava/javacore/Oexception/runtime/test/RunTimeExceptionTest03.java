package maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    static void main(String[] args) {
        abrirConexao();
    }

    private static String abrirConexao() {
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo Dados no arquivo");
            return "conexao aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally { //Sempre sera executado
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}
