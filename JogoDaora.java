/* Jogo de Aventura em JAVA! - Segunda Fase Trilha dos DEV'S 
			Feito por: Laura Steinert de Freitas  email: laurasteinert@usp.br NUSP: (vai que precisa né) 10725244
				Descrição: jogo simples de escolha, a ser rodado no terminal do computador. 
							Infelizmente, meu terminal não permite print de acentos, então tive que retirar os mesmos.
								No mais, é um jogo em que você é um ganso. E deve fazer o que gansos fazem. Provocar o caos.
																	:D
																								*/
import java.util.Scanner;
public class JogoDaora{
	static Scanner input = new Scanner(System.in); //Criação de scanner para interação com usuário
	public static void jogo(int i)throws InterruptedException{ //Exceção criada especificamente para pausas durante os diálogos.
		//Criação de váriaveis
		String nome; //Nome do usuário
		String lugar; //Lugar favorito do usuário
		int escolha =0; //Escolha do usuário
		//Começo do diálogo com o usuário
		System.out.println("Bem vindo, andarilho.");
		Thread.sleep(3500); //Pausa
		System.out.println("Voce agora se tornou um ser etereo, escolhido pelos deuses para trazer o caos, e deve viver como tal.");
		Thread.sleep(4500); //Pausa
		System.out.println("Espero que tenha ciencia da tarefa que pegou.");
		Thread.sleep(4500); //Pausa
		System.out.println("Primeiramente, seu dever sera, como deve saber, provocar o caos em toda a paz do mundo.");
		Thread.sleep(4500); //Pausa
		System.out.println("E encontrar um parceiro, para prosseguir com sua especie.");
		Thread.sleep(4500); //Pausa
		System.out.println("Como voce ira levar essa nova vida, que so vai durar um dia porque tenho pouco tempo para fazer um jogo?"); 
		Thread.sleep(4500); //Pausa
		System.out.println("So basta voce decidir. Informacao importante: voce se tornou um GANSO.");
		Thread.sleep(4500); //Pausa
		System.out.println("E qual seria teu nome, ser de morais questionaveis?");
		nome = input.nextLine(); //Abastecendo a variável com a escolha de nome do usuário
		System.out.println("Em qual parque voce gostaria de morar como um ganso abencoado? So o nome, se possivel.  A utilizacao de espacos e bem vinda! :D - desde a v2");
		lugar = input.nextLine(); //Abastecendo a variável com a escolha de lugar do usuário
		System.out.printf("Pois bem, %s de %s. Voce deve partir em sua aventura.",nome,lugar);
		System.out.println(""); //Para dar um espaço antes da próxima interação
		Thread.sleep(4500); //Pausa
		System.out.println("*DIA 1*");
		System.out.printf("Voce acorda em sua casa, em %s. Esta um dia lindo e o dia parece querer a calma e o amor humano.",lugar);
		System.out.println(""); //Para dar um espaço antes da próxima interação
		Thread.sleep(4500); //Pausa
		System.out.printf("Claro que o dia nao te conhece. O que voce fara primeiro %s?",nome);
		System.out.println(""); //Para dar um espaço antes da próxima interação
		Thread.sleep(4500); //Pausa
		System.out.println("1 - PROCURAR POR ALIMENTO, TENHO FOME."); //Primeiras escolhas
		System.out.println("2 - PROCURAR POR AGUA, TENHO SEDE.");
		System.out.println("3 - PROCURAR POR GUERRA, TENHO SEDE DE HUMANOS.");
		while(escolha != 1 || escolha != 2 || escolha !=3){
			escolha = input.nextInt(); //Abastecendo a variável com a escolha do usuário
			input.nextLine(); //Para passar para a próxima linha
			switch (escolha){ //Para cada escolha feita
				case 1: //Caso o usuário escolha procurar alimento
					System.out.printf("Voce sai de casa em busca de alimentacao. Ao encontrar um dos varios banquinhos de %s, ve uma senhora comendo um sanduiche de presunto.",lugar);
					System.out.println(""); //Para dar um espaço antes da próxima interação
					Thread.sleep(4500); //Pausa
					System.out.printf("Nao que voce tenha ciencia do que e presunto. O que voce fara, %s?",nome);
					System.out.println(""); //Para dar um espaço antes da próxima interação
					Thread.sleep(4500); //Pausa
					System.out.println("1 - ATACAR A VELHINHA E ROUBAR TODO O SANDUICHE"); //Segunda escolha do usuário
					System.out.println("2 -  ATACAR A VELHINHA E ROUBAR SOMENTE O PRESUNTO");
					while(escolha != 1 || escolha != 2){ //Enquanto a escolha não for válida
						escolha =input.nextInt(); //Abastecendo a variável com a escolha do usuário
						if(escolha == 1){ //Caso o usuário escolha roubar o sanduíche inteiro.
							System.out.println("Voce ataca a velhinha, dando seu fatidico grito de guerra. A velhinha pula em um susto, e tenta te enrolar dando migalhas. ");
							Thread.sleep(4500); //Pausa
							System.out.println("Voce recusa e pula para o banco, na tentativa de pegar o que os deuses te deram de presente. ");
							Thread.sleep(4500); //Pausa
							System.out.println("Voce se lanca contra a velhinha, e ela solta o sanduiche. ");
							Thread.sleep(4500); //Pausa
							System.out.println("Quando voce pensa que chegou em seu objetivo, percebe que nao ha formas de pegar o sanduiche inteiro sem amassa-lo drasticamente. Voce deseja ter polegares opositores.");
							Thread.sleep(4500); //Pausa
							System.out.printf("A essa altura, a velhinha ja saiu correndo e chamou os guardas de %s. Voce e pego e levado contra a sua vontade de volta para sua casa.",lugar);
							System.out.println(""); //Para dar um espaço antes da próxima interação
							Thread.sleep(4000); //Pausa
							System.out.println("**BAD ENDING - Final ruim.**");
							Thread.sleep(3500); //Pausa
							System.out.println("Parabens forasteiro! Voce terminou o jogo!");
							Thread.sleep(3500); //Pausa
							System.out.println("Muito obrigada por jogar! :D");
							Thread.sleep(2500); //Pausa
							System.out.println("THE END");
							Thread.sleep(1500); //Pausa
							System.out.println("Por: Laura Steinert de Freitas.");
							break;
						} else if(escolha == 2){ //Caso o usuário escolha roubar somente o presunto.
							System.out.println("Voce ataca a velhinha, dando seu fatidico grito de guerra. A velhinha pula de susto, e tenta te enrolar dando migalhas.");
							Thread.sleep(4500); //Pausa
							System.out.println("Voce pula para o banco, na tentativa de pegar o que os deuses te deram de presente.");
							Thread.sleep(4500); //Pausa
							System.out.println(" Voce comeca a enrolar a velhinha, chegando devagar fingindo que quer as migalhas.");
							Thread.sleep(4500); //Pausa
							System.out.println("Quando tem a confianca da velhinha, voce surrupia o presunto, fugindo em seguida.");
							Thread.sleep(4500); //Pausa
							System.out.printf("A velhinha grita, mas a adrenalina e tanta que voce nao percebe. Voce volta para a sua casa, e o cheiro de presunto atrai um parceiro que tambem mora em %s.",lugar);
							System.out.println(""); //Para dar um espaço antes da próxima interação
							Thread.sleep(4500); //Pausa
							System.out.println("Voces tem uma noite de romance com um jantar regado a presunto e choros de velhinhas.");
							Thread.sleep(4000); //Pausa
							System.out.println("**GOOD ENDING - Final bom.**"); 
							Thread.sleep(3500); //Pausa
							System.out.println("Parabens forasteiro! Voce terminou o jogo!");
							Thread.sleep(3500); //Pausa
							System.out.println("Muito obrigada por jogar! :D");
							Thread.sleep(2500); //Pausa
							System.out.println("THE END");
							Thread.sleep(1500); //Pausa
							System.out.println("Por: Laura Steinert de Freitas.");
							break;
						} else System.out.println("Escolha invalida, forasteiro.");
					}
					break;
				case 2: //Caso o usuário escolha procurar água
					System.out.println("Voce sai da sua casa para um lago proximo. Nele, voce acaba percebendo que ha um casal na beira, em um piquenique.");
					Thread.sleep(4500); //Pausa
					System.out.println("Voce localiza agua em garrafa e pensa que agua em garrafa e muito melhor que a agua cheia de bacterias do lago.");
					Thread.sleep(4500); //Pausa
					System.out.println("Pensamento interessante, uma vez que voce nao sabe o que sao bacterias.");
					Thread.sleep(4500); //Pausa
					System.out.printf("Voce nao sabe como vai beber agua em garrafa. Voce nao se importa. O que voce fara, %s?",nome);
					System.out.println(""); //Para dar um espaço antes da próxima interação
					Thread.sleep(4500); //Pausa
					System.out.println("1 - ATACAR O CASAL E PEGAR A AGUA ENGARRAFADA"); //Segunda escolha do usuário
					System.out.println("2 -  NAO ATACAR O CASAL MAS PEDIR PARA OS HUMANOS A AGUA");
					while(escolha != 1 || escolha != 2){ //Enquanto a escolha não for válida
						escolha =input.nextInt(); //Abastecendo a variável com a escolha do usuário
						if(escolha == 1){ //Caso o usuário escolha atacar o casal.
							System.out.println("Voce segue seu instinto natural e corre em direcao ao casal, prestes a entrar em uma batalha. ");
							Thread.sleep(4500); //Pausa
							System.out.println("Voce da seu grito de guerra, deixando os humanos em alerta. Um deles tenta proteger o outro.");
							Thread.sleep(4500); //Pausa
							System.out.printf("E inutil. Voce, %s, e forte demais. Voce morde o braco de um deles com seus dentes de ganso, a criacao mais controversa de seus deuses loucos.",nome);
							System.out.println(""); //Para dar um espaço antes da próxima interação
							Thread.sleep(4500); //Pausa
							System.out.println("Ambos fogem correndo. Voce se delicia com o piquenique, sabendo que contribuiu para o caos humano mais um dia. ");
							Thread.sleep(4500); //Pausa
							System.out.println("Porem, nao conseguiu voltar para a casa na hora, e foi dormir sozinho perto do lago com sua sede saciada apos muitas tentativas em beber agua engarrafada. ");
							Thread.sleep(4000); //Pausa
							System.out.println("**NEUTRAL ENDING - Final neutro.**");
							Thread.sleep(3500); //Pausa
							System.out.println("Parabens forasteiro! Voce terminou o jogo!");
							Thread.sleep(3500); //Pausa
							System.out.println("Muito obrigada por jogar! :D");
							Thread.sleep(2500); //Pausa
							System.out.println("THE END");
							Thread.sleep(1500); //Pausa
							System.out.println("Por: Laura Steinert de Freitas.");
							break;
						} else if(escolha == 2){
							System.out.printf("Ao ouvir tal escolha, os deuses ficam irritados. 'Esqueceste de teu papel %s?'.",nome);
							System.out.println(""); //Para dar um espaço antes da próxima interação
							Thread.sleep(4500); //Pausa
							System.out.println("Um ganso sempre, sempre, deve trazer o caos e a discordia para humanos. Alem disso, voce nao teria nem como pedir, voce e UM GANSO.");
							Thread.sleep(4500); //Pausa
							System.out.println("Realmente uma escolha mal feita. Uma decepcao. No caminho para os humanos, voce comeca a perder suas penas.");
							Thread.sleep(4500); //Pausa
							System.out.printf("Seu bico se transforma em algo menos incrivel. Voce se torna h u m a n o. Voce esta nu, no meio de %s.",lugar);
							System.out.println(""); //Para dar um espaço antes da próxima interação
							Thread.sleep(4500); //Pausa
							System.out.println("Os humanos gritam. A policia e chamada. Voce e preso por atentado ao pudor. Voce esta sozinho. ");
							Thread.sleep(4000); //Pausa
							System.out.println("**BAD ENDING - Final ruim.**");
							Thread.sleep(3500); //Pausa
							System.out.println("Parabens forasteiro! Voce terminou o jogo!");
							Thread.sleep(3500); //Pausa
							System.out.println("Muito obrigada por jogar! :D");
							Thread.sleep(2500); //Pausa
							System.out.println("THE END");
							Thread.sleep(1500); //Pausa
							System.out.println("Por: Laura Steinert de Freitas.");
							break;
						} else System.out.println("Escolha invalida, forasteiro.");
					}
					break; 
				case 3: //Caso o usuário escolha procurar guerra
					System.out.println("Muito bem, meu caro. Voce realmente nasceu para ser um ganso abencoado pelos deuses.");
					Thread.sleep(4500); //Pausa
					System.out.printf("Voce sai da sua casa em %s em busca de humanos desafortunados para receber tua ira.",lugar);
					System.out.println(""); //Para dar um espaço antes da próxima interação
					Thread.sleep(4500); //Pausa
					System.out.printf("Voce ve uma bela familia jogando frisbee. Mal eles sabem que o pior dia para jogar frisbee seria hoje, tolos. %s esta aqui. O que voce fara?",nome);
					System.out.println(""); //Para dar um espaço antes da próxima interação
					Thread.sleep(4500); //Pausa
					System.out.println("1 - ATACAR DE SURPRESA OS HUMANOS"); //Segunda escolha do usuário
					System.out.println("2 -  COMECAR A GRITAR PARA ASSIM ATRAIR MAIS GANSOS");
					while(escolha != 1 || escolha != 2){ //Enquanto a escolha não for válida
						escolha =input.nextInt(); //Abastecendo a variável com a escolha do usuário
						if(escolha == 1){
							System.out.printf("Voce corre em direcao a familia, que despreocupadamente joga frisbee. Voce, %s, sera a ultima coisa que verao.",nome);
							System.out.println(""); //Para dar um espaço antes da próxima interação
							Thread.sleep(4500); //Pausa
							System.out.println("Quando um dos pais faz uma jogada, voce pega o frisbee em pleno ar. Os humanos estao boquiabertos. ");
							Thread.sleep(4500); //Pausa
							System.out.println("Voce se enche de animacao, comecando a destruir o frisbee com seus dentes de ganso. As criancas choram.");
							Thread.sleep(4500); //Pausa
							System.out.printf("Voce nao se importa. Apos o frisbee estar imovel, voce vira para a familia. Um belo dia em %s. ",lugar);
							System.out.println(""); //Para dar um espaço antes da próxima interação
							Thread.sleep(4500); //Pausa
							System.out.println("Voce grita, anunciando suas intencoes. A familia nao sabe o que fazer. Voce corre e morde a perna de um dos humanos.");
							Thread.sleep(4500); //Pausa
							System.out.printf("Adulto, crianca? Nao importa. O que importa e que ninguem e pareo para %s.",nome);
							System.out.println(""); //Para dar um espaço antes da próxima interação
							Thread.sleep(4500); //Pausa
							System.out.println("A familia sai correndo, e voce danca em cima do tumulo do frisbee. Um otimo dia para o caos, mas um pessimo dia para tentar acasalar. Voce esta cansado.");
							Thread.sleep(4500); //Pausa
							System.out.println("Voce volta para casa, carregando um sorriso de vitoria, dormindo um sono sem sonhos.");
							Thread.sleep(4000); //Pausa
							System.out.println("**GOOD ENDING - Final bom.**");
							Thread.sleep(3500); //Pausa
							System.out.println("Parabens forasteiro! Voce terminou o jogo!");
							Thread.sleep(3500); //Pausa
							System.out.println("Muito obrigada por jogar! :D");
							Thread.sleep(2500); //Pausa
							System.out.println("THE END");
							Thread.sleep(1500); //Pausa
							System.out.println("Por: Laura Steinert de Freitas.");
							break;
							} else if(escolha == 2){
							System.out.println("Voce comeca a berrar, atraindo todos os gansos em um raio de 200km. Um mutirao de mais de cinquenta gansos aparecem, e todos atacam a familia juntos.");
							Thread.sleep(4500); //Pausa
							System.out.println("Os pais levam os filhos correndo de volta para onde vieram. Seu batalhao grita com mais uma vitoria (claramente, voces se encontraram em outras batalhas antes).");
							Thread.sleep(4500); //Pausa
							System.out.println(" Voce se sente satisfeito, ao ver o mundo um pouco mais caotico que antes. Os deuses veem seu trabalho, com um sorriso. ");
							Thread.sleep(4500); //Pausa
							System.out.printf("Uma luz desce dos ceus, mirando em ti, com uma voz clamando %s.",nome);
							System.out.println(""); //Para dar um espaço antes da próxima interação
							Thread.sleep(4500); //Pausa
							System.out.println("Voce e convidado para viver a eternidade no mundo dos deuses, como um deus do caos. Voce aceita a honra, e e coroado por ninfas.");
							Thread.sleep(4500); //Pausa
							System.out.println("Seu batalhao te sauda enquanto voce sobe as escadas divinas. E um bom dia.");
							Thread.sleep(4000); //Pausa
							System.out.println("**TRUE ENDING - Final verdadeiro.**");
							Thread.sleep(4000); //Pausa
							System.out.println("Voce encontrou o final verdadeiro! Muitas bencaos divinas cairao em ti!");
							Thread.sleep(3500); //Pausa
							System.out.println("Parabens forasteiro! Voce terminou o jogo!");
							Thread.sleep(3500); //Pausa
							System.out.println("Muito obrigada por jogar! :D");
							Thread.sleep(2500); //Pausa
							System.out.println("THE END");
							Thread.sleep(1500); //Pausa
							System.out.println("Por: Laura Steinert de Freitas.");
							break;
							} else  System.out.println("Escolha invalida, forasteiro.");
					}
					break;
				default: System.out.println("Escolha invalida, forasteiro.");
					break;
			} break;
		}
	}
	public static void main(String[]args)throws InterruptedException{
		int fim = 0;
		while(fim != 2){
			jogo(1);
			System.out.println("Comecar novamente?");
			System.out.println("1 - SIM");
			System.out.println("2 - NAO");
			fim = input.nextInt();
		}
	}
}
