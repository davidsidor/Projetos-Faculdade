function validaInscricao(){
    
    var nome = document.formulario.txtnome.value
    var expRegNome = new RegExp ("^[A-Z][a-z].* [A-Z][a-z].*$")

    if (!expRegNome.test(nome)){
        alert("Preencha o campo corretamente")
        document.formulario.txtnome.focus()
        return false;
    }

    var fone = document.formulario.txtfone.value
    var expRegFone = new RegExp ("^[(]{1}[1-9]{2}[)]{1}[-]{1}[0-9]{4,5}[-]{1}[0-9]{4}")

    if (!expRegFone.test(fone)){
        alert('Preencha o campo Fone corretamente')
        document.formulario.txtfone.focus()
        return false
    }

    var data = document.formulario.txtdata.value
    var expRegData = new RegExp ("^[0-31]{2}[/]{1}[0-12]{2}[/]{1}[0-2022]{4}$")

    if (!expRegData.test(data)){
        alert('Preencha o campo Data corretamente')
        document.formulario.txtdata.focus()
        return false
    }

    if (document.formulario.sexo[0].checked==false && document.formulario.sexo[1].checked==false){
        alert("Preencha o campo de Sexo.")
        return false;
    }

    var email = document.formulario.txtemail.value
    var expRegData = new RegExp ('^[A-z_.-0123456789]{3,}[@]{1}(gmail|hotmail|outlook){1}[.]{1}(com|br)$')

    if (!expRegData.test(email)){
        alert("Preencha o campo E-mail corretamente.")
        document.formulario.txtemail.focus()
        return false;
    }

    if (document.formulario.check.checked==false){
        alert("Preencha o campo Participar.")
        return false;
    }
    return true;
}

$(document).ready(function(){
    $("header").load("/ProjetoFaClube/pages/general/cabecalho.html")
    $("footer").load("/ProjetoFaClube/pages/general/rodape.html")
})
