/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;


/**
 *
 * @author Jhon fonseca
 */

public class Listado {
    String Dueño;
    String Tipo;
    String Placa;
    String Modelo;
    String Mecanico;
    String Diagnostico;
    String Situacion;
    
   public Listado(){  //Metodo constructor Vacio
       
   }

    public Listado(String Dueño, String Tipo, String Placa, String Modelo, String Mecanico, String Diagnostico, String Situacion) {
        this.Dueño = Dueño;
        this.Tipo = Tipo;
        this.Placa = Placa;
        this.Modelo = Modelo;
        this.Mecanico = Mecanico;
        this.Diagnostico = Diagnostico;
        this.Situacion = Situacion;
    }

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMecanico() {
        return Mecanico;
    }

    public void setMecanico(String Mecanico) {
        this.Mecanico = Mecanico;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }

    public String getSituacion() {
        return Situacion;
    }

    public void setSituacion(String Situacion) {
        this.Situacion = Situacion;
    }
   
}
 