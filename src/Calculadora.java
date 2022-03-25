public class Calculadora {
   private String marca;
   private boolean esCientifica;
   private double primerValor;
   private double segundoValor;

   public String getMarca() {
      return marca;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   public boolean getEsCientifica() {
      return esCientifica;
   }

   public void setEsCientifica(boolean esCientifica) {
      this.esCientifica = esCientifica;
   }

   public double getPrimerValor() {
      return primerValor;
   }

   public void setPrimerValor(double primerValor) {
      this.primerValor = primerValor;
   }

   public double getSegundoValor() {
      return segundoValor;
   }

   public void setSegundoValor(double segundoValor) {
      this.segundoValor = segundoValor;

   }


   public Calculadora(String marca, boolean esCientifica) {
      this.marca = marca;
      this.esCientifica = esCientifica;
   }

   public double sumar (){
   double suma =0;
   suma=primerValor+segundoValor;
   return suma;
   }
   public double resta (){
      double resta;
      resta=primerValor-segundoValor;
      return resta;
   }

   public double multiplicar (){
      double multiplicacion=0;
      multiplicacion=primerValor*segundoValor;
      return multiplicacion;

   }
   public double division (){
      double division=0;
      if (segundoValor==0){
         System.out.println("No se puede dividir");
      }else {
         division=primerValor/segundoValor;
      }

      return division;

   }
   public String elevarAPotencia (){
      if (esCientifica){
      double potencia =0;
      potencia= Math.pow(primerValor,segundoValor);
         return "" + potencia;
      }else {
         return "su calculadora no es cientifica";
      }

      }

   @Override
   public String toString() {
      if (esCientifica == true) {
         return "Calculadora es de marca " + marca;

      } else {
         return "no es cinetifica y es marca"+marca;
      }
      }
   }






