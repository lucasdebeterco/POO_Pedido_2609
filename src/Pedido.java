import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Pedido extends Operecao {
    private int codigo;
    protected Vendedor vendedor;
    protected Cliente cliente;
    private List<Produto> listaProdutos = new ArrayList<>();

    public Pedido(){
        super();
        vendedor = new Vendedor();
        cliente = new Cliente();
        listaProdutos = new ArrayList<Produto>();
    }

    public boolean verificaProdutoUnico(Produto produto){
        boolean saida = false;
        for (int i = 0; i < listaProdutos.size(); i++) {
            if ((produto.getDeescricao()).toLowerCase().equals((listaProdutos.get(i).getDeescricao()).toLowerCase())){
                saida = true;
            }
        }
        return saida;
    }

    public Double totalPedido() {
        double total = 0;
        for (int i = 0; i < listaProdutos.size(); i++) {
            total += listaProdutos.get(i).totalProduto();
        }
        return total;
    }

    public int qntMaiorDez(){
        int cont = 0;
        for (int i = 0; i < listaProdutos.size(); i++){
            if (listaProdutos.get(i).totalProduto() > 10);{
                cont ++;
            }
            return cont;
        }
        return cont;
    }

    public double valorMedio(){
        double soma = 0;
        for (int i = 0; i < listaProdutos.size(); i++){
            soma += listaProdutos.get(i).getValor();
        }
        return soma/listaProdutos.size();
    }

    public List<Produto> quantidadeMaior(int quantidade){
        List<Produto> prodPorQnt = new ArrayList<>();
        for (int i = 0; i < listaProdutos.size(); i++){
            if (listaProdutos.get(i).getQuantidade() > quantidade){
                prodPorQnt.add(listaProdutos.get(i));
            }
        }
        return prodPorQnt;
    }

    public String nomeVendedor(){
        return vendedor.getNome();
    }

    public String emailCliente(){
        return cliente.getEmail();
    }

    public List<Produto> buscaProdutoDescricao(String descricao){
        List<Produto> listaBuscaDesc = new ArrayList<Produto>();
        for (int i = 0; i < listaProdutos.size(); i++){
            if ((listaProdutos.get(i).getDeescricao()).toLowerCase().startsWith(descricao.toLowerCase())){
                listaBuscaDesc.add(listaProdutos.get(i));
            }
        }
        return listaBuscaDesc;
    }

    public long dias(){
        Date dtIncio = super.getDtInicio();
        Date dtFim = super.getDtFim();

        long In = dtIncio.getTime();
        long Fim = dtFim.getTime();
        long aux = Fim-In;
        aux /= 86400;
        return aux/1000;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public boolean addProduto(Produto produto) {
        if (!(verificaProdutoUnico(produto))) {
            this.listaProdutos.add(produto);
            return true;
        } else
        return false;
    }

    @Override
    public String toString() {
        return " " + super.toString() +
                "Pedido{" +
                "codigo=" + codigo +
                ", vendedor=" + vendedor +
                ", cliente=" + cliente +
                ", listaProdutos=" + listaProdutos +
                '}';
    }
}
