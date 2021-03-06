#language:pt
#  Funcionalidade: Descreve qual o objetivo do swite de testes
#  Contexto: São "steps" que são comuns a todos os testes presentes na funcionalidade
#  Cenário: Descreve o intuito e o que se espera do caso de teste
#  Dado: especifica o contexto do
#  Quando: especifica uma ação de teste que deve ser realizada
#  E: concatena ações a serem realizadas
#  Then: apresenta o resultado esperado do teste
#  As anotações representadas por "@NomeDaTag" é útil na seleção dos casos de teste a serem utilizados

@EXAMPLES
Funcionalidade: Realizar o download de uma carta de circularização
  Como um usuário
  Eu quero validar as funcionalidades da tela de download da carta de circularização

  Contexto:
#    Dado que acesso o site de exemplo

  @Examples_01 @validado
  Cenário: Deve acessar o site de exemplo
    Dado que clico em "Input Forms"
#    Quando clico no botão "Buscar"
#    Então é exibido a mensagem "Campo obrigatório"