Feature: Pagination sur l'interface de ressources
En tant qu apprenti je veux paginer sur l'interface de mes ressources

Background:
   
     Given lapprenti est sur la page d accueil
    When lapprenti clique sur connexion
    And  lapprenti entre ameni.dridi@talan.com and Admin01$
    And  lapprenti clique sur le bouton Sidentifier
    Then lapprenti est sur la page du tableau de bord



@Pagination
Scenario:

   
    When lapprenti clique sur mes ressources
    And  lapprenti clique sur la page suivante
    And  lapprenti clique sur la page suivante
    And  lapprenti clique sur la page precedente
    Then la page precedente s'affiche 