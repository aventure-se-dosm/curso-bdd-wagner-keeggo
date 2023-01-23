#language: pt
Funcionalidade: AprendendoCucumber
Eu quero aprender Cucumber
Para que eu possa automatizar os critérios de aceitação

  Cenário: 
    Dado que criei o arquivo
    Quando executa-lo
    Então a especificacao deve garantir que a execucao seja bem sucedida

    
  Cenário: Deve incrementar contador
  	Dado que o valor do contador é 15
  	Quando eu incrementá-lo em 3
  	Então o seu valor será 18  