# Exercice

accéder au front : aller sur http://localhost:8080/index.html

Le projet bARTle a pour objectif de vous faire manipuler les concepts abordés dans le cours. Votre objectif est de réussir à implémenter l'API permettant de répondre à tous les appels fetch réalisés sur les pages index.html, shapes.html et cards.html.:
1) index.html : 

a) un appel à http://localhost:8080/nobdd/circle renvoie un cercle créé lors de l'appel (utiliser new Circle)  -> {"x":210, "y":339, "radius":17,"color":"GREEN","area":907,"height":34,"id":null,"perimeter":106,"type":"CIRCLE","width":34}
   
b) un appel à http://localhost:8080/nobdd/rectangle renvoie un rectangle créé lors de l'appel (utiliser new Rectangle)  -> {"x":210, "y":339, "width":40,"height":20,"color":"BLUE","area":800,"id":null,"perimeter":120,"type":"RECTANGLE"}
   
c) un appel à http://localhost:8080/nobdd/card/15 renvoie une carte composée de 15 formes créée lors de l'appel (utiliser new Card, alimentez la comme vous le souhaitez)  -> {id:number, shapes:[]}

2) shapes.html : 
   
a) un appel à http://localhost:8080/api/shapes/detailed renvoie la liste des formes de la bdd pour un affichage graphique (avec tous les détails) -> [{x:210, y:339, radius:17,color:"GREEN",area:907,height:34,id:108,perimeter:106,type:"CIRCLE",width:34},...] 

b) un appel à http://localhost:8080/api/shapes renvoie la liste des formes de la bdd formatée (DTO) pour un affichage en liste.  -> [{color:"GREEN",id:108,type:"CIRCLE"},...]

c) lors du clic sur une forme de la liste un appel à http://localhost:8080/api/shapes/ID renvoie les détails de la forme correspondant à l'ID -> e.g. {"x":210, "y":339, "radius":17,"color":"GREEN","area":907,"height":34,"id":108,"perimeter":106,"type":"CIRCLE","width":34}

d) un formulaire permet de créer une nouvelle forme. En envoyant une requete POST à http://localhost:8080/nobdd/shapes avec les données de la forme à créer. La forme créée est ajoutée à la bdd et renvoyée dans la réponse.

3. cards.html :
   
a) un appel à http://localhost:8080/api/cards/detailed renvoie la liste des cartes de la bdd pour un affichage graphique (avec tous les détails) -> [{id:number, shapes:[]},...] 
   
b) un appel à http://localhost:8080/api/cards renvoie la liste des cartes de la bdd formatée (DTO) pour un affichage en liste.  -> [{id:number, nbrShapes:number},...]
   
c) lors du clic sur une carte de la liste un appel à http://localhost:8080/api/cards/ID renvoie les détails de la carte correspondant à l'ID -> e.g. {id:number, shapes:[]}

d) un formulaire permet d'ajouter une nouvelle carte (pas d'envoi de donnée) POST http://localhost:8080/api/cards

e) un formulaire permet d'ajouter une nouvelle forme à une card spécifiée par son id : POST  http://localhost:8080/api/cards/idShape/addShape

f) un bouton permet de supprimer la carte présente sur la liste. Cette suppression suprime les formes de la carte. : DELETE http://localhost:8080/api/cards/idShape

4. jeu.html : A VENIR