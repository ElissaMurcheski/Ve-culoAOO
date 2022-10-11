package veiculoaoo;

public class veiculoPasseio extends veiculo {

    private int qtdPassageiro;

    public int getQtdPassageiro() {
        return qtdPassageiro;
    }

    public void setQtdPassageiro(int qtdPassageiro) {
        this.qtdPassageiro = qtdPassageiro;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de passageiros: " + qtdPassageiro;
    }

    public veiculoPasseio(int qtdPassageiro, String placa, String marca, String modelo, int velocMax, int qtdPistao, int potencia) {
        super(placa, marca, modelo, velocMax, qtdPistao, potencia);
        this.qtdPassageiro = qtdPassageiro;
    }

}
