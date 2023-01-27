# showcase-decorator-patterns

<br>
Decorator é um pattern que tem como base que você possa distribuir metodos genéricos ou que </br> 
possam ser usados emmais classes mais facilmente.
</br>

Seu principal uso é em formas de pagamento, ou em quaisquer objetos que precisem ter uma funcionalidade </br>
coringa que precisem ter tipos diferentes de processamentos em casos diferentes, mesmo sendo do mesmo tipo.
</b>
</br>
</br>

No exemplo deste projeto é mostrado como exemplo recomendação de investimentos.
Caso valor da compra de um produto for maior que 100 retorna um tipo de resposta. </br>
Senão outra. </br>

Se quiser subir aplicação e testar fique a vontade. </br>
O curl segue abaixo. </br>
Ela foi feita em java11 </br>
</br>
``
curl --location --request POST 'http://localhost:8080/recomendar' \
--header 'Content-Type: application/json' \
--data-raw '{
"nomeProduto":"teste",
"valorCompra":"1000"
}'
``

Você pode observar abaixo na sequencia a amostra do codigo. </br>

Estrutura : </br>
<img src="pastas.jpg"> </br>
</br>
Metodos: </br>
<img src="metodos.jpg"> </br>
</br>
Chamada: </br>
<img src="chamada.jpg"> </br>




