``` mermaid 

classDiagram

class Runnable {
    <<Interface>>
}

class Galeria {
  +static int TOTAL_OBRAS
  +main(String[] args)
}

class Obra {
  -static String MSG_VENDER
  -static int TIEMPO_ESPERA
  -byte numObras
  +synchronized exponer(String id)
  +synchronized vender()
}

class Vendedor {
  -Obra obra
  +Vendedor(Obra o)
  +run()
}

class Alfarero {
  -Obra obra
  +Alfarero(Obra o)
  +run()
}

Runnable <|.. Alfarero
Runnable <|.. Vendedor

Vendedor --> Obra
Alfarero --> Obra

```
