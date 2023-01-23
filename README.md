# Dependencies description : <br>


<ul> 
    <li>Web : Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.v </li>
    <li>JPA : Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.</li>
    <li>Hibernate : Bean Validation with Hibernate validator.</li>
    <li>H2 : Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.</li>
    <li>Thymeleaf : A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers and as static prototypes.</li>
    <li>DevTools : Provides fast application restarts, LiveReload, and configurations for enhanced development experience.</li>
</ul>


<hr>

# Question étape 13 :

<ol>
    <li>@GetMapping("/greeting")</li>
    <li>return "greeting";</li>
    <li>model.addAttribute("nomTemplate", nameGET);</li>
</ol>

<hr>

# Question étape 17 :

<p>Oui, une table adresse est apparue</p>

<hr>

# Question étape 18 :

<p>Le Spring Boot Auto Configuration est à l'origine de cela. Il indique à Hibernate de mapper l'entité Address en tant que table dans la base de données</p>

<hr>

# Question étape 22 :

<p>C'est une annotation permettant l'injection automatique de dépendance</p>

<hr>

# Question étape 30 :

<p>J'ai importé le CDN (content delivery network) de Bootstrap dans chaque fichier html. Ainsi les classes css sont automatiquement chargées au lancement des pages</p>

<hr> 

# Question étape 6 (TP4) :
<p>Oui, il faut se créer un compte pour en générer une</p>
<p>Pour avoir les prévisions météo d'un endroit en entrant latitude et longitude avec son token : [https://api.meteo-concept.com/api/forecast/daily?token="+ token + "&latitude="+latitude+"&longitude="+longitude]</p>
<p>La méthode HTTP GET</p>
<p>En utilisant la concaténation des chaînes de caractères comme ci-dessus</p>
<p>Les données météo relatives à chaque jour se trouve dans le tableau "forecast", pour la température de chaque jour on va avoir "tmin" pour la température minimale et "tmax" pour la température maximale. </p>
<p>La prévision est donnée par la clé "weather"</p>


#### Projet GitHub : https://github.com/MaximeEtu/tp3-note