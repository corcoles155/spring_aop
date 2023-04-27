## AOP (Aspect oriented programming)

## AOP conceptos básicos

AOP es un paradigma de programación que ayuda a resolver problemas llamados crosscutting concerns, agregando
comportamiento a código existente sin necesidad de modificarlo.

- Aspect: Funcionalidad que se aplica a múltiples clases.
- Join point: Punto durante la ejecución del programa.
- Advice: Acción a tomar en un joinpoint específico.
- Pointcut: Un predicado que representa un conjunto de joinpoints.
- Target object: Un objeto intervenido por uno o más aspectos.
- AOP proxy: Un objeto creado por AOP que permite soportar aspectos.
- Weaving: Es el enlace entre los aspectos y los objetos.

## Tipos de advices

- Before: Se ejecuta antes del joinpoint, no tiene la habilidad de interrumpir la ejecución a menos que arroje una
  excepción.
- After returning: Se ejecuta después de la ejecución del joinpoint a menos que se produzca una excepción.
- After throwing: Se ejecuta en caso de que el método genere una excepción.
- After finally: Se ejecuta si hay o no una excepción.
- Around: Rodea la ejecución de un método, puede ejecutar código antes, decidir si proceder con la ejecución o no,
  realizar la ejecución y hacer algo al final sin importar si hubieron o no excepciones.

## Creación deun aspecto

Para crear un aspecto utilizando Spring se realizarán las siguientes acciones:

- Definir un bean de Spring
- Anotarlo con @Aspect
- Definir el método que se ejecutará durante el advice.
- Anotar el método con @Before, @AfterReturning, @AfterThrowing, @After o @Around.
- Definir en el parámetro del advice seleccionado el pointcut utilizando pointcut expression language.

## AspectJ

Es posible utilizar AspectJ para poder tener todos los beneficios de la programación orientada a objetos.

## Especificar orden de preferencia de ejecución de un advice

Es posible que se tengan múltiples advices para un solo join point, por esto es posible determinar el orden en que se
ejecutará cada uno, para esto se anota el aspecto con @Order.

## Combinación de pointcuts

Es posible combinar pointcut expressions a través de los operadores && (and), || (or) y ! (not),

## Reutinización de pointcuts

Si es necesario utilizar el mismo pointcut para diferentes advices es posible reutilizar su definición a través de la
anotación @Pointcut.

## Ejemplos de expresiones pointcut

- execution(* org.sanchez.corcoles.ana.pruebasconcepto.*.*(..)) Se aplica a todos los métodos que se encuentren dentro
  del paquete especificado, sin importar lo que devuelva o los parámetros que reciba.
- within(org.sanchez.corcoles.ana.pruebasconcepto.*) Se aplica a todos los métodos que se encuentren dentro del paquete
  especificado.
- within(org.sanchez.corcoles.ana.pruebasconcepto..*) Se aplica a todos los métodos que se encuentren dentro del paquete
  y sus subpaquetes.
- within(org.sanchez.corcoles.ana.pruebasconcepto.HelloWorld) Se aplica a todos los métodos que se encuentren en la
  clase especificada.
- within(HelloWorld) Puedes especificar sólo el nombre de la clase en caso de que se encuentre en el mismo paquete.
- within(HelloWorld+) Se aplica a todas las clases que implementen la interface HelloWorld.
- @annotation(AnnotationExample) Se aplica a todos los métodos anotados con @AnnotationExample.
