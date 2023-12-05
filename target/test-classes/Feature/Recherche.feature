Feature: Recherche

En tant qu'apprenti je veux faire une recherche sur l'interface mes ressources

Background:
   
     Given lapprenti est sur la page d accueil
    When lapprenti clique sur connexion
    And  lapprenti entre ameni.dridi@talan.com and Admin01$
    And  lapprenti clique sur le bouton Sidentifier
    Then lapprenti est sur la page du tableau de bord



@Recherche
Scenario Outline:
   
    When l'apprenti clique sur mes ressources
    And  l'apprenti saisit <motclef>
    Then le résultat de la recherche est affiché 

  
Examples:
  |motclef       |
  |outils de test|
  