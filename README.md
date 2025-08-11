# Relógios Regionais em Java

Este projeto implementa uma hierarquia de classes em Java para representar relógios de diferentes regiões do mundo, focando no Brasil e nos Estados Unidos.

## Funcionalidades

- Classe base `Clock` com propriedades `hour`, `minute` e `second` e seus getters e setters, garantindo valores válidos.
- Método `getTime()` que retorna a hora no formato `HH:MM:SS`.
- Método abstrato `convert(Clock clock)` para que subclasses implementem a lógica de conversão entre diferentes tipos de relógios.
- Implementações concretas:  
  - `BRLClock`: relógio no formato 24 horas (Brasil).  
  - `USClock`: relógio no formato 12 horas (EUA), ajustando horas maiores que 12 para o formato correto.

## Como usar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
