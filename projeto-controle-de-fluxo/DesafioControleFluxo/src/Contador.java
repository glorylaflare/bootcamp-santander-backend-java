import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		Integer parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		Integer parametroDois = terminal.nextInt();
		
		try {
            //chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
	static void contar(Integer parametroUm, Integer parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		Integer contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        if(parametroUm > parametroDois) throw new ParametrosInvalidosException();
        
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
	}
}
