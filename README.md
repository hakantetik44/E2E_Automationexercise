# 
# # Nom du Projet

E2E_Automationexercise

## Description du Projet

Ce projet est un framework d'automatisation de tests basé sur Selenium et Cucumber, développé pour les tests de bout en bout (E2E). Il couvre les scénarios d'inscription, de connexion et de suppression de compte sur le site web Otomasyonexercise.com.

## Exigences

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html) (JDK 11 et supérieur)
- [Maven](https://maven.apache.org/download.cgi)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) ou votre IDE Java préféré

## Structure du Projet

- **src/main/java/utils**: Classes utilitaires pour les fonctions et les méthodes auxiliaires.
- **src/main/java/pages**: Modèles d'objets de page représentant les éléments de l'interface utilisateur.
- **src/main/java/stepdefinitions**: Classes de définition de pas pour les scénarios Cucumber.
- **src/main/java/runner**: Classe de test JUnit pour exécuter les tests Cucumber.
- **src/main/java/config**: Configurations et paramètres du projet.
- **src/test/resources/features**: Fichiers de scénarios Cucumber.
- **src/test/resources/config**: Fichiers de configuration du projet.
- **src/test/resources/drivers**: Pilotes WebDriver.
- **src/test/resources/screenshots**: Captures d'écran en cas d'échec.

## Technologies et Bibliothèques Utilisées

- Selenium WebDriver
- Cucumber
- JUnit
- Maven
- Faker
- PrettyReports

## Installation

1. Téléchargez et installez Java et Maven sur votre ordinateur.
2. Clonez le dépôt du projet sur votre ordinateur : `git clone https://github.com/hakantetik44/E2E_Automationexercise.git`
3. Ouvrez le projet avec IntelliJ IDEA ou votre IDE Java préféré.
4. Ouvrez la classe `src/test/java/runner/TestRunner.java` et exécutez les tests avec l'option "Run".


## Rapports

Le projet génère automatiquement des rapports à l'aide de l'extension de reporting Cucumber. Les rapports sont disponibles dans le dossier `target`. De plus, des captures d'écran sont stockées dans le dossier `screenshots` en cas d'échec du scénario.

## Contribution et Mises à Jour

Si vous souhaitez contribuer au projet en ajoutant de nouvelles fonctionnalités ou en corrigeant des erreurs, veuillez créer une branche, effectuer vos modifications, puis soumettre une demande de fusion pour intégrer vos changements à ce dépôt.


