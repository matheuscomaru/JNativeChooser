# JNativeChooser

Seletor de arquivos nativo para aplicações Java Swing no Windows usando JNA.

## Instalação

Baixe o arquivo `JNativeChooser.jar` na seção de releases deste repositório e adicione-o ao classpath do seu projeto.

## Exemplo de uso

```java
import jnativechooser.NativeFileChooser;

// Para aceitar todos os arquivos
String caminho = NativeFileChooser.showDialog(null);

// Para filtrar por extensões (ex: PDF e imagens)
String[] extensoes = {"pdf", "jpg", "jpeg", "png"};
String caminho = NativeFileChooser.showDialog(null, extensoes);

if (caminho != null) {
    System.out.println("Arquivo selecionado: " + caminho);
}
```

## Contribua com um café ☕
Se este projeto te ajudou, considere contribuir com um café via Pix:

**Chave Pix:** matheuscomaru@gmail.com

---

**Licença:** MIT

Desenvolvido por [Matheus Comaru](https://github.com/matheuscomaru)
