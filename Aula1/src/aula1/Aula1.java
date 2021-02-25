
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
