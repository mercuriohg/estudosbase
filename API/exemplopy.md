Exemplo prático simples de como usar uma API Web com a linguagem Python.

Vamos consultar uma API pública de previsão do tempo. Há várias APIs gratuitas que você pode usar, e uma delas é a OpenWeatherMap. Suponha que você tenha uma chave de API (token de acesso).

## 🔧 Exemplo: Usar uma API de clima com Python (usando requests)

```py
import requests

# Substitua pela sua própria chave da API do OpenWeatherMap
api_key = "sua_chave_aqui"
cidade = "São Paulo"
url = f"http://api.openweathermap.org/data/2.5/weather?q={cidade}&appid={api_key}&units=metric&lang=pt"

# Fazendo a requisição para a API
resposta = requests.get(url)

# Convertendo a resposta para JSON
dados = resposta.json()

# Exibindo algumas informações
print(f"Clima em {cidade}: {dados['weather'][0]['description']}")
print(f"Temperatura: {dados['main']['temp']}°C")
print(f"Humidade: {dados['main']['humidity']}%")
```

## 📦 O que está acontecendo aqui?
<ol>
<li> Você faz uma requisição HTTP GET para a API, com parâmetros como cidade e chave de acesso.</li>

<li> A API responde com dados em formato JSON.</li>

<li> O programa pega essas informações e mostra ao usuário.</li>

</ol>

## Se quiser, posso te mostrar:

<ul>
<li>Como se cadastrar para obter uma chave de API gratuita.

<li>Como criar uma interface simples para esse código (com Tkinter ou via navegador).

<li>Ou como fazer isso em outra linguagem como JavaScript.
</ul>
