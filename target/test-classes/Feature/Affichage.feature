Feature: Affichage des ressources
En tant qu'apprenti je veux afficher la liste des ressources

Background:
   
     Given lapprenti est sur la page d accueil
    When lapprenti clique sur connexion
    And  lapprenti entre ameni.dridi@talan.com and Admin01$
    And  lapprenti clique sur le bouton Sidentifier
    Then lapprenti est sur la page du tableau de bord



@Affichage
Scenario:

   
    When l'apprenti clique sur mes ressources
    Then la liste des ressources est affiché