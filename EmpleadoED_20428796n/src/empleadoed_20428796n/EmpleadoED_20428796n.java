/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadoed_20428796n;

/**
 *
 * @author Manuel
 */
public class EmpleadoED_20428796n {
 static final double FACTOR_HORA_EXTRA = 1.2;
 private String nombreCompleto, dni;
 private double salarioBasePorHora = 10.56;
 public EmpleadoED_20428796n(String nombreCompleto, String dni) {
 this.nombreCompleto = nombreCompleto;
 this.dni = dni;
 }

    private EmpleadoED_20428796n(String manuel_GArcia20428796) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 public double getSalarioEsteMes(int horasExtra) {
 double cantidadExtra, salarioFinal;
 cantidadExtra = horasExtra * this.salarioBasePorHora *
FACTOR_HORA_EXTRA;
 salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
 salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
 return salarioFinal;
 }

 // Este método no lo comentaremos con JavaDoc
 public static void main(String[] args) {
 // !!!! MODIFICA TU NOMBRE Y TU DNI EN LA SIGUIENTE LÍNEA
 EmpleadoED_20428796n emp = new EmpleadoED_20428796n("manuel GArcia,20428796");
 int horasExtra = 2;
 System.out.println("El salario de " + emp.nombreCompleto + " este messerá de " + emp.getSalarioEsteMes(horasExtra)
 + " euros, al hacer " + horasExtra + " horas extra.");
 }
}
