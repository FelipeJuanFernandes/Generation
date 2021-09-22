let nome = document.querySelector('#nome')
let nome2 = document.querySelector('.form-control')

console.log(nome)
console.log(nome2)


function validaNome()
{
    let txtNome = document.querySelector('#txtnome')
    if(nome.value.length < 3)
    {
        txtNome.innerHTML = "Nome invalido"
        txtNome.style.color = "red"
    }else
    {
        txtNome.innerHTML = "Nome valido"
        txtNome.style.color = "green"
    }
}