<h1>Backend de l'application</h1>
<p>Le présent rapport décrit la partie backend d'une application web de gestion des comptes bancaires intitulée "Ebanking".<br>
Cette application utilise le framework Spring Boot, réputé pour sa structure solide et son support pour le développement d'applications Java.<br>
chaque compte appartient à un client. un compte peut subir plusieurs opérations de type DEBIT ou CREDIT. Il existe deux types de comptes : Comptes courants et comptes épargnes.</p>
<h2>part1:La couche DAO</h2>
<ol>
<li> Création d'un projet Spring Boot</li>
<li> Création des entités JPA : Customer, BankAccount, Saving Account, CurrentAccount, AccountOperation</li>
<li> Création des interfaces JPA Repository basées sur Spring Data</li>
<li> Le Test de la couche DAO</li>
</ol>
<img src="images/arc.png">
<h2> Les stratégies de mapping</h2>
<h3>Single Table</h3>
<img src="images/i1.png">
<img src="images/i2.png">

<h3>Table Per Class</h3>
<img src="images/i3.png">
<img src="images/i4.png">

<h3>Joined</h3>
<img src="images/i5.png">
<img src="images/i6.png">
<img src="images/i7.png">
<h2>part2:La couche service, DTOs et RestController</h2>
<img src="images/arcservice.png">
<h3>Le test de CustomerRestController avec Insomnia</h3>
<img src="images/p2i1.png">
<img src="images/p2i2post.png">
<img src="images/p2i3put.png">
<img src="images/p2i4delete.png">
<h3>Le test de CustomerRestController et BankAccountRestController avec SWAGGER</h3>
<img src="images/p2i5swagger.png">
<h3>CustomerRestController</h3>
<img src="images/swaggerget.png">
<img src="images/p2swaggergetid.png">
<img src="images/p2swaggerpost.png">
<img src="images/p2swaggerdelete.png">
<h3>BankAccountRestController</h3>
<img src="images/p2swaggergetA.png">
<img src="images/p2swaggergetidA.png">
<h3>Importation de la documentation de Api Restful dans Insomnia </h3>
<img src="images/p2docimport.png">



