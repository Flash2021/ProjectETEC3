package com.mycompany.meusprojeto3;

import javax.swing.JOptionPane;

public class Meusprojeto3 {

    public static void main(String[] args) {
        
        //variaveis
        int PlateNumber;
        String validade;
        
        //entrada de dados
        
        PlateNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite o ultimo numero de sua placa"));
        
        switch (PlateNumber) {
        case 1:
            validade = "Pagamento válido até 30/04";
            break;
        case 2:
            validade = "Pagamento válido até 31/05";
            break;
        case 3:
            validade = "Pagamento válido até 30/06";
            break;
        case 4:
            validade = "Pagamento válido até 31/07";
            break;
        case 5:
            validade = "Pagamento válido até 31/08";
            break;
        case 6:
            validade = "Pagamento válido até 30/09";
            break;
        case 7:
            validade = "Pagamento válido até 31/10";
            break;
        case 8:
            validade = "Pagamento válido até 30/11";
            break;
        case 9, 0:
            validade = "Pagamento válido até 31/12";
            break;
        default:
            validade = "Numero da placa inválido";
            break;
        }
        JOptionPane.showMessageDialog(null, "Resultado: "+validade);
    }
}
