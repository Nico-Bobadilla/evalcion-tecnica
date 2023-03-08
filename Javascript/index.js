// Ejercicio 2
// Cadenas con letra "P"
const frutas = ["Manzana", "Naranja", "Plátano", "Fresa", "Uva", "Mango", "Melón", "Piña", "Melocotón", "Melocotón"];

const frutasConP = frutas.filter(fruta => fruta.includes('p'));

console.log(frutasConP);

//Cadena "Uva"
const frutas = ["Manzana", "Naranja", "Plátano", "Fresa", "Uva", "Mango", "Melón", "Piña", "Melocotón", "Melocotón"];

const uva = frutas.find(fruta => fruta === 'Uva');

console.log(uva);

//Ejercicio 3
const mostrar = (param) => {
    param();
  }
  
  const imprimirMensaje = () => {
    console.log("Etendo!!!");
  }
  
  mostrar(imprimirMensaje); 

//Ejercicio 4
function esDiagonal(matriz) {
    for (let i = 0; i < matriz.length; i++) {
      for (let j = 0; j < matriz[i].length; j++) {
        
        if (i !== j && matriz[i][j] !== 0) {
          return false;
        }
      }
    }
    
    return true;
  }
  
  // Ejemplos 
  const matriz1 = [[1, 0, 0], [0, 2, 0], [0, 0, 3]];
  const matriz2 = [[1, 0, 0], [0, 2, 3], [0, 0, 3]];
  
  console.log(esDiagonal(matriz1)); 
  console.log(esDiagonal(matriz2));
  
 //Ejercicio 15
 import React from 'react';

function Titulo(props) {
  return (
    <h1>{props.datos}</h1>
  );
}

export default Titulo;

//Ejercicio 18
fetch('https://api.example.com/data')
  .then(response => response.json())
  .then(data => console.log(data))
  .catch(error => console.error(error))

//Ejercicio 20
import React from 'react';
import useContador from './useContador';

function Contador() {
  const [contador, aumentarContador, disminuirContador] = useContador(1);

  return (
    <div>
      <h1>Contador: {contador}</h1>
      <button onClick={aumentarContador}>Aumentar</button>
      <button onClick={disminuirContador}>Disminuir</button>
    </div>
  );
}

export default Contador;




