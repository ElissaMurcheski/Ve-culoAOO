package veiculoaoo;

import javax.swing.JOptionPane;

public class VeiculoAOO {

    public static void main(String[] args) {

        int qtdPistao = Integer.parseInt(JOptionPane.showInputDialog("Cadastro do Veiculo de passeio: \nInsira a quantidade de pistão do motor: "));
        int potencia = Integer.parseInt(JOptionPane.showInputDialog("Insira a potencia do motor: "));
        String placa = JOptionPane.showInputDialog("Insira a placa: ");
        String maraca = JOptionPane.showInputDialog("Insira a marca: ");
        String modelo = JOptionPane.showInputDialog("Insira o modelo: ");
        int velocMax = Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade maxima: "));
        int qtdPassageiro = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de passageiros: "));

        veiculoPasseio passeio = new veiculoPasseio(qtdPassageiro, placa, maraca, modelo, velocMax, qtdPistao, potencia);
        
        qtdPistao = Integer.parseInt(JOptionPane.showInputDialog("Cadastro do Veiculo de carga: \nInsira a quantidade de pistão do motor: "));
        potencia = Integer.parseInt(JOptionPane.showInputDialog("Insira a potencia do motor: "));
        placa = JOptionPane.showInputDialog("Insira a placa: ");
        maraca = JOptionPane.showInputDialog("Insira a marca: ");
        modelo = JOptionPane.showInputDialog("Insira o modelo: ");
        velocMax = Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade maxima: "));
        int capacidadeCarga = Integer.parseInt(JOptionPane.showInputDialog("Insira a capacidade de carga: "));

        veiculoCarga carga = new veiculoCarga(capacidadeCarga, placa, maraca, modelo, velocMax, qtdPistao, potencia);

        JOptionPane.showMessageDialog(null, passeio.toString());
        JOptionPane.showMessageDialog(null, carga.toString());
    }

}
