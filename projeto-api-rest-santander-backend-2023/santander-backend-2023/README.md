# Bootcamp Santander Backend 2023
Java RESTful API criada para a Santander Backend 2023

## Diagrama de Classes

classDiagram
class User {
- name: String
- account: Account
- features: Feature[]
- card: Card
- news: News[]
}
class Account {
- number: String
- agency: String
- balance: Float
- limit: Float
}
class Feature {
- icon: String
- description: String
}
class Card {
- number: String
- limit: Float
}
class News {
- icon: String
- description: String
- url: String
}

User *-- Account : has
User *-- Feature : has many
User *-- Card : has one
User *-- News : has many
