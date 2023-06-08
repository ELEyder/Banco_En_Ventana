/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trbanco2;


public class Cuenta{
    String usuario;
    double saldoSoles;
    String contra;
    String DNI;
    String registro="";
    
    public Cuenta(String DNI, String usuario, String contra){
        this.usuario = usuario;
        this.saldoSoles = 0;
        this.DNI = DNI;
        this.contra = contra;
    }
		
    public void deposito(double deposito){
        this.saldoSoles += deposito;
    }
    public void retiro(double retiro){
        this.saldoSoles -= retiro;
    }

    /**
     *
     * @return
     */
    public String mostrarSaldo(){
        String texto = "Usuario: \"" + this.usuario + "\""+ "\n" + 
                "Saldo  : S/. " + this.saldoSoles + "\n" +
                "DNI  : " + this.DNI;
        return texto;
    }
    public String getUsuario() {
        return this.usuario;
    }
    public String getContra() {
        return this.contra;
    }
    public String getDni() {
        return this.DNI;
    }
    
    public void aumentarRegistro(String text){
        this.registro+=text+"\n";
    }
    
    public String getRegistro(){
        return this.registro;
    }
}
