# Java POO Principles: Notificaciones Polimórficas 
Implementación de un sistema de notificaciones que demuestra el dominio de los pilares de la Programación Orientada a Objetos (POO) en Java.

## 🎯 Objetivo
Diseñar una arquitectura de software capaz de gestionar distintos canales de envío (Email y SMS) bajo una misma interfaz lógica, permitiendo la escalabilidad del sistema ante futuros nuevos canales (ej. WhatsApp, Push Notifications) sin modificar la lógica principal.

## 🧠 Conceptos Técnicos Aplicados

* **Clases Abstractas:** Uso de `Notificacion` como clase base para definir un contrato común, evitando la instanciación directa de una notificación genérica.
* **Herencia:** Las clases `Email` y `Sms` extienden la funcionalidad de la clase padre, aprovechando el encapsulamiento de atributos comunes como `destinatario` y `mensaje`.
* **Polimorfismo:** Implementación de un sistema donde un `ArrayList<Notificacion>` contiene objetos heterogéneos, invocando métodos comunes (`enviar()`) que se comportan de manera distinta según el tipo de objeto en tiempo de ejecución.
* **Encapsulamiento:** Protección de los datos mediante el uso de modificadores `private` y acceso controlado a través de métodos *getters*, siguiendo las mejores prácticas de seguridad en el código.

## 🏗️ Arquitectura


* **`Notificacion`**: Clase abstracta base.
* **`Email` / `Sms`**: Implementaciones concretas con atributos específicos (`asunto` y `numeroTelefono` respectivamente).
* **`Programa`**: Orquestador principal que gestiona la colección de notificaciones.
