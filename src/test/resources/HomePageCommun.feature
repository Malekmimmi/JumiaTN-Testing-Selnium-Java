#Author: Malek MATAR BACHA

Feature: Connexion au site JumiaTunisie et ajoter un produit au panier
  I want to use this template for my feature file

   Scenario: Connexion correcte au site et ajouter un produit au panier
    Given acceder au site
    And cliquer sur le Button SE CONNECTER
    When user entre son username "malekmimmi@gmail.com"
    And user clique sur le Button Continuer
    And user entre son password "08722085"
    And user clique sur le Button Se Connecter
    Then user clique sur le submenu du produit 
    And user clique sur le produit
    And user clique sur le panier pour verifier

  
