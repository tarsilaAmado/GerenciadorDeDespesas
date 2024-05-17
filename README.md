# GerenciadorDeDespesas 
 Universidade Católica de Pernambuco
 
 Projeto de Programação Orientada a Objetos
 
 Professora: Ivna 
 
 Aluna: Tarsila Amado Alves de Brito

Gerenciador de Despesas 

Criei esse projeto depois de vivenciar a falta de organização financeira no meu ciclo social.
O aplicativo de Gerenciamento de Despesas possibilita que os usuários adicionem gastos mensais, removam débitos pagos e vejam o total gasto no mês. Funciona quase que como uma agenda de débitos. Os dados serão salvos em um arquivo para que persistam entre as sessões. Utilizei herança, abstração e polimorfismo para melhorar esse projeto que pensei em criar desde o começo da cadeira. Pretendo adicionar lembretes de pagamento e outras funções, mas apenas quando terminar a interface, que tem sido a parte mais desafiadora. 

Requisitos Funcionais do Projeto:

*Adicionar Despesa = create
*Remover Despesa = delet
*Listar Despesas = read
*Adicionar Receita = creat
*Listar Receitas = read
*Calcular Total de Despesas = read
*Calcular Total de Receitas = read


////////////////////////////////////////////////////

Descrições:

Transacao    
- descrição: String
- valor: double      
- data: String
 getDescricao():    
 getValor():        
 getData():   
Despesa + Receita
GerenciadorDespesas
- transações: ArrayList
- arquivo: String 
  adicionarTransacao() 
  removerTransacao() 
  listarTransacoes()   
  calcularTotalDespesas() 
  salvarTransacoes()   
  carregarTransacoes()

  
 Utilizei a herança para as classes Despesa e Receita (herdam da Transação), abstração para a classe Transação, e polimorfismo para os métodos aceitando objetos do tipo Transação. Do CRUID usei create, delete e read.

