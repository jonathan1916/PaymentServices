># RETO 1. CRUD REPOSITORY Y EXCEPCIONES

### Sección 1: CRUD Repository

	Topic: Implementa un servicio RESTful en Spring Boot.

Crea un servicio RESTful que maneje operaciones de lectura, escritura, actualización y borrado de registros.

Entidad: 

- Product

Atributos:

- Long id, 
- String name, 
- String label, 
- Double price,
- Date createdAt
	
Requisitos:  
- Define la entidad Product.
- Crea un repositorio JPA para Product.
- Implementa un controlador REST con endpoints para crear, consultar, actualizar y eliminar productos.

	Topic: Consulta con filtros.

Crea un endpoint GET para consultar los productos por nombre
			
Requisitos:
- El método debe recibir el texto a buscar por Name.
- Las coincidencias deben ordenarse descendentemente.


### Sección 2: Excepciones

	Topic: Manejo de excepciones para los endpoints

Requisitos:
- Valida que los datos de entrada no sean nulos para el método POST (name, label, price)