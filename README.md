# ler arquivos com class File e Scanner
# IOException (Exception)
  - exceção ao trabalhar com arquivos
  - obrigatório tratar (try catch)
# FileReader
- Strem de leitura de caractereses a partir de arquivos

# BufferedRead
- Implementado a partir do BufferedReader (mais rapido)
```java
fr = new FileReader(path);
br = new BufferedReader(fr);
```

# Try-with-resources
- é um bloco try que declara um ou mais recursos e garante qwue esses serão fechados ao final do bloco
- disponivel java 7+