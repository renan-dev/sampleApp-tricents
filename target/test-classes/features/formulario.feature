#language: pt
#encoding: utf-8

Funcionalidade: Preencher por completo o formul�rio Automobile Insurance

Cenario: Validar envio do e-mail com o formul�rio preenchido
	Dado que estou no menu Automobile Insurance do site SampleApp
	E preencho os campos da aba "Enter Vehicle Data"
	E preencho os campos da aba "Enter Insurant Data"
	E preencho os campos da aba "Enter Product Data"
	E preencho os campos da aba "Select Price Option"
	E preencho os campos da aba "Send Quote"
	Quando clico no bot�o Send
	Entao devo ver a mensagem "Sending e-mail success!" na tela