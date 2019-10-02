import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.DAY_OF_MONTH,14);
        calendario.set(Calendar.MONTH,11);
        calendario.set(Calendar.YEAR,2000);
        calendario.set(Calendar.HOUR_OF_DAY, 0);
        calendario.set(Calendar.MINUTE, 0);
        calendario.set(Calendar.SECOND, 0);
        Date dtIncio = calendario.getTime();

        Calendar calendario2 = Calendar.getInstance();
        calendario2.set(Calendar.DAY_OF_MONTH,18);
        calendario2.set(Calendar.MONTH,11);
        calendario2.set(Calendar.YEAR,2000);
        calendario2.set(Calendar.HOUR_OF_DAY, 0);
        calendario2.set(Calendar.MINUTE, 0);
        calendario2.set(Calendar.SECOND, 0);
        Date dtFim = calendario2.getTime();

        Pedido p = new Pedido();
        p.vendedor.setNome("Ciclóvinos da Silva");
        p.setDtInicio(dtIncio);
        p.setDtFim(dtFim);

        Produto produto1 = new Produto();
        produto1.setCodigo(1);
        produto1.setDeescricao("Carne");
        produto1.setQuantidade(2);
        produto1.setValor(15);
        p.addProduto(produto1);

        Produto produto2 = new Produto();
        produto2.setCodigo(2);
        produto2.setDeescricao("Arroz");
        produto2.setQuantidade(1);
        produto2.setValor(5);
        p.addProduto(produto2);

        Produto produto3 = new Produto();
        produto3.setCodigo(3);
        produto3.setDeescricao("Arroz");

        //EX1
        System.out.println("Ex1: " + p.verificaProdutoUnico(produto2));

        //EX2
        System.out.println("Ex2: " + p.addProduto(produto3));

        //EX3
        System.out.println("Ex3: " + produto1.totalProduto());

        //EX4
        System.out.println("Ex4: " + p.totalPedido());

        //EX5
        System.out.println("Ex5: " + p.valorMedio());

        //EX6
        System.out.println("Ex6: " + p.quantidadeMaior(1));

        //EX7
        System.out.println("Ex7: " + p.nomeVendedor());

        //EX8
        System.out.println("Ex8: " + p.emailCliente());

        //EX9
        System.out.println("Ex9: " + p.buscaProdutoDescricao("ca"));

        //EX10
        System.out.println("Ex10: " + p.dias());

        System.out.println("Objeto completo: " + p);
    }
}
