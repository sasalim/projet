Feature: Ajout Activité

Background:
   
 Given ladministrateur est sur la page d accueil
    When ladministrateur clique sur connexion
    And  ladministrateur entre mouna.makni@talan.com and Admin09$
    And  ladministrateur clique sur le bouton Sidentifier
    Then ladministrateur est sur la page du tableau de bord

@AjoutActValide
Scenario Outline:

   When ladministrateur clique sur cursus
   And  ladministrateur clique sur editeCurcus
   And  ladministrateur clique sur listeLecon
   And  ladministrateur clique sur editeLecon
   And  ladministrateur clique sur activite
   And  ladministrateur clique sur ajouter
   And  ladministrateur saisi  <titre> and <contenu>
   And  ladministrateur clique sur ajouterActivite
   Then message de sucée d'ajout affiché
   Examples:
  |titre         |contenu|
  |Activite      | Facile|
   
@AjoutActInvalide
Scenario Outline:
   When ladministrateur clique sur cursus
   And  ladministrateur clique sur editeCurcus
   And  ladministrateur clique sur listeLecon
   And  ladministrateur clique sur editeLecon
   And  ladministrateur clique sur activite
   And  ladministrateur clique sur ajouter
   And  ladministrateur saisi  <titre> and <contenu>
   And  ladministrateur clique sur ajouterActivite
   Then message echec d'ajout affiché
   Examples:
  |titre         |contenu|
  |Activite      |       |
  