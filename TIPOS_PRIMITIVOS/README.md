# TIPOS PRIMITIVOS

Os tipos primitivos são usados para criação de variaveis, ela é responsável por alocar uma quantidade especifica na memória dependendendo da variavel que voce quer trabalhar, portanto voce deve escolher bem o tipo de variavel que quer trablhar pois isso pode interferir diretamente na otimização do seu programa.

## COMO DECLARAR UMA VARIAVEL

Na linguagem JAVA e como em muitas linguagens de alta tipagem, deve-se indicar qual o tipo de variavel que vai ser armazenada, iniciando com o tipo primitivo e seguido pela referencia/nome da variavel, como no exemplo:

    *tipo_primitivo* nome = valor;

OBS: Vale ressaltar que quando a intrução é finalizada, deve-se usar `;`.

Neste exemplo o `tipo_primitivo` é a tipagem da variavel e o `nome` é por sua convenção, observa-se que o nome da variavel deve ser em letras minusculas para que outras pessoas ou até voce consiga diferencia-la ao decorrer do código.

## NUMEROS INTEIROS

 |TIPO   |MEMÓRIA (bits)|  VALORES                 |
 |-------|--------------|--------------------------|
 |byte   |8             |-128 a 128                |
 |short  |16            |-32768 a 32767            |
 |int    |32            |-2147483648 a 2147483647  |
 |long   |64            |-2⁶³ a 2⁶³-1              |

## NUMEROS COM DECIMAIS

 |TIPO   |MEMÓRIA (bits)|
 |-------|--------------|
 |float  |32            |
 |double |64            |

## VERDADEIRO OU FALSO

 |TIPO   |MEMÓRIA (bits)|VALORES       |
 |-------|--------------|--------------|
 |boolean|1             |true ou false |
 
De um olhada na pasta /scr/App.java , la coloquei na pratica para voce.
