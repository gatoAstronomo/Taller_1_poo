Clase Main:  
    Atributos:
    Tiene una matriz 7*24 llamada sismo que almacena los sismos en formato [dia][hora]  
    opcion: De tipo int guarda la opcion selecionada por el usuario  
    correr: Booleano Gurda el estado del programa si esta corriendo o esta parado  
    Metodos:  
        main: Ejecuta un while con un switch case que le pide al usuario que ingrese una de las opciones  
        y las ejecuta  
        imprimirMenu: Imprime todo el menu por pantalla  
        ingresarDatos: Rellena toda la matriz con doubles  
        buscarmayorSismo: Busca el mayor sismo en sismos
        contarSismos: Cuenta todos los sismos de magnitud mayor o igual que 5.0  
        enviarSMS: Envia un sms con una alerta por cada sismo mayor o igual que 7.0  
        pedirCasoMenu: Pide el caso del menu principal y valida la entrada para que sea solo entero
