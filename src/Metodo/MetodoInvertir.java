package Metodo;

public class MetodoInvertir {
    
        //Variables globales
        int invertido = 0;
        int resto;
        
    //Metodo para invertir el numero.
    public void InvertirNum(int num){
        
        resto = num % 10;
        invertido = invertido * 10 + resto;
        num /= 10;
        
        if(num > 0){
            
            InvertirNum(num);
        }else{
            System.out.println(invertido);
        }
    }
}
