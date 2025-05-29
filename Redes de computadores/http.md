# 🗃️ Protocolo HTTP - Resumo Técnico

## 🗂️ O que é HTTP?

HTTP (Hypertext Transfer Protocol) é um protocolo de comunicação utilizado na transferência de dados entre clientes (geralmente navegadores) e servidores web. Ele define como as mensagens são formatadas e transmitidas, além de especificar as ações que os servidores e navegadores devem adotar em resposta a diversos comandos.

---

## 🗂️ Portas Utilizadas

- **HTTP**: Porta **80** (TCP)
- **HTTPS** (HTTP Secure): Porta **443** (TCP)

Estas são portas padrão, mas podem ser configuradas para outras, dependendo da aplicação.

---

## 🗂️ Funcionamento

1. **Cliente**: Realiza uma requisição HTTP ao servidor, enviando um método (GET, POST, PUT, DELETE etc.).
2. **Servidor**: Processa a requisição e envia uma resposta contendo um código de status (200 OK, 404 Not Found, etc.), cabeçalhos e, opcionalmente, um corpo com dados.

O HTTP é um protocolo **sem estado (stateless)**, o que significa que cada requisição é independente, não mantendo informações de contexto entre conexões sucessivas.

---

## 🗂️ Segurança

### HTTP
- Comunicação **não criptografada**.
- Vulnerável a ataques como **interceptação (Man-in-the-Middle)** e **escuta (eavesdropping)**.
- Não recomendado para transmitir informações sensíveis.

### HTTPS
- HTTP encapsulado no protocolo **TLS (Transport Layer Security)**.
- **Criptografa** a comunicação, garantindo:
  - **Confidencialidade**: Proteção contra interceptação.
  - **Integridade**: Detecção de alterações nos dados.
  - **Autenticidade**: Validação da identidade do servidor.

O uso de HTTPS é considerado obrigatório para aplicações modernas, especialmente aquelas que envolvem dados sensíveis.

---

## 🗂️ Utilização

- **Navegação Web**: Principal protocolo usado para carregar páginas da internet.
- **APIs REST**: Comunicação entre sistemas via serviços web.
- **Transferência de Arquivos**: Download e upload de conteúdos.
- **Serviços em Nuvem**: Acesso a aplicações SaaS, PaaS, e IaaS.

---

## 🗂️ Versões do HTTP

- **HTTP/1.0**: Primeira versão amplamente utilizada, conexões não persistentes.
- **HTTP/1.1**: Introduziu conexões persistentes (keep-alive) e cache mais eficiente.
- **HTTP/2**: Multiplexação de requisições, compressão de cabeçalhos, mais eficiente.
- **HTTP/3**: Baseado no protocolo **QUIC** (sobre UDP), reduz latência e melhora desempenho.

---

## Considerações Finais

HTTP é um protocolo fundamental para a internet, evoluindo constantemente para atender requisitos de desempenho, segurança e escalabilidade. O uso de HTTPS tornou-se essencial para proteger a privacidade e a integridade das comunicações na web.


