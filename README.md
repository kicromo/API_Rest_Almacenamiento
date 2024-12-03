# API_Rest_Almacenamiento

Introducción a la Práctica​:

• Contexto: La gestión de inventario en tiempo real es fundamental para empresas con múltiples almacenes.​
• Desafío Real: Garantizar consistencia y sincronización en la información de inventario entre diferentes ubicaciones.​
• Objetivo del Proyecto: Implementar un sistema que permita consultar, actualizar y sincronizar el inventario en diferentes nodos en tiempo real.​

Funcionalidades del Sistema
1. Gestión de Stock: Permitir la actualización y consulta de inventarios en tiempo real.​
2. Sincronización entre Almacenes: Cualquier cambio se refleja en todos los nodos.​
3. Consulta Global: Posibilidad de ver inventarios de otros almacenes.​
4. Alertas de Reposición: Notificación automática al alcanzar un nivel de stock mínimo.​
5. Historial de Movimientos: Registro de entradas, salidas y transferencias de cada almacén.​

Requisitos Técnicos​
• Arquitectura Distribuida: Implementar nodos independientes (almacenes) en una arquitectura Cliente-Servidor o Peer-to-Peer.​
• Modelos de Comunicación: Uso de paso de mensajes y objetos distribuidos para la comunicación entre nodos.​
• Middleware: Utilizar un middleware de mensajes o publicación-suscripción (como RabbitMQ o gRPC).​
• Persistencia de Datos: Base de datos distribuida o almacenamiento compartido.​
• Sincronización de Inventarios: Algoritmos de exclusión mutua, snapshots y sincronización de relojes.​

Algoritmos Distribuidos (Teoría Breve)​
• Exclusión Mutua Distribuida: Para asegurar que no haya accesos concurrentes conflictivos al inventario.​
• Algoritmos de Snapshots: Captura del estado actual de un nodo para sincronización global.​
• Sincronización de Relojes: Uso de relojes lógicos para ordenar y coordinar eventos.​

Recursos y Herramientas​
• Lenguajes Sugeridos: Java, Python (para comunicación distribuida y middleware).​
• Herramientas Middleware: RabbitMQ, gRPC, o ZeroMQ.​
• Bibliotecas para Almacenamiento: Redis (para almacenamiento distribuido), PostgreSQL.​
• Documentación: GitHub para repositorio de código.​
