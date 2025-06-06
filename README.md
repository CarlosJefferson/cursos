# cursos

Este repositório contém um exemplo simples de projeto **Kotlin Multiplatform**.

A pasta `lib` implementa uma biblioteca multiplataforma com uma classe
`Calculator` que oferece operações básicas de soma, subtração,
multiplicação e divisão. Os testes garantem o funcionamento das
operações comuns em todas as plataformas.

O arquivo `gradle/wrapper/gradle-wrapper.jar` não é versionado. Para
executar o projeto, gere o wrapper localmente com:

```
gradle wrapper
```

Depois, rode os testes com:

```
./gradlew jvmTest
```
