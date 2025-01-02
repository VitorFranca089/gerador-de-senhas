# 🔑 Gerador de Senhas em Java

Este projeto é um **Gerador de Senhas** desenvolvido em Java. Ele permite criar senhas aleatórias personalizadas com base em critérios como comprimento e tipos de caracteres (letras, números e caracteres especiais).

## ⚙️ Como Funciona?

1. Informe o comprimento da senha que deseja gerar (em número).
2. Escolha quais tipos de caracteres incluir:
    - **1** para incluir ou **0** para excluir:
        - Letras minúsculas
        - Letras maiúsculas
        - Números
        - Caracteres especiais
3. O programa cria uma senha aleatória com base nas suas escolhas e a exibe na tela.

### Exemplo:
```plaintext
Entrada:
10
1
1
1
0

Saída:
aB3dE6kN2z
```

## 🔍 Detalhes Técnicos

Este projeto foi desenvolvido utilizando conceitos importantes da linguagem Java para garantir um funcionamento eficiente e seguro. Abaixo, estão descritos os principais aspectos técnicos do código:

### 🧩 Estruturas de Dados

- **Matriz de Caracteres (`char[][] charset`)**  
  Foi utilizada uma matriz bidimensional para armazenar os diferentes conjuntos de caracteres (letras minúsculas, maiúsculas, números e caracteres especiais). Essa abordagem facilita a organização e o acesso a cada conjunto com base nas opções escolhidas pelo usuário.

  ```java
  char[][] charset = {
      "abcdefghijklmnopqrstuvwxyz".toCharArray(),
      "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(),
      "1234567890".toCharArray(),
      "!@#$%¨&*()-_=+,.;/><?[]{}".toCharArray()
  };
  ```

- **Lista Dinâmica (`List<char[]> chosenCharset`)**  
  Utilizamos a classe `List` para criar uma coleção dinâmica que agrupa os arrays de caracteres escolhidos pelo usuário. Essa estrutura permite adicionar apenas os conjuntos que atendem às opções de inclusão (indicadas pelo valor `1` no input).

  ```java
  if (options[i] == 1) {
      chosenCharset.add(charset[i]);
  }
  ```

### 🔐 Manipulação de Strings

- **`StringBuffer`**  
  A classe `StringBuffer` foi usada para construir a senha de forma eficiente e segura. Diferente da classe `String`, o `StringBuffer` é mutável e oferece melhor desempenho para operações repetitivas de concatenação. Além disso, é thread-safe, o que o torna uma escolha confiável para manipulação de strings.

  ```java
  StringBuffer stringBuffer = new StringBuffer();
  stringBuffer.append(charRand);
  ```

### 🎲 Geração de Dados Aleatórios

- **`Random`**  
  Para gerar números aleatórios, utilizamos a classe `Random`. Ela permite selecionar índices aleatórios tanto para os arrays de caracteres quanto para os caracteres individuais, garantindo que a senha gerada seja imprevisível.

  ```java
  char[] charsetRand = chosenCharset.get(random.nextInt(chosenCharset.size()));
  int charRand = random.nextInt(charsetRand.length);
  ```

### ✨ Integração e Execução

A combinação dessas estruturas e classes permite gerar senhas seguras e personalizadas com uma abordagem modular e eficiente. O uso de matrizes e listas simplifica a configuração dinâmica dos caracteres disponíveis, enquanto o `StringBuffer` e o `Random` garantem robustez e aleatoriedade no processo de construção da senha.