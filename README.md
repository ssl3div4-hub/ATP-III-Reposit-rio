# ATP-III-Reposit-rio

Agora cada exercício está separado em sua própria estrutura Java, como você pediu:

- `exercicio-01/src/main/java`
- `exercicio-02/src/main/java`
- `exercicio-03/src/main/java`
- `exercicio-04/src/main/java`
- `exercicio-05/src/main/java`

## Estrutura

```text
exercicio-01/
  src/main/java/br/com/fatec/tpi03/Main.java
  src/main/java/br/com/fatec/tpi03/InputUtils.java
exercicio-02/
  src/main/java/br/com/fatec/tpi03/Main.java
  src/main/java/br/com/fatec/tpi03/InputUtils.java
exercicio-03/
  src/main/java/br/com/fatec/tpi03/Main.java
  src/main/java/br/com/fatec/tpi03/InputUtils.java
exercicio-04/
  src/main/java/br/com/fatec/tpi03/Main.java
  src/main/java/br/com/fatec/tpi03/InputUtils.java
exercicio-05/
  src/main/java/br/com/fatec/tpi03/Main.java
  src/main/java/br/com/fatec/tpi03/InputUtils.java
```

## Como compilar e executar (exemplo)

```bash
cd exercicio-01
javac -d out $(find src/main/java -name '*.java')
java -cp out br.com.fatec.tpi03.Main
```

Repita trocando a pasta (`exercicio-02`, ..., `exercicio-05`) para rodar os demais.
