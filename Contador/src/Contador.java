import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("Parametro um deve ser menor que o segundo");
        }
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        int contagem = parametroUm - parametroDois;
        if (parametroUm < parametroDois){
            throw new ParametrosInvalidosException();
        }else { 
            for (int i = 1; i < contagem+1; i++){
            System.out.println("Numeros com base na variavel de contagem: "+i);
            }
        };
        
        
        
	}


}