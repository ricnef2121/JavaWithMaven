
public class HolaMundo {
    public static void main(String args[]){
        //System.out.println("Hola mundo");
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        miVariableEntera = 5;
        //ctrl + space
        System.out.println(miVariableEntera);
        
        String cadena = "Saludos";
        System.out.println(cadena);
        
        cadena = "Adios";
        System.out.println(cadena);
        
        //var inferencia de tipos en Java
        var mivariableEntera2 = 15;
        System.out.println(mivariableEntera2);
        
        var miVariableCadena2 = "cadena2";
        System.out.println("miVariableCadena2 " + miVariableCadena2);
        //soutv
        
        
        //11 Ejercicio: Reglas para definir una variable en Java
        //reglas para definir el nombre de una una variable
        //Valores permitidos en el nombre de las variables 
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        //var áVariable = 10; no se recomiendan usar acentos en el nombre de las variables
        //los caracteres especiales no estan permitidos
        
        //12 Concatenacion con Java
        //click secundario format
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union " + union);
        
        //las palabras reservadas no se pueden utilizar como nombres de variables
        var i = 3;
        var j = 4;
        
        //las expresiones se evaluan de izquierda a derecha
        System.out.println(i+j); // suma de numeros
        System.out.println((i+j+usuario));//suma de numeros mas un string
        System.out.println(usuario+i+j);// de izquierda a derecha encuentra un string asi que no puede sumar el siguinte numero y solo los concatena
        //podemos cambiar la prioridad de la evaluacion de expresiones mediante parentesis
        System.out.println(usuario+(i+j));
        
        
        //13 Caracteres especiales con Java
       var nombre = "Ricardo";
       //salto de linea
        System.out.println("Nueva Linea: \n"+nombre);
        System.out.println("Tabulador : \t"+nombre);
    }
}
