
# FrontEndTechnomist
<p align="center">
<a href="https://github.com/Jonathan-Romano/TechnoMist-Front-End"><img src="https://github.com/Jonathan-Romano/Jonathan-Romano/blob/main/assets/TechnoMist.png" style="height: 75%; width:75%;"/></center></a></p>

>Descripción: Clickear la imagen para ver el front-End de la aplicacion

# Introducción:
Aplicacion de Gestión de Pacientes: 
Permite gestionar de manera eficiente a los pacientes de un consultorio, junto con sus visitas médicas. Facilita la visualización y administración de la información de cada paciente, así como el registro detallado de las visitas realizadas, ofreciendo una herramienta integral para un manejo organizado y efectivo.

##Funciones principales:

• Gestión de pacientes (agregar, eliminar, listar, obtener detalles).

•  Gestión de visitas (agregar, eliminar, listar, obtener detalles).

# Arquitectura:
### Servicios:
La API se divide en dos servicios principales:

• **Servicio de Pacientes**: Maneja la información de los pacientes disponibles en la plataforma.

• **Servicio de Visitas**: Permite gestionar las visitas de cada paciente.


---
### Servicio de productos:

#### • Obtener Paciente por ID

Peticion:
```
GET  “/api/patient/{id}”
```
>Descripción: Este endpoint devuelve los detalles de un producto específico usando su ID..*

Ejemplo:

![](https://github.com/Jonathan-Romano/TechnoMist-Back-End/blob/master/public/product-service/product-service-product-1.jpg)

--
#### • Listar Pacientes:

Peticion:
```
GET  “/api/patient/list”
```
>Descripción: Este endpoint devuelve una lista de todos los paciente disponibles en la plataforma..

Ejemplo:

![](https://github.com/Jonathan-Romano/TechnoMist-Back-End/blob/master/public/product-service/product-service-product-1list.jpg)
--

#### •  Crear Paciente:

Peticion:
```
POST  “/patient/create”
```
>Descripción: Este endpoint crea un nuevo paciente

Ejemplo:

![](https://github.com/Jonathan-Romano/TechnoMist-Back-End/blob/master/public/product-service/product-service-product-create.jpg)
--

#### •  Editar Paciente:

Peticion:
```
PUT  “/api/patient/edit/{id}”
```
>Descripción: Este endpoint permite editar los detalles de un paciente existente.

Ejemplo:

![](https://github.com/Jonathan-Romano/TechnoMist-Back-End/blob/master/public/product-service/product-service-product-edit.jpg)
--

#### • Eliminar Paciente:

Peticion:
```
GET  “/api/patient/delete/{id}”
```
>Descripción: Este endpoint elimina un paciente por su ID.

Ejemplo:

![](https://github.com/Jonathan-Romano/TechnoMist-Back-End/blob/master/public/product-service/product-service-product-delete.jpg)
--

#### • Buscar Paciente:

Peticion:
```
GET  “/api/patient/search?name={nombre del paciente}”
```
>Descripción: Este endpoint devuelve el paciente que coincide con el nombre buscado.

Ejemplo:

![](https://github.com/Jonathan-Romano/TechnoMist-Back-End/blob/master/public/product-service/product-service-product-delete.jpg)

---
### Servicio de Visitas:

#### • Obtener Visita por ID

Peticion:
```
GET  “/api/visit/{id}”
```
>Descripción: Este endpoint devuelve los detalles de una visita.

Ejemplo:

![](https://github.com/Jonathan-Romano/TechnoMist-Back-End/blob/master/public/cart-service/cart-service-cart-1.jpg)
--

#### • Listar Visitas:

Peticion:
```
GET  “/api/visit/list”
```
>Descripción:  Este endpoint devuelve una lista de todos las visitas.

Ejemplo:

![](https://github.com/Jonathan-Romano/TechnoMist-Back-End/blob/master/public/cart-service/cart-service-cart-list.jpg)
--

#### • Crear Visita:

Peticion:
```
POST  “/api/visit/create”
```
>Descripción: Este endpoint crea una nueva visita.

Ejemplo:

![](https://github.com/Jonathan-Romano/TechnoMist-Back-End/blob/master/public/cart-service/cart-service-cart-create.jpg)
--

#### •  Eliminar Visitas:

Peticion:
```
GET  “/api/visit/{id}”
```
>Descripción: Este endpoint elimina una visita por su ID.

Ejemplo:

![](https://github.com/Jonathan-Romano/TechnoMist-Back-End/blob/master/public/cart-service/cart-service-cart-delete.jpg)
--
