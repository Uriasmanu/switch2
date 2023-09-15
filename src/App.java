import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        double num1, num2, resultado;
        int operacao;

        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro numero"));

        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo numero"));

            operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a alteração desejada" + 
            "\n1 - Soma" +
            "\n2 - Subtração" +
            "\n3 - Multiplicação" + 
            "\n4 - Divisão" +
            "\n5 - Resto da divisão"));

            switch(operacao){
                case 1:
                resultado = num1 + num2;
                break;

                case 2:
                resultado = num1 - num2;
                break;

                case 3:
                resultado = num1 * num2;
                break;

                case 4:
                resultado = num1 / num2;
                break;

                case 5:
                resultado = num1 % num2;
                break;

                default:
                resultado = 0;
                break;
            }
          
            JOptionPane.showMessageDialog(null, "O resultado é " + resultado);
        }
    }

