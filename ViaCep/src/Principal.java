import javax.swing.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        var uf = JOptionPane.showInputDialog("Digite a UF");
        var localidade = JOptionPane.showInputDialog("Digite a Localidade");
        var logradouro = JOptionPane.showInputDialog("Digite o Logradouro");

        EnderecoForm enderecoForm = new EnderecoForm(uf,localidade,logradouro);

        consultaCep.buscaEndereco( enderecoForm);


    }
}
