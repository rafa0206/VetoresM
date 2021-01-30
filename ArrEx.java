/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JFernandes
 */
public class ArrEx {
    
    //recebe um int x e um vetor vs de ints
    //e devolve true se x é um dos habitantes de vs, e,
    //false, caso contrario
    //metodo contem retorna um boolean(true ou false)
    /*public static boolean contem(int[] vs, int x) {       
        for (int v: vs){
            if (x == v) return true;
        }
        return false;
    }*/
    
    //metodo indMin vai retornar um int(numero inteiro que equivale a um indice)
    public static int indMin(int[] vs, int i) {
        int m = i;
        for(int k = i + 1; k < vs.length; ++k){
            if (vs[k] < vs[m]) {m = k;}          
        }        
        return m;
    }
    
    public static void ordSel(int[] vs){        
        for(int i = 0; i < vs.length - 1; ++i){
            int m = indMin(vs, i);
            int tmp = vs[i]; vs[i] = vs[m]; vs[m] = tmp;           
        }        
    }
    
    public static void main(String[] args) {
        int[] ws = new int[] { 4, 5, 2, 3, 1, 7, 8, 9 };
        //estou querendo saber com o metodo "contem" se em ws tem o int 6, e depois o 8.
        //caso tiver será "true", se não tiver será "false", pois o contem retorna true ou false pois é boolean
        //System.out.println(contem(ws, 6));
        //System.out.println(contem(ws, 8));
        //agora estou querendo colocar em ordem o vetor ws com o metodo ordSel(ordem de seleção)
        ordSel(ws);
        for (int w: ws) {
            System.out.println(w);
        }
    }    
}
