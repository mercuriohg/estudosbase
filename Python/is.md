# Formatação de tipagem 🐍
## 1. .isalpha() → só letras (sem números ou símbolos)
```py
print("Python".isalpha())   # True
print("Python3".isalpha())  # False
```
## 2. .isdigit() → só dígitos (números inteiros positivos)
```py
print("12345".isdigit())    # True
print("123a".isdigit())     # False
```
## 3. .isnumeric() → números no sentido mais amplo
Inclui dígitos, frações, potências, etc. (pouca diferença para isdigit no dia a dia)

```py
print("123".isnumeric())    # True
print("½".isnumeric())      # True (meio)
```
## 4. .isalnum() → letras e números (sem espaços nem símbolos)
```py
print("Python3".isalnum())  # True
print("Python 3".isalnum()) # False (tem espaço)
```
## 5. .isspace() → só espaços (ou caracteres de espaço como \n, \t)
```py
print("   ".isspace())  # True
print("\n\t".isspace()) # True
print(" a ".isspace())  # False
```
## 6. .islower() → todas as letras minúsculas
```py
print("python".islower())  # True
print("Python".islower())  # False
```
## 7. .isupper() → todas as letras maiúsculas
```py
print("PYTHON".isupper())  # True
print("Python".isupper())  # False
```
## 8. .istitle() → cada palavra começa com maiúscula
```py
print("Python É Top".istitle()) # True
print("Python é top".istitle()) # False
```
## 9. .isprintable() → só caracteres visíveis/imprimíveis
```py
print("Python 3".isprintable()) # True
print("Hello\nWorld".isprintable()) # False (tem \n)
```
## 10. .isascii() → só caracteres ASCII (sem acentos)
```py
print("Python".isascii())  # True
print("Python é top".isascii()) # False (tem "é")
```
