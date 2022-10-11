package veiculoaoo;

public class veiculoCarga extends veiculo {

    private int capacidadeCarga;

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCapacidade de carga: " + capacidadeCarga;
    }

    public veiculoCarga(int capacidadeCarga, String placa, String marca, String modelo, int velocMax, int qtdPistao, int potencia) {
        super(placa, marca, modelo, velocMax, qtdPistao, potencia);
        this.capacidadeCarga = capacidadeCarga;
    }

}
