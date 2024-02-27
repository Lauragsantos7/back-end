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


**Tipos primitivos**
Cada tipo primitivo tem um valor padrão de inicialização (ou seja, existe
mesmo quando não definido explicitamente) e ocupa um espaço específico em memória.
Os tipos primitivos possuem limite de armazenamento, conforme a tabela abaixo:

Tipo Primitivo	Valor padrão de inicialização	Tamanho	Limite de armazenamento
byte	0	1 byte	-128 até 127
short	0	2 byte	-32,768 até 32,767
int	0	4 byte	-2,147,483,648 até 2,147,483, 647
long	0L	8 byte	-9,223,372,036,854,775,808 até 9,223,372,036,854,775,807
float	0.0f	4 byte	-1.4E-45 até 3.4028235E38
double	0.0d	8 byte	-4.9E-324 até 1.7976931348623157E308
char	‘\u0000’	2 byte	0 até 65535
boolean	false	1 bit	true ou false