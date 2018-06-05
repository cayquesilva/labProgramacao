/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Cayque
 */
public class ClasseDeTeste {
    
    
    public static void main(String[] args) {
      
        CD cd = new CD("Cayque","Só sucessos",5);
        MinhaCDteca cdTeca = new MinhaCDteca();

       
        cd.adicionaFaixa("Vumbora");
        cd.adicionaFaixa("Deu a louca");
        cd.adicionaFaixa("Asa Branca");

        cd.setTrilhaPrincipal("Vumbora");

        System.out.println(cd.getArtista());
        System.out.println(cd.getFaixas());
        System.out.println(cd.getTitulo());
        System.out.println(cd.getTrilhaPrincipal());

        cdTeca.adicionaCD(cd);
        System.out.println(cdTeca.getCds().toString());
        
        CD cd2 = new CD("Manolo","Deu a doida",3);
        
        cd2.adicionaFaixa("Acerehe");
        cd2.adicionaFaixa("Dandalunda");
        cd2.adicionaFaixa("McLoma");
        cd2.setTrilhaPrincipal("McLoma");
        
        cd2.mudarPrincipal("Dandalunda");
        
        System.out.println("Os cds são iguais? "+cd2.equals(cd));
        
        cdTeca.adicionaCD(cd2);
        System.out.println(cdTeca.numeroDeCDs());
        System.out.println(cdTeca.toString());
    }
}
