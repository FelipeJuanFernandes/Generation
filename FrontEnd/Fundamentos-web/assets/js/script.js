// Criação das variaveis

// var idade = 35 //não é mais indicado pelo padrão EcmaScript

// let idade = 35 //padrão indicado pelo EcmaScript - valores mutaveis
// const idade = 35 //padrão indicado pelo EcmaScript - valores imutaveis

// Gets de Elementos
// DOM - document

// por Tag: document.getElementsByTagName('img')
// por ID: document.getElementById('menu')
// por Nome: document.getElementsByName('nome')
// por Classe: document.getElementsByClassName('classe')
// por Seletor: document.querySelector('#id / .classe / nome / tag')


let nome = document.querySelector('#nome')
let email = document.querySelector('#email')
let assunto = document.querySelector('#assunto')
let statusNome = false
let statusEmail = false
let statusAssunto = false
let mapa = document.querySelector('#mapa')

nome.style.width = '100%'
email.style.width = '100%'

function validaNome() 
{
    let txtNome = document.querySelector("#txtNome")
    if(nome.value.length < 3)
    {
        txtNome.innerHTML = "Nome invalido"
        txtNome.style.color = "red"
        statusNome = false
    }else
    {
        txtNome.innerHTML = "Nome valido"
        txtNome.style.color = "green"
        statusNome = true
    }

}

function validaEmail()
{
    let txtEmail = document.querySelector("#txtEmail")
    if(email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1)
    {
        txtEmail.innerHTML = "E-mail inválido"
        txtEmail.style.color = "red"
        statusEmail = false
    }else
    {
        txtEmail.innerHTML = "E-mail válido"
        txtEmail.style.color = "green"
        statusEmail = true
    }
}

function validaAssunto()
{
    let txtAssunto = document.querySelector("#txtAssunto")
    if(assunto.value.length >= 100)
    {
        txtAssunto.innerHTML = 'Texto muito grande, digite no máximo 100 caracteres'
        txtAssunto.style.color = 'red'
        txtAssunto.style.display = 'block'
    } else
    {
        txtAssunto.style.display = 'none'
        statusAssunto = true
    }
}

function enviar()
{
    if(statusNome == true && statusEmail == true && statusAssunto == true)
    {
        alert('Formulário enviado com sucesso!')
    }else
    {
        alert('Preencha o formulário corretamente')
    }
}

function mapaZoom()
{
    mapa.style.width = '800px'
    mapa.style.height = '600px'
}

function mapaNormal()
{
    mapa.style.width = '400px'
    mapa.style.height = '250px'
}