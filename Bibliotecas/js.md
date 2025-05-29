## 📚 Bibliotecas JavaScript (gerais)
✅ 1. Date
Para manipular datas e horas.

✅ Métodos: getFullYear(), setDate(), toISOString()...

Requisição que faz: Obtém ou define partes de uma data/hora, formata data.

✅ 2. Math
Para cálculos matemáticos.

✅ Métodos:

Math.random() — gera número pseudo-aleatório entre 0 e 1.

Math.floor(x) — arredonda para baixo.

Math.ceil(x) — arredonda para cima.

Math.round(x) — arredonda para o inteiro mais próximo.

Math.max(a, b, c, ...) — maior número.

Math.min(a, b, c, ...) — menor número.

Math.abs(x) — valor absoluto.

Requisição que faz: Calcula valores matemáticos.

javascript
Copiar
Editar
console.log(Math.random());  // Ex: 0.783
✅ 3. JSON
Para converter entre objetos JavaScript e strings JSON.

✅ Métodos:

JSON.stringify(obj) — converte objeto em JSON.

JSON.parse(jsonStr) — converte JSON em objeto.

Requisição que faz: Serializa ou desserializa dados.

javascript
Copiar
Editar
const json = JSON.stringify({ nome: "Ana" });
const obj = JSON.parse(json);
✅ 4. Array
Para armazenar e manipular coleções ordenadas.

✅ Métodos:

push(item) — adiciona no final.

pop() — remove do final.

shift() — remove do início.

unshift(item) — adiciona no início.

map(fn) — cria novo array transformado.

filter(fn) — filtra elementos.

reduce(fn, acc) — reduz a um valor.

forEach(fn) — itera sobre os elementos.

Requisição que faz: Manipula sequências de dados.

javascript
Copiar
Editar
const arr = [1, 2, 3];
arr.push(4);
console.log(arr);
✅ 5. String
Para manipular textos.

✅ Métodos:

charAt(i)

includes(substring)

replace(old, new)

split(delimiter)

toUpperCase()

toLowerCase()

trim()

Requisição que faz: Processa e transforma texto.

javascript
Copiar
Editar
const frase = " Hello ";
console.log(frase.trim().toUpperCase());  // "HELLO"
✅ 6. Number
Para operações numéricas.

✅ Métodos:

toFixed(n) — formata número com n casas decimais.

toString() — converte em string.

parseFloat(), parseInt() — conversão.

Requisição que faz: Formata ou converte números.

javascript
Copiar
Editar
const n = 10.678;
console.log(n.toFixed(2));  // "10.68"
✅ 7. Promise
Para trabalhar com operações assíncronas.

✅ Métodos:

then(fn) — encadeia sucesso.

catch(fn) — trata erro.

finally(fn) — sempre executa.

Promise.resolve(val)

Promise.reject(err)

Promise.all([...])

Promise.race([...])

Requisição que faz: Gerencia processos assíncronos, como requisições HTTP.

javascript
Copiar
Editar
fetch('https://jsonplaceholder.typicode.com/posts/1')
  .then(res => res.json())
  .then(data => console.log(data));
✅ 8. fetch()
API moderna para fazer requisições HTTP.

✅ Métodos:

fetch(url, options) — retorna uma Promise.

.then(res => res.json()) — para obter JSON.

.catch() — para erros.

Requisição que faz: Comunicação com servidores.

javascript
Copiar
Editar
fetch('https://api.example.com/data')
  .then(response => response.json())
  .then(data => console.log(data));
✅ 9. Set
Para armazenar valores únicos.

✅ Métodos:

add(valor)

has(valor)

delete(valor)

clear()

Requisição que faz: Garante coleção sem duplicatas.

javascript
Copiar
Editar
const set = new Set([1, 2, 2, 3]);
console.log(set.has(2));  // true
✅ 10. Map
Para chave/valor com qualquer tipo de chave.

✅ Métodos:

set(chave, valor)

get(chave)

has(chave)

delete(chave)

clear()

Requisição que faz: Estrutura de dados chave/valor.

javascript
Copiar
Editar
const map = new Map();
map.set('chave', 'valor');
console.log(map.get('chave'));
✅ 11. RegExp
Para expressões regulares.

✅ Métodos:

test(str) — verifica se corresponde.

exec(str) — executa e retorna detalhes.

Requisição que faz: Busca e validação de padrões em strings.

javascript
Copiar
Editar
const regex = /abc/;
console.log(regex.test("abcdef"));  // true
✅ 12. Error
Para criar e manipular erros.

✅ Métodos:

new Error(message)

.message — descrição.

.name — tipo.

.stack — rastreamento.

Requisição que faz: Geração e tratamento de erros.

javascript
Copiar
Editar
try {
  throw new Error("Algo deu errado");
} catch (e) {
  console.error(e.message);
}
✅ 13. Intl
Internacionalização (datas, números, moedas).

✅ Métodos:

Intl.DateTimeFormat()

Intl.NumberFormat()

Requisição que faz: Formata dados conforme localidade.

javascript
Copiar
Editar
const formatador = new Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' });
console.log(formatador.format(1234.56));  // "R$ 1.234,56"
✅ 14. console
Para depuração.

✅ Métodos:

console.log()

console.error()

console.warn()

console.table()

Requisição que faz: Exibe informações no console.

✅ Resumo Visual
Objeto	Uso Principal
Date	Data e hora
Math	Cálculos matemáticos
JSON	Conversão de dados
Array	Coleção ordenada
String	Manipulação de texto
Number	Manipulação de números
Promise	Assíncrono
fetch()	Requisições HTTP
Set	Coleção única
Map	Estrutura chave/valor
RegExp	Expressões regulares
Error	Erros
Intl	Internacionalização
console	Debugging

>Algumas Bibliotecas em JS.
