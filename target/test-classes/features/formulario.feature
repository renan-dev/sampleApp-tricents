#language: pt
#encoding: utf-8

Funcionalidade: Preencher por completo o formulário Automobile Insurance

Cenario: Validar envio do e-mail com o formulario preenchido
	Dado que estou no menu Automobile Insurance do site SampleApp
	E preencho os campos da aba "Enter Vehicle Data" e clico no botao Next
	E preencho os campos da aba "Enter Insurant Data" e clico no botao Next
	E preencho os campos da aba "Enter Product Data" e clico no botao Next
	E preencho os campos da aba "Select Price Option" e clico no botao Next
	E preencho os campos da aba "Send Quote" e clico no botao Next
	Quando clico no botao Send
	Entao devo ver a mensagem "Sending e-mail success!" na tela