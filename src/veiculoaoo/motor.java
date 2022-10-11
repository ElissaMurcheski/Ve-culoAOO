package veiculoaoo;

public class motor {
    private int qtdPistao;
    private int potencia;

    @Override
    public String toString() {
        return "\n------ Informações do Motor ------\nQuantidade de Pistão: " + qtdPistao + "\nPotência: " + potencia;
    }

    public motor(int qtdPistao, int potencia) {
        this.qtdPistao = qtdPistao;
        this.potencia = potencia;
    }

    public int getQtdPistao() {
        return qtdPistao;
    }

    public void setQtdPistao(int qtdPistao) {
        this.qtdPistao = qtdPistao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
}
