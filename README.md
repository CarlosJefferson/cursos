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

## Executar o app Android

Para instalar e rodar o aplicativo de exemplo no Android, siga os passos:

1. Gere o wrapper do Gradle (caso ainda n\u00e3o tenha feito):

```bash
gradle wrapper
```

Se o comando `./gradlew` retornar o erro `Unable to access jarfile`,
significa que o arquivo `gradle/wrapper/gradle-wrapper.jar` precisa ser
gerado localmente. Nesse caso, execute novamente `gradle wrapper` antes
de prosseguir.

2. Conecte um dispositivo ou inicie um emulador.

3. Na raiz do projeto, execute:

```bash
./gradlew :androidApp:installDebug
```

Esse comando compila o projeto da pasta `androidApp` e instala a vers\u00e3o de depura\u00e7\u00e3o no dispositivo ou emulador.

