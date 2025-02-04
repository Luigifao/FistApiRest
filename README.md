# Spring Boot REST API - Endpoints GET

Este projeto é uma aplicação simples em Spring Boot que demonstra a criação de endpoints GET para recuperar dados. 

## Pré-requisitos

- Java 11 ou superior
- Maven 3.6.3 ou superior

## Configuração do Projeto

1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
Construa o projeto:

sh
mvn clean install
Execute a aplicação:

sh
mvn spring-boot:run
Endpoints GET
Obter todos os itens
URL: /api/items

Método HTTP: GET

Resposta:

json
[
  {
    "id": 1,
    "name": "Item 1",
    "description": "Descrição do Item 1"
  },
  {
    "id": 2,
    "name": "Item 2",
    "description": "Descrição do Item 2"
  }
]
Obter um item por ID
URL: /api/items/{id}

Método HTTP: GET

Parâmetros:

id (obrigatório): ID do item

Resposta:

json
{
  "id": 1,
  "name": "Item 1",
  "description": "Descrição do Item 1"
}
Estrutura do Projeto
src/
└── main/
    ├── java/
    │   └── com/
    │       └── exemplo/
    │           └── demo/
    │               ├── DemoApplication.java
    │               ├── controller/
    │               │   └── ItemController.java
    │               ├── model/
    │               │   └── Item.java
    │               └── service/
    │                   └── ItemService.java
    └── resources/
        ├── application.properties
        └── data.sql
Controlador
java
@RestController
@RequestMapping("/api/items")
public class ItemController {
    
    @Autowired
    private ItemService itemService;
    
    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }
    
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id) {
        return itemService.getItemById(id);
    }
}
Serviço
java
@Service
public class ItemService {
    
    private static List<Item> items = new ArrayList<>(Arrays.asList(
        new Item(1L, "Item 1", "Descrição do Item 1"),
        new Item(2L, "Item 2", "Descrição do Item 2")
    ));
    
    public List<Item> getAllItems() {
        return items;
    }
    
    public Item getItemById(Long id) {
        return items.stream().filter(item -> item.getId().equals(id)).findFirst().orElse(null);
    }
}
Modelo
java
public class Item {

    private Long id;
    private String name;
    private String description;

    // Construtores, getters e setters
}
Contribuição
Se você encontrar algum problema ou tiver sugestões para melhorar o projeto, sinta-se à vontade para abrir uma issue ou enviar um pull request.

Licença
Este projeto está licenciado sob os termos da MIT License.
