# 📘 Resumo: Funções Mais Usadas em JavaScript

## 🔢 Math (Matemática)

```js
Math.max(4, 7, 2);     // 7
Math.min(4, 7, 2);     // 2
Math.round(4.6);       // 5
Math.floor(4.9);       // 4
Math.ceil(4.1);        // 5
Math.random();         // Número aleatório entre 0 e 1
```

## 🧵 String

```js
"Olá Mundo".toLowerCase();    // "olá mundo"
"Olá Mundo".toUpperCase();    // "OLÁ MUNDO"
" JS ".trim();                // "JS"
"Maçã, Banana".split(", "); // ["Maçã", "Banana"]
"banana".includes("na");     // true
"abc".replace("a", "x");     // "xbc"
```

## 📦 Array

```js
[1, 2, 3].push(4);       // [1, 2, 3, 4]
[1, 2, 3].pop();         // [1, 2]
[1, 2, 3].shift();       // [2, 3]
[1, 2, 3].unshift(0);    // [0, 1, 2, 3]
[1, 2, 3].includes(2);   // true
[1, 2, 3].indexOf(3);    // 2
["a", "b"].join("-");     // "a-b"
[1, 2, 3].slice(1);      // [2, 3]
```

## 🔁 Funções Modernas de Array

```js
[1, 2, 3].map(x => x * 2);         // [2, 4, 6]
[1, 2, 3].filter(x => x > 1);      // [2, 3]
[1, 2, 3].reduce((a, b) => a + b); // 6
[1, 2, 3].forEach(x => console.log(x)); // imprime cada item
```

## 🕒 Date (Datas e Horas)

```js
let agora = new Date();
agora.getFullYear();    // Ex: 2025
agora.getMonth();       // 0 = Janeiro
agora.toISOString();    // "2025-06-16T..."
```

## 📋 JSON

```js
JSON.stringify({a: 1}); // '{"a":1}'
JSON.parse('{"a":1}');  // {a: 1}
```

## ✅ Verificação de Tipos

```js
typeof 123;         // "number"
Array.isArray([]);  // true
```

---

**Dica:** Use o console do navegador (F12 > Console) para testar essas funções rapidamente.

