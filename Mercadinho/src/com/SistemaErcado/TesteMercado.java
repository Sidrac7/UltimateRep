package com.SistemaErcado;

import java.util.Scanner;

public class TesteMercado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		menu(scan);
	

	}

	public static FormaDePagamento escolherFormaDePagamento(double valor) {
		FormaDePagamento formaDePagamento = new FormaDePagamento();
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEscolha a forma de pagamento");
		System.out.println("[1]- A VISTA(DINHEIRO)");
		System.out.println("[2]- CARTÃO DE DÉBITO");
		System.out.println("[3]- CARTÃO DE CRÉDITO");
		int opcao = scan.nextInt();
		if (opcao == 1) {
			System.out.println("\nA VISTA");
			formaDePagamento.pagamentoAvista(valor);
		} else if (opcao == 2) {
			System.out.println("\nDÉBITO");
			formaDePagamento.pagamentoDebito(valor);
		} else if (opcao == 3) {
			System.out.println("\nCRÉDITO");
			formaDePagamento.pagamentoCartaoDeCredito(valor);
		} else {
			System.out.println("Forma de pagamento inválida");
		}

		return formaDePagamento;
	}

	private static Cliente inserInfoCliente(Scanner scan) {
		System.out.println("\n Informações sobre o Cliente");
		Cliente cliente = new  Cliente();
		
		System.out.println("Nome do : ");
		cliente.setNome(scan.nextLine());

		System.out.println("CPF do : ");
		cliente.setCpf(scan.nextLine());
		//scan.nextLine();
		return cliente;
		
	}
	private static Atendente inserInfoAtendente(Scanner scan) {
		System.out.println("\n Informações sobre o Atendente");
		Atendente atendente = new  Atendente();
		
		System.out.println("Nome do : ");
		atendente.setNome(scan.nextLine());

		System.out.println("CPF do : ");
		atendente.setCpf(scan.nextLine());
		//scan.nextLine();
		return atendente;
		
	}
	public static int escolherOpcaoMenu(Scanner scan) {
		System.out.println("|====SIDRAX OS | BEM-VINDO!==== |\n");
		System.out.println(".......................");
		System.out.println("|    ESCOLHA A OPÇÃO  |");
		System.out.println(".......................");
		System.out.println("|[1]-CADASTRAR ORDEM DE SERVIÇO|");
		System.out.println("|[2]-PESQUISAR ORDEM DE SERVIÇO|");
		System.out.println("|[0]-SAIR|");
		int opcaoMenu=scan.nextInt();
		return opcaoMenu;
		
		
	}
	public static void menu(Scanner scan) {
		int opcao=escolherOpcaoMenu(scan);
		do {
			scan.nextLine();
			if(opcao == 1) {
				System.out.println("\nABRINDO NOVA OS...");
			Os ordemDeServico = inserirInfoOS(scan);
			System.out.println(ordemDeServico);
			}
			opcao=escolherOpcaoMenu(scan);
		}while(opcao != 0);
		
	}
	public static Aparelho inserirInfoAparelho(Scanner scan) {
		System.out.println("\n Informações sobre o Aparelho");
		Aparelho aparelho = new Aparelho();
		System.out.println("MARCA :");
		aparelho.setMarca(scan.nextLine());
		System.out.println("MODELO :");
		aparelho.setModelo(scan.nextLine());
		System.out.println("DEFEITO :");
		aparelho.setDefeito(scan.nextLine());
		
		
		return aparelho;
		
	}
	public static Servico inserInfoServico(Scanner scan) {
		//trocar for por whihle
		//para não ser brigatório setar todas as 
		//mao de obra e pecas, mas apenas a quantidade que
		//desejar
		System.out.println("\n Informações sobre o Serviço");
		Servico servico = new Servico();
		
		String[] maoDeObra = new String[4];
		double[] valorMaoDeObra = new double[4];
		
		String[] peca = new String[4];
		double[] valorPeca = new double[4];
		int i = 0;
		int opcao = 1;
		do {
			
			
			String m=new String();
			String pc = new String();
			
			
			System.out.println("\nAdicionar Mão de obra");
			System.out.println("\nMão de obra"+i);
			m=scan.nextLine();
			System.out.println("\nValor Mão de obra");
			double valorMo=scan.nextDouble();
			scan.nextLine();
			System.out.println("\nAdicionar peça ");
			System.out.println("\nPeça ");
			pc=scan.nextLine();
			System.out.println("\nValor da Peça ");
			double valorPc=scan.nextDouble();
			
			maoDeObra[i]=m;
			valorMaoDeObra[i]=valorMo;
			peca[i]=pc;
			valorPeca[i]=valorPc;
			i++;
			System.out.println("\n[1]Registrar mao de obra ");
			System.out.println("[0]Sair ");
			opcao=scan.nextInt();
			
			scan.nextLine();
		}while(opcao != 0);
		servico.setMaoDeObra(maoDeObra);
		servico.setValorMaoDeObra(valorMaoDeObra);
		servico.setPeca(peca);
		servico.setValorPeca(valorPeca);
		System.out.println("Situação do serviço");
		servico.setSituacao(scan.nextLine());
		
		
		
		return servico;
	}
	public static Os inserirInfoOS(Scanner scan) {
		Os os = new Os();
		System.out.println("\n[1] - CADASTRAR CLIENTE");
		System.out.println("\n[2] - PESQUISAR CLIENTE");
		System.out.println("\n[0] - SAIR");
		int opcaoCliente=scan.nextInt();
		if(opcaoCliente == 1) {
			scan.nextLine();		
			Cliente c = inserInfoCliente(scan);
		os.setCliente(c);
		}
		Aparelho aparelho = inserirInfoAparelho(scan);
		os.setAparelho(aparelho);
		
		Servico servico = inserInfoServico(scan);
		os.setServicos(servico);
		FormaDePagamento formaDePagamento = escolherFormaDePagamento(os.getServicos().valorTotalSerco());
		os.setFormaDePagamento(formaDePagamento);
		
		
		return os;
	}
	

}
