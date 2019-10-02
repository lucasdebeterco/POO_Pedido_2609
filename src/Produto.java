public class Produto {
    private int codigo;
    private String deescricao;
    private double valor;
    private int quantidade;

    public  double totalProduto(){
        return getValor()*getQuantidade();
    }

    public int getCodigo() { return codigo; }

    public void setCodigo(int codigo) { this.codigo = codigo;}

    public String getDeescricao() {
        return deescricao;
    }

    public void setDeescricao(String deescricao) {
        this.deescricao = deescricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", deescricao='" + deescricao + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }
}
