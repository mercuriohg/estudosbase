# Entendendo o IP (Internet Protocol)

O **Internet Protocol (IP)** é um protocolo da **Camada de Rede** do modelo OSI, responsável pelo **endereçamento**, **fragmentação** e **roteamento** de pacotes de dados entre dispositivos em uma rede.

---

## 📚 Índice

- [Entendendo o IP (Internet Protocol)](#entendendo-o-ip-internet-protocol)
  - [📚 Índice](#-índice)
  - [🧩 O que é o IP?](#-o-que-é-o-ip)
  - [🧱 Camada de Rede](#-camada-de-rede)
  - [🌐 Versões do IP: IPv4 vs IPv6](#-versões-do-ip-ipv4-vs-ipv6)
    - [IPv4](#ipv4)
    - [IPv6](#ipv6)
  - [🧭 Endereçamento IP](#-endereçamento-ip)
  - [🧮 Sub-redes e Máscara de Sub-rede](#-sub-redes-e-máscara-de-sub-rede)
  - [🔢 CIDR (Classless Inter-Domain Routing)](#-cidr-classless-inter-domain-routing)
  - [🔁 NAT (Network Address Translation)](#-nat-network-address-translation)
  - [🧭 Roteamento IP](#-roteamento-ip)
  - [🛡️ IP e Segurança](#️-ip-e-segurança)
  - [📌 Resumo](#-resumo)
  - [🔗 Recursos adicionais](#-recursos-adicionais)

---

## 🧩 O que é o IP?

O **IP** é usado para:

- Identificar dispositivos em uma rede (através de **endereços IP**);
- **Roteamento** de pacotes entre redes diferentes;
- Gerenciamento de pacotes (fragmentação e remontagem).

---

## 🧱 Camada de Rede

No modelo **OSI**, o IP se encontra na **Camada 3 (Rede)**:

- Camada 1 – Física
- Camada 2 – Enlace de Dados
- **Camada 3 – Rede (IP, ICMP, ARP)**
- Camada 4 – Transporte (TCP, UDP)
- Camada 5–7 – Sessão, Apresentação, Aplicação

---

## 🌐 Versões do IP: IPv4 vs IPv6

### IPv4

- Tamanho: 32 bits (4 bytes)
- Formato: decimal, ex: `192.168.1.1`
- Espaço total: ~4,3 bilhões de endereços
- Fragmentação: permitida

### IPv6

- Tamanho: 128 bits
- Formato: hexadecimal, ex: `2001:0db8:85a3::8a2e:0370:7334`
- Espaço total: ~3.4×10³⁸ endereços
- Fragmentação: não feita por roteadores (responsabilidade do host)

---

## 🧭 Endereçamento IP

Cada dispositivo em uma rede possui um **endereço IP único**. Estrutura:

- **Endereço de Rede**: identifica a rede
- **Endereço de Host**: identifica o dispositivo dentro da rede

Exemplo IPv4:  
Com máscara `255.255.255.0` (ou `/24`), o IP `192.168.1.10` tem:

- Rede: `192.168.1.0`
- Host: `.10`

---

## 🧮 Sub-redes e Máscara de Sub-rede

A **máscara de sub-rede** define a divisão entre os bits da rede e os bits do host.

Exemplo:

- IP: `192.168.1.10`
- Máscara: `255.255.255.0` (ou `/24`)
- Intervalo possível de hosts: `192.168.1.1` a `192.168.1.254`

A sub-rede ajuda a segmentar redes grandes, reduzir tráfego e melhorar segurança.

---

## 🔢 CIDR (Classless Inter-Domain Routing)

O **CIDR** substitui o antigo sistema de **classes A/B/C**.

- Notação: `192.168.0.0/16`
- Significa: os **16 primeiros bits** são da rede, os **16 últimos** são para hosts
- Mais flexível que classes tradicionais (como Classe C: /24)

---

## 🔁 NAT (Network Address Translation)

O **NAT** permite que vários dispositivos em uma rede local compartilhem um **único IP público**.

Tipos de NAT:

- **Static NAT**: mapeamento 1:1 entre IP privado e IP público
- **Dynamic NAT**: mapeia um IP privado para um IP público disponível
- **PAT (Port Address Translation)**: mapeia múltiplos IPs privados para um único IP público, diferenciando por **portas**

Exemplo:  
Dispositivo local `192.168.1.10:1234` → NAT → Internet como `201.10.20.30:54321`

---

## 🧭 Roteamento IP

O **roteamento** determina como um pacote sai de uma rede local para atingir seu destino final. É feito por **roteadores** que mantêm tabelas de rotas.

Algoritmos comuns:

- RIP (Routing Information Protocol)
- OSPF (Open Shortest Path First)
- BGP (Border Gateway Protocol)

---

## 🛡️ IP e Segurança

- **Firewalls** controlam o tráfego baseado em IPs de origem/destino.
- **VPNs** ocultam seu IP real e criam um túnel criptografado.
- **IP Spoofing**: técnica maliciosa de falsificação de IP para enganar sistemas.
- **GeoIP**: sistemas que estimam localização com base no IP.

---

## 📌 Resumo

| Conceito        | IPv4               | IPv6                        |
| --------------- | ------------------ | --------------------------- |
| Tamanho         | 32 bits            | 128 bits                    |
| Notação         | Decimal com pontos | Hexadecimal com dois-pontos |
| Endereços       | ~4,3 bilhões       | ~340 undecilhões            |
| Fragmentação    | Sim                | Não (feito pelo host)       |
| Compatibilidade | Amplamente usado   | Crescente adoção            |

---

## 🔗 Recursos adicionais

- [RFC 791 - IPv4](https://datatracker.ietf.org/doc/html/rfc791)
- [RFC 8200 - IPv6](https://datatracker.ietf.org/doc/html/rfc8200)
- [IP Subnet Calculator](https://www.subnet-calculator.com/)

---

>Material pego do repositório do <a href="https://github.com/mercuriohg/IFRS2025/blob/main/cn/aulas/Ip.md?plain=1">@diegooilv</a>
