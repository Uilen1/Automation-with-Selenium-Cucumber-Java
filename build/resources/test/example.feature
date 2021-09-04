#language:pt

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