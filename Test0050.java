
/**
 * Write a description of class Test0050 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test0050
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Test0050
     */
    public Test0050()
    {

    }

    /**
     * Metodo que realiza multiplicaciones enteras
     */
    public int multiplicar(int a, int b)
    {
        int res = 0;
        while (b > 0)
        {
            res = res + a;
            b--;
        }

        return res;
    }

    /**
     * Metodo que realiza divisiones enteras entre dos numeros dados por parametro
     */
    public int dividir (int a, int b)
    {
        int cont = 0;
        while (a > 0)
        {
            a = a - b;
            cont++;
        }
        return cont;
    }

    /**
     * Metodo que realiza modulos entre dos numeros dados por parametros
     * 
     */
    public int modulo (int a, int b)    
    {   
        int cont = 0;
        int mod = 0;
        while (a > 0 && a >= b)
        {
            a = a - b;
            cont++;
        }
        return a;
    }

    /**
     * Metodo que realiza potencias entre dos numeros dados por parametro
     */
    public int potencia(int a, int b)
    {
        int resul = a;
        int cont = 1;
        while (cont < b)
        {
            resul = multiplicar(resul, a);
            cont ++;
        }
        return resul;
    }

    /**
     * Metodo que realiza la raiz cuadrada de un numero pasado por parametro
     */
    public int raiz(int a)
    {
        int num = 0;
        int resul = 0;
        while(resul <= a)
        {
            resul = num*num;
            num = num + 1;
        }
        return num-2;
    }
}
