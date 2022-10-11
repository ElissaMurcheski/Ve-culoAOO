package veiculoaoo;

public class veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int velocMax;
    private motor motor;

    @Override
    public String toString() {
        return "------ Informações do Veículo ------ \nPlaca: " + placa + "\nMarca: " + marca + "\nModelo: " + modelo + "\nVelocidade Maxima: " + velocMax + motor.toString();
    }

    public veiculo(String placa, String marca, String modelo, int velocMax, int qtdPistao, int potencia) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.velocMax = velocMax;
        motor motor = new motor(qtdPistao, potencia);
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public motor getMotor() {
        return motor;
    }

    public void setMotor(motor motor) {
        this.motor = motor;
    }
    
}
