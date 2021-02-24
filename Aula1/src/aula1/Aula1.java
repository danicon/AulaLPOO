/*
package aula1;

public class Aula1 {

    public static void main(String[] args) {
        
        Carro gol = new Carro();
        Carro passat = new Carro();
        
        gol.ignicao = true;
        gol.qtd_combustivel = 2;
        gol.velocidadeAtual = 0;
        gol.valor = 25000;
        gol.modelo = "gol";
        
        passat.ignicao = false;
        passat.qtd_combustivel = 10;
        passat.velocidadeAtual = 80;
        passat.modelo = "passat";
       
        
        gol.painel();
        gol.acelerar();
        gol.painel();
        gol.acelerar();
        gol.painel();
        gol.acelerar();
        
    }
    
}
*/


package aula1;

public class Aula1 {

	public static void main(String[] args) {
		
		Carro gol = new Carro();
		Carro passat = new Carro();
		
		gol.modelo = "gol";
		passat.modelo = "passat";
		
		/*gol.painel();
		passat.painel();*/
                
                gol.ligar();
		gol.painel();
                gol.acelerar();
                gol.painel();
                gol.acelerar();
                gol.painel();
                gol.acelerar();
                gol.painel();
                gol.frear();
                gol.painel();
                gol.desligar();
                gol.painel();
		
		 
	}

}
