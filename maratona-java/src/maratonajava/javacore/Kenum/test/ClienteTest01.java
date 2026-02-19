package maratonajava.javacore.Kenum.test;

import maratonajava.javacore.Kenum.dominio.Cliente;
import maratonajava.javacore.Kenum.dominio.TipoCliente;
import maratonajava.javacore.Kenum.dominio.TipoPagamento;


public class ClienteTest01 {
    public static void main() {
        Cliente cliente = new Cliente("Vegeta", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipo_cliente = TipoCliente.valueOf("Pessoa Fisica");
        System.out.println(tipo_cliente);
        TipoCliente tipo_cliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipo_cliente2);
    }
}
