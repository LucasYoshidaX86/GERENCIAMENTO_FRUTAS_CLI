//Importando bibliotecas.
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.InputMismatchException;

//Criando classe para o sistema de gerenciamento de lista de frutas.
public class ListGerenciamentoFrutas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<String> frutas = new HashSet<>();
	
//Criando loop para funcionamento do sistema.
		while (true) {
			//Utilizando try catch para tratar exceções.
			try {
				//Exibição das opções de execução.
				System.out.println("\nEscolha uma opção:");
				System.out.println("1. Adicionar uma fruta");
				System.out.println("2. Listar todas as frutas");
				System.out.println("3. Remover uma fruta");
				System.out.println("4. Verificar se uma fruta está presente");
				System.out.println("5. Sair");
				System.out.println("Opção: ");
				//Armazenando entrada da informação digitada pelo usuário.
				int opcao = scanner.nextInt();
				scanner.nextLine();
				//Utilizando switch case para tomar decisão de acordo com a resposta do usuário.
				switch (opcao) {
					case 1: //Ação para adicionar uma fruta a lista caso seja selecionada:
						System.out.println("Digite o nome da fruta para adicionar: ");
						String novaFruta = scanner.nextLine(); //Recebendo entrada de informação.
						if (frutas.add(novaFruta)) {
							System.out.println(" foi adicionada."); //Confirmação da ação com exibição de mensagem.
						} else {
							System.out.println(" já está presente no conjunto."); //Caso já exista a fruta, exibe esta informação.
						}
						break;
					case 2: //Ação para exibir frutas da lista.
						System.out.println("Frutas: " + frutas);
						break;
					case 3: //Ação para remover uma fruta da lista, onde quando selecionada:
						System.out.println("Digite o nome da fruta que deseja remover: ");
						String frutaRemover = scanner.nextLine(); //Recebendo entrada de informação.
						if (frutas.remove(frutaRemover)) {
							System.out.println(frutaRemover + " foi removida."); //Confirmação da ação com exibição de mensagem.
						} else {
							System.out.println(frutaRemover + " não foi encontrada."); //Caso não exista a fruta, exibe esta informação. 
						}
						break;
					case 4: //Ação para verificar se existe a fruta na lista.
						System.out.println("Digite o nome da fruta para verificar: ");
						String frutaVerificar = scanner.nextLine(); //Recebendo entrada de informação.
						if (frutas.contains(frutaVerificar)) {
							System.out.println(frutaVerificar + " está presente no conjunto."); //Confirmação da ação caso a fruta já esteja na lista e exibe confirmação.
						} else {
							System.out.println(frutaVerificar + " não foi encontrada no conjunto."); //Caso não exista a fruta, exibe esta informação.
						}
						break;
					case 5: //Encerrando programa.
						System.out.println("Saindo...");
						scanner.close();
						return;
					default: //Exibe a mensagem caso o número digitado não corresponda as opções disponíveis de execução. 
						System.out.println("Opção invalida. Tente novamente.");
				}
			} catch (InputMismatchException e) { //Ação caso a entrada de informação não seja adequada/esperada pelo sistema, por exemplo um texto ao invés de número quando escolhemos qual execução queremos. 
				System.out.println("Entrada inválida. Por favor, digite um número.");
				scanner.nextLine();
			}
		}

	}

}

