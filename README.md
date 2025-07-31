# Vehicle System — Exemplo de POO em Java

Este projeto demonstra os pilares da Programação Orientada a Objetos:

- **Abstração**: classe `Veiculo` define comportamento genérico.
- **Encapsulamento**: atributos privados com getters públicos.
- **Herança**: `Carro`, `Moto` e `Caminhao` estendem `Veiculo`.
- **Polimorfismo**: uso de `exibirInfo()` e `calcularIPVA()` com comportamentos diferentes.

## Como compilar e executar
```bash
javac src/model/*.java src/Main.java
java -cp src Main
```

## Sugestões de evolução
- Criar novas classes como `Onibus`, `Bicicleta`
- Adicionar métodos como `acelerar()`, `frear()`
- Implementar interface `Seguro`, `Manutenivel`
- Usar JavaFX ou Swing para UI visual