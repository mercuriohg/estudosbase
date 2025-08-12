# Formatação de String em Python 🐍

## 1. Criando e formatando strings
```py
texto = "Python"
print(texto)  # Python
```
### F-strings (formatação moderna):
```py
nome = "Arthur"
idade = 20
print(f"Meu nome é {nome} e tenho {idade} anos.")
```
### Espaçamento:
```py
print(f"{nome:>10}")  # Alinha à direita
print(f"{nome:<10}")  # Alinha à esquerda
print(f"{nome:^10}")  # Centraliza
```

## 2. Cortando strings (slicing)
```py
frase = "Programar é incrível"
print(frase[0:9])   # "Programar"
print(frase[:9])    # "Programar" (começo até índice 8)
print(frase[10:])   # "é incrível" (do índice 10 até o final)
```
## 3. Lendo de trás pra frente
```py
print(frase[::-1])  # lê invertido
```
## 4. Transformando texto
```py
texto = " Python é TOP "
print(texto.strip())      # remove espaços dos dois lados
print(texto.upper())      # maiúsculas
print(texto.lower())      # minúsculas
print(texto.title())      # primeira letra de cada palavra maiúscula
print(texto.capitalize()) # primeira letra da frase maiúscula
```
## 5. Substituindo e dividindo
```py
frase = "Eu gosto de Python"
print(frase.replace("Python", "Java"))  # troca palavras

partes = frase.split(" ")  # separa em lista por espaço
print(partes)              # ['Eu', 'gosto', 'de', 'Python']

junta = "-".join(partes)   # junta usando traço
print(junta)               # Eu-gosto-de-Python
```
## 6. Procurando coisas na string
```py
print(frase.find("Python"))  # posição inicial (14)
print("Python" in frase)     # True se existir
print("Java" not in frase)   # True se NÃO existir
```
## 7. Contando
```py
print(frase.count("o"))   # conta quantas vezes aparece
```
## 8. Strings multilinha
```py
texto = """Isto é
uma string
com várias linhas"""
print(texto)
```
## 9. Removendo caracteres específicos
```py
texto = "###Hello###"
print(texto.strip("#"))  # remove # do começo e do fim
```
## 10. Filtrando apenas letras ou números
```py
frase = "Python 3.10 é top!"
so_letras = ''.join(c for c in frase if c.isalpha())
so_numeros = ''.join(c for c in frase if c.isdigit())
print(so_letras)   # Pythonétop
print(so_numeros)  # 310
```
