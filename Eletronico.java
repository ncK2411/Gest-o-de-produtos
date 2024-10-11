public class Eletronico extends Produto {

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        if (porcentagem > 30) {
            porcentagem = 30; 
        }
        return preco - (preco * porcentagem / 100);
    }
}