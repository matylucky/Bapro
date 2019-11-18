//detectar cuando toco el boton de registro (se envía el formulario)
var botonDeRegistro = document.querySelector(".button-Registro");
    botonDeRegistro.addEventListener('click',function(){
var errores = false;

/*Capturamos los elementos*/
var nombre = document.getElementById('GenerarUsuario');
var contrasenia = document.getElementById('Contraseña');
var email = document.getElementById('Correo_electrónico');


/*Los span de errores del Formulario*/
var errorUsuario = document.getElementById("errorGenerarUsuario");
var errorContraseña = document.getElementById("errorContraseña");
var errorEmail = document.getElementById("errorEmail");

/*Expresión regular para validar el Correo electrónico*/
var expresión = /^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i;

/*Condición de error para USUARIO*/
if(nombre.value == ""){
    errorGenerarUsuario.innerHTML = "El usuario es obligatorio.";
    nombre.style.border = "1px solid red";
    errores = true;
    }else if(nombre.value.length <6 ){
    errorGenerarUsuario.innerHTML = "El usuario debe tener al menos 6 caracteres.";
    nombre.style.border = "1px solid red";
    errores = true;
    }else{
    errorUsuario.innerHTML = "";
    nombre.style.border = "1px solid green";
    }
/*Condición de error para CONTRASEÑA*/
if(contrasenia.value == ""){
    errorContraseña.innerHTML = "La contraseña es obligatoria.";
    contrasenia.style.border = "1px solid red";
    errores = true;
    }else if(contrasenia.value.length<6){
    errorContraseña.innerHTML = "La contraseña debe tener al menos 6 caracteres";
    contrasenia.style.border = "1px solid red";
    errores = true;
    }else if(contrasenia.value != RepetirContraseña.value){
    errorContraseña.innerHTML = "Las contraseñas deben coincidir";
    contrasenia.style.border = "1px solid red";
    errores = true;
    }else{
    errorContraseña.innerHTML = "";
    contrasenia.style.border = "1px solid green";
    }
/*Condición de error para EMAIL*/
if(email.value == ""){
    errorEmail.innerHTML = "El email es obligatorio.";
    email.style.border = "1px solid red";
    errores = true;
    }else if(email.value.length < 10){
    errorEmail.innerHTML = "El email es inválido.";
    email.style.border = "1px solid red";
    errores = true;
    }else if(XPathExpression.test(email)){
    errorEmail.innerHTML = "El email es inválido.";
    email.style.border = "1px solid red";
    errores = true;
    }else{
    errorEmail.innerHTML = "";
    email.style.border = "1px solid green";
    }
    })
/*fetch de paises*/

window.addEventListener('load',function(){

  fetch("https://restcountries.eu/rest/v2/all")
    .then (function(respuesta){
      return respuesta.json();
    })
    .then (function(data){
      var paises = document.querySelector("#pais");
       for(i=0; i < data.length; i++){
         if(data[i].region == "Americas"){
           paises.innerHTML = paises.innerHTML
           + "<option value='+data[i]'>"+data[i].name+"</option>";
         }


    }})
    .catch (function(error){
      alert(error);
    })


});
