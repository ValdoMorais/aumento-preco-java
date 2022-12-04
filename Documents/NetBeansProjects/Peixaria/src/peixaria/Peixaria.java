/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peixaria;

/**
 *
 * @author Yasmira
 */
public class Peixaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double carapau, garoupa, aumento, au_garoupa, au_sardinha, au_carapau;
        double sardinha = 200;
        
        aumento = sardinha * 25 /100;
        
        garoupa = sardinha + aumento;
        
        carapau = garoupa/2;
        
        au_garoupa = garoupa * 10 /100;
        au_carapau = carapau * 10 /100;
        au_sardinha = sardinha * 10 /100;
        
        System.out.println("Aumento do preco de peixes de 3 em 3 anos ate os proximos 50 anos");
        int count=0;
        for(int i=3; i<=50; i+=3){
            
            garoupa += au_garoupa;
            sardinha += au_sardinha;
            carapau += au_carapau;
            
            System.out.println("Garoupa: "+ garoupa +" |Sardinha: "+ sardinha +" |Carapau: "+ carapau);
            
        
        }
        
        
        
    }
    
}
