/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author andre
 */
public class Temperatura {

    /*
    *Atributos
    */
    private float gradosCelsius, gradosFahrenheit;
    /**
     * metodos
     */
    public void setTemperaturaFahr(float gradosFahren){
        this.gradosFahrenheit = gradosFahren;
    }
    
    public void setTemperaturaCels(float gradosCels){
        this.gradosCelsius = gradosCels;
    }
    
    public float getTemperaturaFahr(){
        return gradosFahrenheit;
    }
    
    public float getTemperaturaCels(){
        return gradosFahrenheit;
    }
    
    public float conversionFaC(){
        return (5.0f/9.0f)*(this.gradosFahrenheit-32.00f);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] argv) {
        // TODO code application logic here
        Temperatura Temp = new Temperatura();
        do{
	   Scanner myObj = new Scanner(System.in);
           float tempFahr;
           System.out.println("Ingresa temperatura en Fahrenheit:\n");
           System.out.println("(Ingresar 999 para salir)\n");
           tempFahr = myObj.nextFloat();
           Temp.setTemperaturaFahr(tempFahr);
           System.out.printf("Tu temperatura en grados Celsius es: %f\n",Temp.conversionFaC());
           
        } while(Temp.getTemperaturaFahr() != 999.0);
    }
    
}

