class Calculadora{
  /*
   * Atributos
   */
  int a=5, b=2, result=0;
  /*
   * Metodos
   */
  public void suma(){
    result=a+b;
    System.out.println(a+"+"+b+"="+result);
  }
  public void multiplicacion(){
    result=a*b;
    System.out.println(a+"*"+b+"="+result);
  }
  public void division(){
    result=a/b;
    System.out.println(a+"/"+b+"="+result);
  }
  public void resta(){
    result=a-b;
    System.out.println(a+"-"+b+"="+result);
  }
  public static void main(String[] args){
  /*
   * Instancia de calculadora
   */
  Calculadora Calc = new Calculadora();
  /*
   * Ejecucion de metodos
   */
  Calc.suma();
  Calc.resta();
  Calc.multiplicacion();
  Calc.division();
  }
}
