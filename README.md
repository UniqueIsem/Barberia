# Barberia
Algoritmo que usa Colas para simular una barberia.

El programa inicia con una ventana la cual te pide que ingreses la cantidad de barberos y clientes, una vez seleccionados, saltaremos a la siguiente ventana.
La ventana que veremos a continuacion será una representacion visual de lo que viene siendo una barberia virtual con un maximo de 3 barberos, los cuales una vez que
se seleccione el boton de "ABRIR BARBERIA" irán pasando a los clientes (los cuales son instanciados como un conjunto de elementos dentro de una cola).
Por ejemplo...si al inicio ingresaste 2 barberos, de las 3 sillas que veremos, solo 2 de ellas funcionarán al abrir la barberia. A su vez, al abrir la barberia se 
pasarán automaticante 2 clientes de golpe debido a que estos 2 barberos se encontraban desocupados.

Los barberos tendrán un cronometro que marcará el tiempo (aleatoreo) que tardarán en finalizar su servicio, una vez que su cronometro llegue a cero, significa que ha
terminado y está desocupado. Al estar desocupado si es que todavia hay clientes esperando en la fila, esta se reducirá (eliminando un elemento de la cola) y el barbero
que esté desocupado se volverá a ocupar (haciendonos entender que el cliente que pasó está siendo atendido).
Una vez que ya no hayan clientes (la cola está vacia) los barberos que todavia esten ocupados terminarán su servicio, una vez que lo hagan, quedarán a la espera de 
nuevos clientes en la fila (se pueden añadir elementos a la cola con el boton "AÑADIR A COLA").
El boton de "CERRAR BARBERIA" no puede ser activado si todavia hay barberos ocupados.
Al lado derecho de la fila encontraremos al número del siguiente cliente de pasará una vez que uno de los barberos seleccionados se desocupe.

