@login
Feature: login
  
  En tant qu apprenti je veux me connecter a Talan academy
@LoginAp
  Scenario Outline: Connexion apprenti
    Given lapprenti est sur la page d accueil
    When lapprenti clique sur connexion
    And  lapprenti entre <email> and <password>
    And  lapprenti clique sur le bouton Sidentifier
    Then lapprenti est sur la page du tableau de bord

    Examples: 
      | email                 | password |
      | ameni.dridi@talan.com | Admin01$ |

@LoginAd
 Scenario Outline: Connexion admin
    Given ladministrateur est sur la page d accueil
    When ladministrateur clique sur connexion
    And  ladministrateur entre <email> and <password>
    And  ladministrateur clique sur le bouton Sidentifier
    Then ladministrateur est sur la page du tableau de bord

    Examples: 
      | email                 | password |
      | mouna.makni@talan.com | Admin09$ |