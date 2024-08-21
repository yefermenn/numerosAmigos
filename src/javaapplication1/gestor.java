package javaapplication1;
import java.util.ArrayList;
public class gestor {
    public static boolean revizarDivisores(int primerNum, int segunNum){
        long inicio = System.nanoTime();
        ArrayList listaDivisores1=new ArrayList();
        ArrayList listaDivisores2=new ArrayList();
        int sumatoria1=0;
        int sumatoria2=0;
        for(int i=0; i<primerNum-1;i++){
            int div=i+1;
            if(primerNum % div == 0){
                listaDivisores1.add(div);
            }
        }
        for(int i=0;i<segunNum-1;i++){
            int div=i+1;
            if(segunNum % div==0){
                listaDivisores2.add(div);
            }
        }
        //sumar
        for(int i=0;i<listaDivisores1.size();i++){
            sumatoria1=sumatoria1+ (int) listaDivisores1.get(i);   
        }
        for(int i=0;i<listaDivisores2.size();i++){
            sumatoria2=sumatoria2+ (int) listaDivisores2.get(i);   
        }
        //comprobar
        if(sumatoria1==segunNum){
            if(sumatoria2==primerNum){
                long fin = System.nanoTime();
                System.out.println(fin-inicio);
                return true;
            }
        }
        long fin = System.nanoTime();
        System.out.println(fin-inicio);
        return false;
    }
}
