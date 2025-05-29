# Protocolo HTTPS

## Introdução

O **HTTPS (Hypertext Transfer Protocol Secure)** é uma extensão do protocolo HTTP que adiciona **segurança na comunicação** entre clientes (como navegadores) e servidores web, por meio do uso de criptografia. Essa proteção é fundamental para preservar a **privacidade**, **integridade** e **autenticidade** dos dados trafegados na Web.

O HTTPS utiliza o **protocolo TLS (Transport Layer Security)** — anteriormente conhecido como SSL (Secure Sockets Layer) — como camada de segurança sobre o HTTP tradicional.

---

## Diferenças entre HTTP e HTTPS

| Aspecto          | HTTP                         | HTTPS                                |
| ---------------- | ---------------------------- | ------------------------------------ |
| **Segurança**    | Sem criptografia             | Usa criptografia TLS/SSL             |
| **Porta padrão** | 80                           | 443                                  |
| **URL**          | http://                      | https://                             |
| **Certificado**  | Não utiliza                  | Requer certificado digital (SSL/TLS) |
| **Privacidade**  | Dados trafegam em texto puro | Dados trafegam criptografados        |

---

## Como o HTTPS Funciona

1. **Cliente solicita uma conexão segura:**  
   Ao acessar uma URL `https://`, o navegador tenta estabelecer uma conexão segura com o servidor.

2. **Handshake TLS:**  
   Antes de qualquer dado HTTP ser trocado, ocorre uma negociação criptográfica entre cliente e servidor:

   - O servidor envia seu **certificado digital** (que contém a chave pública).
   - O cliente verifica se o certificado é válido e confiável.
   - As chaves são trocadas e uma **chave de sessão** é gerada para comunicação criptografada.

3. **Transferência de dados criptografados:**  
   Com a conexão segura estabelecida, os dados são enviados através do protocolo HTTP, mas protegidos pela camada TLS.

---

## Certificados Digitais

Um certificado digital é um arquivo eletrônico que comprova a identidade do servidor e permite a criptografia da comunicação.

- **Emitido por:** Autoridades Certificadoras (CAs), como Let's Encrypt, DigiCert, GlobalSign, entre outras.
- **Informações contidas:** Nome do domínio, chave pública, validade, autoridade emissora.
- **Validação:** Os navegadores mantêm uma lista de CAs confiáveis para validar os certificados recebidos.

---

## Benefícios do HTTPS

- 🔒 **Confidencialidade:** Dados trafegam criptografados, impedindo interceptações.
- ✅ **Autenticidade:** Garante que o servidor é quem diz ser (evita ataques man-in-the-middle).
- 🛡 **Integridade:** Detecta se os dados foram alterados durante o percurso.
- 🔐 **Conformidade:** Obrigatório para lidar com dados sensíveis (logins, senhas, cartões).
- 🔍 **SEO:** Motores de busca como o Google favorecem sites com HTTPS.

---

## TLS vs SSL

- **SSL (Secure Sockets Layer):** Padrão original de segurança para a Web. Atualmente obsoleto e descontinuado.
- **TLS (Transport Layer Security):** Evolução moderna e segura do SSL. Versões mais recentes: TLS 1.2 e TLS 1.3.

⚠️ O termo "SSL" ainda é amplamente usado, mas o protocolo realmente utilizado é o **TLS**.

---

## Como saber se um site usa HTTPS

- A URL começa com `https://`.
- Um cadeado é exibido ao lado da barra de endereços.
- Clicando no cadeado, é possível visualizar detalhes do certificado.

---

## Comandos e Ferramentas

- **curl com HTTPS:**

  ```bash
  curl -v https://www.exemplo.com
  ```

- **Verificar certificado SSL via OpenSSL:**

  ```bash
  openssl s_client -connect www.exemplo.com:443
  ```

- **Ferramentas online úteis:**
  - [https://www.ssllabs.com/ssltest](https://www.ssllabs.com/ssltest) – Avalia a qualidade da configuração HTTPS de um site.
  - [https://whatsmychaincert.com](https://whatsmychaincert.com) – Verifica a cadeia de certificados.

---

## Considerações Finais

O HTTPS tornou-se um requisito básico para segurança na Web. Além de proteger usuários contra interceptações e fraudes, ele também transmite confiança, melhora a visibilidade nos mecanismos de busca e cumpre com normas de privacidade e proteção de dados.

---

## Nota Final

> Material pego do repositório de Redes do meu amigo <a href="https://github.com/mercuriohg/IFRS2025/tree/main/cn">@diegooilv</a>
