<h2>Backend de l'application</h2>
<p>Le présent rapport décrit la partie backend d'une application web de gestion des comptes bancaires intitulée "Ebanking".<br>
Cette application utilise le framework Spring Boot, réputé pour sa structure solide et son support pour le développement d'applications Java.<br>
chaque compte appartient à un client. un compte peut subir plusieurs opérations de type DEBIT ou CREDIT. Il existe deux types de comptes : Comptes courants et comptes épargnes.</p>
<h3>part1:La couche DAO</h3>
<ol>
<li>1. Création d'un projet Spring Boot</li>
<li>2. Création des entités JPA : Customer, BankAccount, Saving Account, CurrentAccount, AccountOperation</li>
<li>3. Création des interfaces JPA Repository basées sur Spring Data</li>
<li>4. Le Test de la couche DAO</li>
</ol>
<img src="images/arc.png">
<h4> Les stratégies de mapping</h4>
<p>Single Table</p>
<img src="images/i1.png">
<img src="images/i2.png">

<p>Table Per Class</p>
<img src="images/i3.png">
<img src="images/i4.png">

<p>Joined</p>
<img src="images/i5.png">
<img src="images/i6.png">
<img src="images/i7.png">
<h3>part2:La couche service, DTOs et RestController</h3>
<img src="images/arcservice.png">
<h4>Le test de CustomerRestController avec Insomnia</h4>
<img src="images/p2i1.png">
<img src="images/p2i2post.png">
<img src="images/p2i3put.png">
<img src="images/p2i4delete.png">
<h4>Le test de CustomerRestController et BankAccountRestController avec SWAGGER</h4>
<img src="images/p2i5swagger.png">
<h4>CustomerRestController</h4>
<img src="images/swaggerget.png">
<img src="images/p2swaggergetid.png">
<img src="images/p2swaggerpost.png">
<img src="images/p2swaggerdelete.png">
<h4>BankAccountRestController</h4>
<img src="images/p2swaggergetA.png">
<img src="images/p2swaggergetidA.png">
<h4>Importation de la documentation de Api Restful dans Insomnia </h4>
<img src="images/p2docimport.png">



