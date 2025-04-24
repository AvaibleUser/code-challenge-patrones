# Implementacion de patrones para gestionar pedidos de restaurante

## Diagrama de clases

![Diagrama de clases](https://github.com/joseluisgs/cc-patrones/blob/main/diagrama.png)

## Justificación de diseño

### Builder

El Builder es utilizado para crear crear los pedidos. Se utiliza para crear objetos de tipo `Order` a partir de un conjunto de objetos `OrderItem`. 

Los objetos `OrderItem` son los platos principales, acompañamientos, bebidas y extras. Cada uno de estos objetos tiene un precio y una cantidad. 

Para crear un pedido, se debe indicar los objetos `OrderItem` que se desean incluir en el pedido. El Builder creará un objeto `Order` con los objetos `OrderItem` indicados. 

```java
Order order = Order.builder()
    .item(new MainDish("Hamburguesa", 10.0, 2))
    .item(new Extra("Papas", 5.0, 1))
    .item(new Drink("Agua", 2.0, 1))
    .build();
```

### Composite

El composite es utilizado para crear objetos de tipo `Order` a partir de un conjunto de objetos `OrderItem`. 

Los objetos `OrderItem` ademas de ser platos como se mencionó anteriormente, también pueden ser combos y descuentos que .

### Strategy