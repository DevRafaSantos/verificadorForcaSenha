# 🔐 Verificador de Força de Senha em Java

Um projeto prático e funcional desenvolvido em **Java** que avalia a força de uma senha com base em critérios de segurança amplamente recomendados. Uma excelente forma de aplicar validações com expressões regulares e reforçar os conceitos de entrada de dados e estruturas condicionais.

## 📌 Sobre o Projeto

O programa solicita ao usuário que insira uma senha e verifica sua robustez com base em cinco critérios principais:

- Comprimento da senha
- Uso de letras maiúsculas
- Uso de letras minúsculas
- Inclusão de números
- Inclusão de caracteres especiais

Ao final, exibe um diagnóstico da força da senha: **fraca**, **média**, **segura** ou **muito forte**.

## 💡 Funcionalidades

- Entrada dinâmica de senha via terminal
- Verificação de múltiplos critérios de segurança
- Avaliação da força da senha com base em pontuação
- Mensagens intuitivas para o usuário
- Fácil de adaptar para ambientes reais de autenticação

## 🧠 Conceitos Aplicados

- Expressões regulares (`matches`)
- Controle de fluxo com `if-else`
- Interação com o usuário via `Scanner`
- Modularização com métodos (`verificarForcaSenha`)
- Boas práticas de verificação de senhas

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/DevRafaSantos/verificador-senha-java.git
   cd verificador-senha-java
   ```

2. Compile e execute o código:
   ```bash
   javac VerificadorForcaSenha.java
   java secao16_VerificadorDeSenha.VerificadorForcaSenha
   ```

3. Insira uma senha e veja a avaliação no terminal.

## 📷 Exemplo de Uso

```
Digite a senha:
Meu@2025

Sua senha é muito forte.
```

## 🧪 Critérios Avaliados

| Critério                       | Pontuação |
|-------------------------------|-----------|
| Mais de 8 caracteres          | +1        |
| Contém letra maiúscula        | +1        |
| Contém letra minúscula        | +1        |
| Contém número                 | +1        |
| Contém caractere especial     | +1        |

**Pontuação Total: 0 a 5**
- 0 a 2: Senha Fraca 🔴
- 3: Senha Média 🟡
- 4: Senha Segura 🟢
- 5: Senha Muito Forte 🟢🔒

## 🎓 Aprendizados e Propósito

Este projeto foi desenvolvido como parte do meu aprendizado em **Java**, com o objetivo de praticar **validações**, **expressões regulares** e **design de lógica condicional**. Demonstra minha capacidade de escrever código limpo, modular e orientado à segurança.

## 📁 Estrutura do Projeto

```
├── secao16_VerificadorDeSenha/
│   └── VerificadorForcaSenha.java
```

## 🤝 Contribuições

Sugestões, melhorias ou novos critérios de avaliação são muito bem-vindos!
Desenvolvido com 💻 por **Rafael Santos de Andrade**  

---

**🔐 Segurança começa com boas práticas. Explore, aprenda e fortaleça seu código!**
