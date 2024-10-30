# FrontEnd-ClinicData
<p align="center">
<a href="https://github.com/Jonathan-Romano/ClinicData-Front-End/tree/master"><img src="https://github.com/Jonathan-Romano/Jonathan-Romano/blob/main/assets/ClinicData.png" style="height: 75%; width:75%;"/></center></a></p>

>Descripción: Clickear la imagen para ver el front-End de la aplicacion

# Introducción:
Aplicacion de Gestión de Pacientes: 
Permite gestionar de manera eficiente a los pacientes de un consultorio, junto con sus visitas médicas. Facilita la visualización y administración de la información de cada paciente, así como el registro detallado de las visitas realizadas, ofreciendo una herramienta integral para un manejo organizado y efectivo.

##Funciones principales:

• Gestión de pacientes (agregar, eliminar, listar, obtener detalles).

• Gestión de visitas (agregar, eliminar, listar, obtener detalles).

# Arquitectura:
### Servicios:
La API se divide en dos servicios principales:

• **Servicio de Pacientes**: Maneja la información de los pacientes disponibles en la plataforma.

• **Servicio de Visitas**: Permite gestionar las visitas de cada paciente.


---
### Servicio de productos:

#### •  Crear Paciente:

Peticion:
```
POST  “/patient/create”
```
>Descripción: Este endpoint crea un nuevo paciente

Ejemplo:

![](https://github.com/Jonathan-Romano/ClinicData-Back-End/blob/master/src/main/resources/static/patient/patient-create.jpg)
--

#### • Obtener Paciente por ID

Peticion:
```
GET  “/patient/{id}”
```
>Descripción: Este endpoint devuelve los detalles de un producto específico usando su ID..*

Ejemplo:

![](https://github.com/Jonathan-Romano/ClinicData-Back-End/blob/master/src/main/resources/static/patient/patient-id.jpg)
>Descripción: Paciente sin visitas realizadas

![](https://github.com/Jonathan-Romano/ClinicData-Back-End/blob/master/src/main/resources/static/patient/patient-id-with-visit.jpg)
>Descripción: Paciente con una visita realizada
--
>
#### • Listar Pacientes:

Peticion:
```
GET  “/patient/list”
```
>Descripción: Este endpoint devuelve una lista de todos los paciente disponibles en la plataforma..

Ejemplo:

![](https://github.com/Jonathan-Romano/ClinicData-Back-End/blob/master/src/main/resources/static/patient/patient-list.jpg)
--

#### •  Editar Paciente:

Peticion:
```
PUT  “/patient/edit/{id}”
```
>Descripción: Este endpoint permite editar los detalles de un paciente existente.

Ejemplo:

![](https://github.com/Jonathan-Romano/ClinicData-Back-End/blob/master/src/main/resources/static/patient/patient-edit.jpg)
--

#### • Eliminar Paciente:

Peticion:
```
GET  “/patient/delete/{id}”
```
>Descripción: Este endpoint elimina un paciente por su ID.

Ejemplo:

![](https://github.com/Jonathan-Romano/ClinicData-Back-End/blob/master/src/main/resources/static/patient/patient-delete.jpg)
--

#### • Buscar Paciente:

Peticion:
```
GET  “/patient/search?name={nombre del paciente}”
```
>Descripción: Este endpoint devuelve el paciente que coincide con el nombre buscado.

Ejemplo:

![](https://github.com/Jonathan-Romano/ClinicData-Back-End/blob/master/src/main/resources/static/patient/patient-search.jpg)

---
### Servicio de Visitas:

#### • Obtener Visita por ID

Peticion:
```
GET  “/visit/{id}”
```
>Descripción: Este endpoint devuelve los detalles de una visita.

Ejemplo:

![](https://github.com/Jonathan-Romano/ClinicData-Back-End/blob/master/src/main/resources/static/visit/visit-id.jpg)
--

#### • Listar Visitas:

Peticion:
```
GET  “/visit/list”
```
>Descripción:  Este endpoint devuelve una lista de todos las visitas.

Ejemplo:

![](https://github.com/Jonathan-Romano/ClinicData-Back-End/blob/master/src/main/resources/static/visit/visit-list.jpg)
--

#### • Crear Visita:

Peticion:
```
POST  “/visit/create”
```
>Descripción: Este endpoint crea una nueva visita.

Ejemplo:

![](https://github.com/Jonathan-Romano/ClinicData-Back-End/blob/master/src/main/resources/static/visit/visit-create.jpg)
--

#### •  Editar Visita:

Peticion:
```
GET  “/edit/{id}”
```
>Descripción: Este endpoint permite editar una visita por su ID.

Ejemplo:

![](https://github.com/Jonathan-Romano/ClinicData-Back-End/blob/master/src/main/resources/static/visit/visit-edit.jpg)
--

#### •  Eliminar Visitas:

Peticion:
```
GET  “/visit/{id}”
```
>Descripción: Este endpoint elimina una visita por su ID.

Ejemplo:

![](https://github.com/Jonathan-Romano/ClinicData-Back-End/blob/master/src/main/resources/static/visit/visit-delete.jpg)
--
