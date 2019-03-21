package br.com.impacta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorBean {

	private List<Integer> gerados = new ArrayList<>();
	
	public GeradorBean(){}
	
	public GeradorBean(int pQuantidade, int pValorInicial, int pValorFinal) {
		int limite = 0;
		Random rand = new Random();
		while(limite < pQuantidade){
			int num = rand.nextInt(pValorFinal+1);
			if(num >= pValorInicial){
				limite++;
				gerados.add(num);
			}
		}
	}

	public List<Integer> getGerados() {
		return gerados;
	}

	public void setGerados(List<Integer> gerados) {
		this.gerados = gerados;
	}
	
	
}
