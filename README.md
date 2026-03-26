# ATP-III-Reposit-rio

Estrutura Java (Maven) com os 5 exercícios da lista TPI-03.

## Estrutura de pastas

```text
src/
└── main/
    └── java/
        └── br/
            └── com/
                └── fatec/
                    └── tpi03/
                        ├── Main.java
                        ├── InputUtils.java
                        ├── Exercicio1Pares.java
                        ├── Exercicio2Fibonacci.java
                        ├── Exercicio3Primos.java
                        ├── Exercicio4MediaFatec.java
                        └── Exercicio5Incremento.java
```

## Entrada/saída e tratamento de erros

- O projeto usa **caixas de mensagem (`JOptionPane`)** para entrada e saída.
- Todos os programas possuem validação de dados e mensagens de erro para entradas inválidas.

## Como executar

1. Compilar:

```bash
mvn compile
```

2. Executar:

```bash
mvn -q exec:java -Dexec.mainClass="br.com.fatec.tpi03.Main"
```

> Se o plugin `exec-maven-plugin` não estiver instalado automaticamente, também dá para rodar com `javac` e `java`.
