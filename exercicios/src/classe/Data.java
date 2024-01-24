package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;

	Data(){
		dia = 29;
		mes = 05;
		ano = 1998;
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
