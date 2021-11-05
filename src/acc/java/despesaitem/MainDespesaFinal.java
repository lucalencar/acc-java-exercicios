package acc.java.despesaitem;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainDespesaFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        int dia = 0;
        int mes = 0;
        float valor = 0f;

        ArrayList<DespesaMes> despesa = new ArrayList<DespesaMes>();
        ArrayList<DespesaTotal> despesaTotal = new ArrayList<DespesaTotal>();


        int menu = 0;
        do {
            String option = JOptionPane.showInputDialog("Digite uma opção no menu: \n" + 
                                                        "1: Adicionar despesa do dia \n" + 
                                                        "2: Adicionar despesa do mês \n" +
                                                        "3. Mostrar despesa total \n" +
                                                        "4. Sair \n");
            try {
				menu = Integer.parseInt(option);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Input inválido! Digite um número!");
			}
            switch (menu) {
                case 1:
                    while (true) {
                        String inputDia = JOptionPane.showInputDialog("Digita o dia:");
                        int dias = 0;
                        try {
                            dias = Integer.parseInt(inputDia);
                            if (dias <= 31) {   
                                dia = dias;
                                break;
                            } 
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Input inválido! Digite um número!");
                        }

                    }
                    while (true) {
                        String inputMes = JOptionPane.showInputDialog("Digita o mes:");
                        int meses = 0;
                        try {
                            meses = Integer.parseInt(inputMes);
                            if (meses <= 12) {   
                                mes = meses;
                                break;
                            } 
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Input inválido! Digite um número!");
                        }
                    }
                    while (true) {
                        String inputValor = JOptionPane.showInputDialog("Digita o Valor:");
                        float valores = 0f;
                        try {
                            valores = Float.parseFloat(inputValor);
                            valor = valores;
                            break;
                            } 
                         catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Input inválido! Digite um número!");
                        }
                    }
                    despesa.add(new DespesaDia(dia, mes, valor));
                    despesaTotal.add(new DespesaTotal("278.243.239-30", despesa));
                    break;

                case 2:
                while (true) {
                    String inputMes = JOptionPane.showInputDialog("Digita o mes:");
                    int meses = 0;
                    try {
                        meses = Integer.parseInt(inputMes);
                        if (meses <= 12) {   
                            mes = meses;
                            break;
                        } 
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Input inválido! Digite um número!");
                    }
                }
                while (true) {
                    String inputValor = JOptionPane.showInputDialog("Digita o Valor:");
                    float valores = 0f;
                    try {
                        valores = Float.parseFloat(inputValor);
                        valor = valores;
                        break;
                        } 
                     catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Input inválido! Digite um número!");
                    }

                }
                    despesa.add(new DespesaMes(mes, valor));
                    despesaTotal.add(new DespesaTotal("278.243.239-30", despesa));
                break;

                case 3:
                    for (int i = 0; i < despesaTotal.size(); i++) {
                           System.out.println("CPF: " + despesaTotal.get(i).getCpf() + "\n" + "CPF: " + despesaTotal.get(i).totalizaMes(despesa.get(i).getMes()));
                           System.out.println("-------------------------------------");
                           despesa.get(i).toString();
                        }  
                    break;

                case 4:
                    exit = true;
            }
        } while (!exit);

       input.close();

    }
}