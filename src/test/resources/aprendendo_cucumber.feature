#language: pt
Funcionalidade: AprendendoCucumber
Eu quero aprender Cucumber
Para que eu possa automatizar os critérios de aceitação

  Cenário: 
    Dado que criei o arquivo
    Então a especificacao deve garantir que a execucao seja bem sucedida

    
  Cenário: Deve incrementar contador
  	Dado que o valor do contador é 15
  	Quando eu incrementá-lo em 3
  	Então o seu valor será 18  
  	
  Cenário: Deve incrementar contador
  	Dado que o valor do contador é 123
  	Quando eu incrementá-lo em 35
  	Então o seu valor será 158
  	
  	
 	Cenário: Deve calcular atraso no prazo de entrega
 	
 	Dado que o prazo é dia 05/04/2018
 	Quando a entrega atrasar em 2 'dias'
 	Então a entrega será efetuada em 07/04/2018