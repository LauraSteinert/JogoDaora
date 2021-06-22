## JogoDaora
Jogo simples de escolha, a ser rodado no terminal do computador.  
Infelizmente, meu terminal não permite print de acentos, então tive que retirar os mesmos. No mais, é um jogo em que você é um ganso. E deve fazer o que gansos fazem: **Provocar o caos** 😄
 

# Racicionio
Meu raciocínio para o Jogo foi basicamente criar condições para cada escolha do usuário.  
Optei por fazer uma função separada para isso, mantendo o jogo em uma função chamada “jogo” e, no escopo principal do código, no “main” (que é chamado ao colocar o programa em java para rodar), as condições para se o usuário querer continuar o jogo após jogar uma vez ou terminar o programa.  
Na função jogo, comecei partindo de três caminhos principais, onde o usuário escolheria para qual caminho iria seguir. Em cada caminho principal, dois finais são possíveis, totalizando seis finais.  
Também criei prints (uma forma de aparecer coisas no terminal do usuário) para aparecer na tela caso o usuário dê números fora do esperado, e o laço de coisas dentro do código ocorrerá até o usuário colocar um dos números válidos, a partir de um “while” (enquanto a variável - onde o número que o usuário passou está armazenado - não for algum número que leve à continuidade do código) que roda até a escolha ser um número válido.   

## Interação com o usuário
O código se baseia principalmente em print’s para interação com o usuário. Alguns prints que usam as variáveis passadas pelo usuário, como nome (abastecido na variável “nome” com um scanner - que pega o que o usuário digitou no terminal e guarda em uma variável - de strings, ou seja, de palavras) e lugar (abastecido na variável “lugar” com um scanner de strings) necessitam de um print vazio (“”) para dar espaço entre uma frase e outra.  
Além disso, criei uma exceção tanto na função de jogo quanto no main (“throws InterruptedException” após a declaração do main) para conseguir dar um espaço de tempo (“Thread.sleep()”) entre as interações, dando ao usuário mais tempo para ler cada interação antes da próxima aparecer. Essa exceção interrompe o funcionamento do código por alguns segundos, escritos em milissegundos, variando de 4,5 segundos à 1,5 segundos.  
Na escolha principal, uma variável é abastecida chamada “escolha”, utilizando um scanner para ver o que o usuário digitou. Essa escolha é avaliada em um switch, que avalia a variável e vê se é a que o código precisa, para saber se o número guardado é 1,2,3 ou inválido. Caso o usuário escolha um número inválido, tipo 4, uma mensagem irá aparecer e a escolha pode ser feita novamente.   
Então, após a escolha do caminho principal, o usuário cai nas situações com dois finais, dependendo da segunda escolha do usuário. A variável “escolha” é atualizada, e entra em um condicional de if’s - se algo for x, faça y. Neles, também temos um else - caso a variável não seja 1 nem 2, faça isso - que mostra uma mensagem de escolha inválida, sendo a entrada digitada diferente de 1 ou 2, fazendo o laço de inserir a variável acontecer novamente até o usuário digitar uma escolha válida.  

## Finais
Dependendo da escolha, se a variável guarda o número 1 ou 2, o usuário cai em um dos finais. Em cada final aparece o tipo de final que o usuário pegou, variando entre bom, neutro, ruim e verdadeiro, de acordo com o nível de caos causado. Temos dois finais bons, um final neutro, dois ruins e um verdadeiro. O verdadeiro seria o que deveria acontecer ao final do jogo, onde o usuário recebe uma mensagem especial e prova que é um agente do caos (o jogo foi inspirado em Untitled Goose Game).  
Depois do final, aparece uma mensagem padrão de final do jogo, com meu nome (Laura Steinert 🌠) escrito. Depois disso, o usuário sai da função e entra na condição do main, que diz que, enquanto o usuário não digitar 2 (ou seja, a opção NÃO) para continuar o jogo, o jogo roda novamente, recriando todas as situações, incluindo nome e lugar de escolha. 

# Melhorias
Gostaria de ter incluído imagens em ASCII, como esta aqui, mas sendo talvez um ganso, ou a velhinha, ou o sanduíche de presunto até:   

░▄▀▄▀▀▀▀▄▀▄░░░░░░░░░  
░█░░░░░░░░▀▄░░░░░░▄░  
█░░▀░░▀░░░░░▀▄▄░░█░█  
█░▄░█▀░▄░░░░░░░▀▀░░█  
█░░▀▀▀▀░░░░░░░░░░░░█  
█░░░░░░░░░░░░░░░░░░█  
█░░░░░░░░░░░░░░░░░░█  
░█░░▄▄░░▄▄▄▄░░▄▄░░█░  
░█░▄▀█░▄▀░░█░▄▀█░▄▀░  
░░▀░░░▀░░░░░▀░░░▀░░░  

Mas ainda não consegui fazer uma função que recebesse caracteres em ASCII para o terminal. Algo que eu gostaria de trabalhar mais para frente seria inserir imagens assim no jogo. No mais, acredito que foi uma ótima experiência e gostaria de agradecer a oportunidade! :D Muito obrigada Núcleo de Empreendedorismo da USP!! <3 
