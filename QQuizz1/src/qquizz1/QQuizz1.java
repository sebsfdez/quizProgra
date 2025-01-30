/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qquizz1;
import javax.swing.JOptionPane;
/**
 *
 * @author sebas
 */
public class QQuizz1 {

    /*
    se necesita determinar el monto total a pagar
    
    *preguntar salario
    *
    
     */
    public static void main(String[] args) {
        double salario = 0;
        double montoSEM = 0;
        double montoIVM = 0;
        double montoTotalPagar = 0;

        String variableTempSalario = "";

        variableTempSalario = JOptionPane.showInputDialog("Ingrese su salario");
        salario = Double.parseDouble(variableTempSalario);

        montoSEM = salario * 0.0925;
        montoIVM = salario * 0.0508;

        montoTotalPagar = montoSEM + montoIVM;

        JOptionPane.showMessageDialog(null,"La empresa debera abonar a la CCSS el monto de "
                + montoTotalPagar + " por concepto de SEM y IVM");

    }

}
