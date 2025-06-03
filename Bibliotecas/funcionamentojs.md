
# 📚 Guia Completo: Seleção e Manipulação de Elementos no DOM

## ✅ 1. Tipos de \`document\` para pegar elementos

### 📌 \`document.getElementById('id')\`
- ✅ Pega **um elemento** pelo seu \`id\`.
- ⚠️ IDs devem ser únicos!

```javascript
const titulo = document.getElementById('titulo');
```

---

### 📌 \`document.getElementsByClassName('classe')\`
- ✅ Pega **vários elementos** com a mesma \`class\`.
- Retorna uma **HTMLCollection**.

```javascript
const itens = document.getElementsByClassName('item');
```

---

### 📌 \`document.getElementsByTagName('tag')\`
- ✅ Pega **vários elementos** pela tag, ex: \`div\`, \`p\`, \`span\`.
- Retorna uma **HTMLCollection**.

```javascript
const paragrafos = document.getElementsByTagName('p');
```

---

### 📌 \`document.querySelector('seletor')\`
- ✅ Pega **o primeiro elemento** que corresponde ao seletor CSS.

```javascript
const primeiraDiv = document.querySelector('div');
const especial = document.querySelector('.classe-especial');
const unico = document.querySelector('#id-unico');
```

---

### 📌 \`document.querySelectorAll('seletor')\`
- ✅ Pega **todos os elementos** que correspondem ao seletor CSS.
- Retorna uma **NodeList**.
 
```javascript
const todosOsParagrafos = document.querySelectorAll('p');
```

---

## ✅ 2. Setagem de outras tags e ids

### ✅ Mudar o \`id\`

```javascript
elemento.id = 'novo-id';
```

---

### ✅ Mudar \`class\`

```javascript
elemento.className = 'nova-classe';
```

Ou adicionar/remover classes específicas:

```javascript
elemento.classList.add('classe-adicional');
elemento.classList.remove('classe-velha');
elemento.classList.toggle('classe-temporaria');
```

---

### ✅ Alterar conteúdo

```javascript
elemento.textContent = 'Novo texto';
elemento.innerHTML = '<strong>Texto em negrito</strong>';
```

---

### ✅ Mudar atributos genéricos (\`href\`, \`src\`, \`alt\`...)

```javascript
elemento.setAttribute('href', 'https://openai.com');
elemento.setAttribute('alt', 'Descrição da imagem');
```

---

## ✅ 3. O que é \`.value\`? Para que serve?

O \`.value\` é usado para **pegar ou definir o valor** de elementos **interativos** como:

- \`<input>\`
- \`<textarea>\`
- \`<select>\`

---

### ✅ Exemplo de pegar valor:

```html
<input type="text" id="nome" value="João">
```

```javascript
const nomeInput = document.getElementById('nome');
console.log(nomeInput.value);  // Saída: João
```

---

### ✅ Exemplo de setar valor:

```javascript
nomeInput.value = 'Maria';
```

Agora, o valor exibido no input será "Maria".

⚠️ **Cuidado**: \`.value\` **não** serve para elementos como \`<div>\` ou \`<p>\`. Para esses, use \`textContent\` ou \`innerHTML\`.

---

## ✅ 4. Recap Express

| Método | Retorna | Usado para |
|---------|--------|------------|
| \`getElementById\` | Elemento | Um único id |
| \`getElementsByClassName\` | HTMLCollection | Várias classes |
| \`getElementsByTagName\` | HTMLCollection | Várias tags |
| \`querySelector\` | Elemento | Primeiro seletor CSS que bater |
| \`querySelectorAll\` | NodeList | Todos os seletores CSS que baterem |
| \`.value\` | String | Pegar ou definir valores de inputs, textareas, selects |

---

## ✅ 5. Extra: boas práticas

✔️ Sempre verifique se o elemento existe antes de manipulá-lo:

```javascript
const btn = document.getElementById('btn');

if(btn){
  btn.textContent = 'Clicou!';
}
```

✔️ Use \`querySelector\` e \`querySelectorAll\` quando quiser aproveitar a flexibilidade dos seletores CSS!

---

## 💡 Quer um exemplo completo com formulário?  
Só dizer: **"Sim, quero um exemplo completo!"** 🚀
`;

fs.writeFile('guia-dom.md', conteudo, (err) => {
  if (err) {
    console.error('Erro ao criar o arquivo:', err);
  } else {
    console.log('Arquivo guia-dom.md criado com sucesso! 🚀');
  }
});
