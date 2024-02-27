JAVA
Atalhos:
formatar identação: Ctrl Alt L

Maven - Maven é uma ferramenta de gerenciamento de dependência
e automação de tarefas em projetos, muito utilizado no mundo Java.
O Maven funciona em uma sequência de etapas. O comando mvn test, por exemplo,
executaria as etapas:

Baixar as dependências do projeto (a partir do pom.xml);
Compilar o projeto;
Executar os testes unitários.
Primeiro, note que as dependências são instaladas como pré-requisito para o
processo de compilação, não sendo necessário baixá-las com um comando próprio
(apesar de isso ser possível).

Segundo, é importante perceber que o processo de limpeza não seria executado
nesse caso (mvn test). Isso porque o comando clean precisa ser explicitado para
acontecer.

Outro comando bastante comum é o mvn package que, além de executar as mesmas
etapas que o mvn test, também empacota a aplicação em um arquivo .jar
(aprenderemos mais sobre esse tipo de arquivo posteriormente).


Sempre que uma dependência for inserida ou alterada no projeto, é necessário
baixar novamente as dependências. O IntelliJ mostra um botão quando percebe que
o pom.xml foi mudado, mas a atualização também pode ser feita clicando com o
botão direito no projeto e escolhendo o menu Maven -> Reload project.


