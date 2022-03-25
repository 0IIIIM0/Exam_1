public class Main {
    public static void main(String[] args) {
        Calculadora basica = new Calculadora("patito",false);
        basica.setPrimerValor(284.9);
        basica.setSegundoValor(0.0);

        Calculadora cientifica = new Calculadora("Casio",true);
        cientifica.setPrimerValor(45.83);
        cientifica.setSegundoValor(13.6);

        basica.sumar();
        basica.resta();
        basica.multiplicar();
        basica.division();
        basica.elevarAPotencia();

        cientifica.sumar();
        cientifica.resta();
        cientifica.multiplicar();
        cientifica.division();
        cientifica.elevarAPotencia();

        System.out.println("basica");

        System.out.println("suma de "+ basica.getPrimerValor()+" mas "+basica.getSegundoValor()+
                " es igual a "+ basica.getPrimerValor()+basica.getSegundoValor());


        System.out.println("resta de "+ basica.getPrimerValor()+" menos "+basica.getSegundoValor()+
                " es igual a "+( basica.getPrimerValor()-basica.getSegundoValor()));

        System.out.println("multiplicacion de "+ basica.getPrimerValor()+" por "+basica.getSegundoValor()+
                " es igual a "+ (basica.getPrimerValor()*basica.getSegundoValor()));

        System.out.println("division de "+ basica.getPrimerValor()+" entre "+basica.getSegundoValor()+ " es igual a "+
                (basica.getPrimerValor()/basica.getSegundoValor()));

        System.out.println("potencia de "+ basica.getPrimerValor()+" elevada a la"+basica.getSegundoValor()+
                " es igual a "+ basica.elevarAPotencia());
        basica.toString();



        System.out.println("calculadora cientifica");

        System.out.println("suma de "+ cientifica.getPrimerValor()+" mas "+cientifica.getSegundoValor()+
                " es igual a "+( cientifica.getPrimerValor()+cientifica.getSegundoValor()));

        System.out.println("resta de "+ cientifica.getPrimerValor()+" menos "+cientifica.getSegundoValor()+
                " es igual a "+( cientifica.getPrimerValor()-cientifica.getSegundoValor()));

        System.out.println("multiplicacion de "+ cientifica.getPrimerValor()+" por "+cientifica.getSegundoValor()+
                " es igual a "+ (cientifica.getPrimerValor()*cientifica.getSegundoValor()));

        System.out.println("division de "+ cientifica.getPrimerValor()+" entre "+cientifica.getSegundoValor()+ " es igual a "+
                (cientifica.getPrimerValor()/cientifica.getSegundoValor()));

        System.out.println("potencia de "+  cientifica.getPrimerValor()+" elevada a la"+cientifica.getSegundoValor()+
                " es igual a "+ cientifica.elevarAPotencia());
        cientifica.toString();

    }


}
