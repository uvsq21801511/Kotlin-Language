# Langage Kotlin
# Application de prise de notes avec asciidoctor
#### Voir le le site https://asciidoctor.org/

## Description
L’application proposera les fonctionnalités suivantes :
```markdown
1- créer ou modiﬁer (edit ou e) une note en lançant une application externe (éditeur de texte comme Visual Studio Code ou Vim);
2- lister (list ou ls) les notes existantes.
3- supprimer (delete ou d) une note.
4- voir (view ou v) une note en lançant une application externe (navigateur avec un plugin adapté pour Firefox ou Chrome).
5- rechercher (search ou s) dans les notes (par motclés dans l’ensemble de la note ou dans un élément particulier comme le titre ou un attribut).
6- À chaque mise à jour, un ﬁchier index.adoc sera générée qui contiendra des listes denotes classées par ordre alphabétique de titre selon diﬀérents critères de regroupement : toutes les notes, selon l’attribut contexte, selon l’attribut projet et enﬁn par mois.
7- le répertoire de stockage des notes, les applications externes à utiliser, ...devront être modiﬁables dans un ﬁchier de conﬁguration.
```

## Development tools

IntelliJ IDEA

## Exécution

java -jar ProjetPGLP-0.0.1-SNAPSHOT-executable.jar .

## Compilation
on se positionne dans le doossier parent
mvn package
mvn install

## Patterns
pattern commande
## Version
java 1.8
Junit 4.11
## Utilisation
Une fois que l'application tourne sur un terminal, on peut la tester.
on peut tester les différente commandes.
## Auteurs
Mohsen KARIMI
