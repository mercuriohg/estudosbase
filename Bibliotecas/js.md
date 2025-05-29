## 📚 Bibliotecas JavaScript (gerais)

## ✅ 1. Date

Para manipular datas e horas.

## ✅ Métodos:

getFullYear(), setDate(), toISOString()...

Requisição que faz: Obtém ou define partes de uma data/hora, formata data.

## ✅ 2. Math

Para cálculos matemáticos.

## ✅ Métodos:

<ul>
  <li>Math.random() — gera número pseudo-aleatório entre 0 e 1.
      
  <li>Math.floor(x) — arredonda para baixo.</li>
    
  <li>Math.ceil(x) — arredonda para cima.</li>
    
  <li>Math.round(x) — arredonda para o inteiro mais próximo.</li>

  <li>Math.max(a, b, c, ...) — maior número.</li>
    
  <li>Math.min(a, b, c, ...) — menor número.</li>
    
<li>Math.abs(x) — valor absoluto.</li>
    
<li>Requisição que faz: Calcula valores matemáticos.</li>
</ul>

```javascript
console.log(Math.random()); // Ex: 0.783
```

## ✅ 3. JSON

Para converter entre objetos JavaScript e strings JSON.

## ✅ Métodos:

<ul>
  <li>JSON.stringify(obj) — converte objeto em JSON.
  
  <li>JSON.parse(jsonStr) — converte JSON em objeto.
</ul>

Requisição que faz: Serializa ou desserializa dados.

```javascript
const json = JSON.stringify({ nome: "Ana" });
const obj = JSON.parse(json);
```

## ✅ 4. Array

Para armazenar e manipular coleções ordenadas.

## ✅ Métodos:

<ul>
 <li> push(item) — adiciona no final.
  
  <li>pop() — remove do final.
  
<li> shift() — remove do início.
  
 <li> unshift(item) — adiciona no início.
  
 <li> map(fn) — cria novo array transformado.
  
 <li> filter(fn) — filtra elementos.
  
 <li> reduce(fn, acc) — reduz a um valor.
  
 <li> forEach(fn) — itera sobre os elementos.
</ul>

Requisição que faz: Manipula sequências de dados.

```javascript
const arr = [1, 2, 3];
arr.push(4);
console.log(arr);
```

## ✅ 5. String

Para manipular textos.

## ✅ Métodos:

<ul>
  <li>charAt(i)
  
 <li> includes(substring)
  
 <li> replace(old, new)
  
 <li> split(delimiter)
  
 <li> toUpperCase()
  
 <li> toLowerCase()
  
 <li> trim()
</ul>

Requisição que faz: Processa e transforma texto.

```javascript
const frase = " Hello ";
console.log(frase.trim().toUpperCase()); // "HELLO"
```

## ✅ 6. Number

Para operações numéricas.

## ✅ Métodos:

<ul>
 <li> toFixed(n) — formata número com n casas decimais.
  
  <li>toString() — converte em string.
  
  <li>parseFloat(), parseInt() — conversão.
  
 <li> Requisição que faz: Formata ou converte números.
</ul>

```javascript
const n = 10.678;
console.log(n.toFixed(2)); // "10.68"
```

## ✅ 7. Promise

Para trabalhar com operações assíncronas.

## ✅ Métodos:

<ul>
  <li>then(fn) — encadeia sucesso.
  
 <li> catch(fn) — trata erro.
  
 <li> finally(fn) — sempre executa.
  
 <li> Promise.resolve(val)
  
 <li> Promise.reject(err)
  
 <li> Promise.all([...])
  
 <li> Promise.race([...])
  
 <li> Requisição que faz: Gerencia processos assíncronos, como requisições HTTP.
</ul>

```javascript
fetch("https://jsonplaceholder.typicode.com/posts/1")
  .then((res) => res.json())
  .then((data) => console.log(data));
```

## ✅ 8. fetch()

API moderna para fazer requisições HTTP.

## ✅ Métodos:

<ul>
  <li>fetch(url, options) — retorna uma Promise.
  
  <li>.then(res => res.json()) — para obter JSON.
  
  <li>.catch() — para erros.
  
  <li>Requisição que faz: Comunicação com servidores.
</ul>

```javascript
fetch("https://api.example.com/data")
  .then((response) => response.json())
  .then((data) => console.log(data));
```

## ✅ 9. Set

Para armazenar valores únicos.

## ✅ Métodos:

<ul>
 <li> add(valor)
  
 <li> has(valor)
  
 <li> delete(valor)
  
 <li> clear()
  
 <li> Requisição que faz: Garante coleção sem duplicatas.
</ul>

```javascript
const set = new Set([1, 2, 2, 3]);
console.log(set.has(2)); // true
```

## ✅ 10. Map

Para chave/valor com qualquer tipo de chave.

## ✅ Métodos:

<ul>
  <li>set(chave, valor)
  
  <li>get(chave)
  
 <li> has(chave)
  
  <li>delete(chave)
  
 <li> clear()
  
 <li> Requisição que faz: Estrutura de dados chave/valor.
</ul>

```javascript
const map = new Map();
map.set("chave", "valor");
console.log(map.get("chave"));
```

## ✅ 11. RegExp

Para expressões regulares.

## ✅ Métodos:

<ul>
  <li>test(str) — verifica se corresponde.
  
  <li>exec(str) — executa e retorna detalhes.
  
 <li> Requisição que faz: Busca e validação de padrões em strings.
</ul>

```javascript
const regex = /abc/;
console.log(regex.test("abcdef")); // true
```

## ✅ 12. Error

Para criar e manipular erros.

## ✅ Métodos:

<ul>
  <li>new Error(message)
  
 <li> .message — descrição.
  
 <li> .name — tipo.
  
 <li> .stack — rastreamento.
  
 <li> Requisição que faz: Geração e tratamento de erros.
</ul>

```javascript
try {
  throw new Error("Algo deu errado");
} catch (e) {
  console.error(e.message);
}
```

## ✅ 13. Intl

Internacionalização (datas, números, moedas).

## ✅ Métodos:

<ul>
  <li>Intl.DateTimeFormat()
  
 <li> Intl.NumberFormat()
  
 <li> Requisição que faz: Formata dados conforme localidade.
</ul>

```javascript
const formatador = new Intl.NumberFormat("pt-BR", {
  style: "currency",
  currency: "BRL",
});
console.log(formatador.format(1234.56)); // "R$ 1.234,56"
```

## ✅ 14. console

Para depuração.

## ✅ Métodos:

<ul>
   <li>console.log()
    
   <li>console.error()
    
   <li>console.warn()
    
   <li> console.table()
    
   <li> Requisição que faz: Exibe informações no console.
</ul>

## ✅ Resumo Visual

| Objeto    | Uso Principal          |
| --------- | ---------------------- |
| `Date`    | Data e hora            |
| `Math`    | Cálculos matemáticos   |
| `JSON`    | Conversão de dados     |
| `Array`   | Coleção ordenada       |
| `String`  | Manipulação de texto   |
| `Number`  | Manipulação de números |
| `Promise` | Assíncrono             |
| `fetch()` | Requisições HTTP       |
| `Set`     | Coleção única          |
| `Map`     | Estrutura chave/valor  |
| `RegExp`  | Expressões regulares   |
| `Error`   | Erros                  |
| `Intl`    | Internacionalização    |
| `console` | Debugging              |


> Algumas Bibliotecas em JS.
