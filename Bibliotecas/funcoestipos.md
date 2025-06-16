# 📌 Tipos de Funções em JavaScript
## 1. Função Declarada (Function Declaration)
```js
function soma(a, b) {
  return a + b;
}
```
Pode ser chamada antes da sua definição (hoisting).

## 2. Função Anônima (Function Expression)
```js
const subtrai = function(a, b) {
  return a - b;
};
```
É atribuída a uma variável.

Não sofre hoisting (não pode ser usada antes da definição).

## 3. Arrow Function (Função de Seta)
```
const multiplica = (a, b) => {
  return a * b;
};
```
Mais curta.

Não tem this, arguments ou super próprios.

Boa para funções curtas e callbacks.

Forma reduzida:
```js
const quadrado = x => x * x;
```
Sem parâmetros:
```js
const dizOi = () => console.log("Olá!");
```
## 4. Função como Método (em objetos)
```js
const calculadora = {
  dividir(a, b) {
    return a / b;
  }
};
```
## 5. Função Construtora (Function Constructor)
```js
function Pessoa(nome) {
  this.nome = nome;
}

const p1 = new Pessoa("Arthur");
```
## 6. Função com call, apply e bind
```js
function saudacao() {
  console.log("Olá, " + this.nome);
}

const pessoa = { nome: "Lucas" };

saudacao.call(pessoa); // Olá, Lucas
```
## 7. IIFE - Immediately Invoked Function Expression
```js
(function() {
  console.log("Executa automaticamente");
})();
```
## 8. Funções dentro de arrays ou callbacks
```js
const numeros = [1, 2, 3];
const dobrados = numeros.map(n => n * 2);
```
✅ Resumo das Arrow Functions
| Situação            | Sintaxe                       |
| ------------------- | ----------------------------- |
| 1 parâmetro         | `x => x + 1`                  |
| Sem parâmetro       | `() => algo`                  |
| Mais de 1 parâmetro | `(a, b) => a + b`             |
| Várias linhas       | `(a, b) => { return a + b; }` |
