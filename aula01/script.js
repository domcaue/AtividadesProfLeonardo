function buscar(){
    var entrada = document.getElementById("entrada").value.toLoweCase();

    var contador = 0;

    if(entrada.length < 1){
        entrada = contador;
    }

    var url = "https://pokeapi.co/api/v2/pokemon/" + entrada + "";
 
    fetch(url).then(response => response.json()).then(data =>{
        var tela = document.getElementById("tela");

        tela.innerHTML = '<h2>' + data.name +'</h2>' + 
        ' <img class="pokemon" src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/'+data.id+'.gif&quot; > '
        +' <img class="pokemon" src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/back/'+data.id+'.gif&quot; > ' 

        + '<p> Id: ' +data.id + '</p>'
        + '<p> Tipo: ' +data.types.map(type => type.name) + '</p>'

        +'<p> Habilidades: ' + data.abilities.map(ability => ability.name) + '</p>'

        contador = data.id;
         document.getElementById("entrada").value="";

       
        
    }).catch(error =>{
        var tela = document.getElementById("tela");
        tela.innerHTML = '<p> Pokémon não encontrado </p>' +error;
    })
}