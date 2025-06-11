# Passos para criar uma API simples:
## 1.Instalar o Node.js e o Express:

Se você ainda não tem o Node.js instalado, faça o download aqui.

Depois, crie um diretório para o seu projeto e, dentro dele, inicialize um novo projeto Node.js:

```node
mkdir api-example
cd api-example
npm init -y
npm install express
```

## 2.Criar o arquivo app.js com a API:

O código abaixo cria uma API simples que possui uma rota GET e uma rota POST.

```js
// Importando o Express
const express = require('express');
const app = express();

// Middleware para tratar o JSON no corpo da requisição
app.use(express.json());

// Definir a porta em que o servidor vai rodar
const port = 3000;

// Rota GET
app.get('/api/saudacao', (req, res) => {
  res.json({ mensagem: 'Olá, bem-vindo à API!' });
});

// Rota POST
app.post('/api/usuarios', (req, res) => {
  const { nome, idade } = req.body;

  if (!nome || !idade) {
    return res.status(400).json({ erro: 'Nome e idade são obrigatórios' });
  }

  res.status(201).json({ mensagem: `Usuário ${nome} de ${idade} anos criado com sucesso!` });
});

// Iniciar o servidor
app.listen(port, () => {
  console.log(`API rodando na porta ${port}`);
});
```

## 3.Rodar a API:

Agora, no terminal, dentro da pasta do projeto, basta rodar:

```node
node app.js
```

## Testando a API
- GET:
Você pode testar a rota **GET /api/saudacao** com qualquer ferramenta de requisições, como o Postman ou cURL:


