#language:pt
@login
Funcionalidade: realizar login no sistema de gestão da clientes
  Para validar a autenticação no sistema de gestão clientes
  Como usuário do sistema 
  Eu quero logar e validar as permissões de administrador e comum.

  Contexto: possibilidade de acessar o sistema
    Dado que usuário possa acessar a tela de login do sistema

  Cenario: realizar login no sistema com usuários válidos
    Quando informar um <Usuario> válido
    E inserir uma <Senha> válida
    Então o sistema deve permitir a autenticação do usuário
    E o tipo de <Perfil> do usuário deve ser exibido
