# Das ist eine Wiederholung der objektorientierten Konzepte.

Bitte versuche als Übung alles in Markdown zu beantworten. Hier ist ein [Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

1. Was ist das Ziel der Objektorientierung?
 * Aufteilung des Gesamtprojekts auf kleine Teilprojekte und mehrere Entwickler, dadurch Reduktion der Entwicklungszeit
 * Leichte Erweiterbarkeit und Anpassungsfähigkeit
 
2. Gibt es OOP nur in Java?
 * Nein, viele andere Programmiersprachen (z.B. JavaScript, Python, R, ...) verwenden ebenfalls OOP.
 
3. Was ist der Unterschied zwischen Objekt und Klasse?
 * Ein Objekt ist eine Instanz / ein Exemplar einer Klasse.
 * Eine Klasse ist der Bauplan für ein Objekt.
 
4. Wie erzeuge ich eine neue Instanz? (Welches Schlüsselwort gibt es dafür)
 * Mit new() >> dadurch wird Speicherplatz reserviert, der dann das Objekt aufnimmt.
 
5. Was bedeutet das Schlüsselwort `static` und wo kann es überall verwendet werden?
  * Statische Programmelemente können verwendet werden, ohne vorher ein Objekt zu erzeugen.
 * Das bedeutet, dass ein statisches Programmelement über die gesamte Programmlaufzeit verfügbar ist.
 * Auf statische Programmelemente greift man direkt über die Klasse und nicht über eine Instanz der Klasse zu > Änderungen an statischen Variablen innerhalb einer Instanz haben Auswirkungen auf andere Instanzen.
 * Klassen (z.B. main), Methoden und Variablen können static sein.
 
6. Wozu dient die Vererbung?
  * Durch die Vererbung können Klassen hierarchisch angeordnet und so die Menge an redundantem Code reduziert werden.
  
7. Kann in Java von mehreren Klassen geerbt werden? Wenn ja wie?
 * In Java wurde nur die Einfachvererbung implementiert. Mithilfe der `Interfaces` wurde eine restriktive Art der Mehrfachvererbung geschaffen.
 
8. Welche Vererbungshierarchien kennst du? (Ein Bild reicht aus)
  * Single Inheritance (eine Subklasse erbt von einer Superklasse, z.B. B erweitert A)
  * Multi Level Inheritance (es gibt mehrere Ebenen an Subklassen, z.B. B erweitert A, C erweitert B, ...)
  * Hierarchical Inheritance (mehrere Subklassen erben von einer Superklasse, z.B. B erweitert A, C erweitert A)
  
9. Was beudeted Casten und wie ist die Syntax in Java dafür?
  * Type Casting bezeichnet die Umwandlung eines Datentyps in einen anderen Datentyp.
  * Um ein explizites Type Casting durchzuführen, muss der gewünschte Datentyp bei der Zuweisung eines Wertes / einer Variable in Klammern davorgesetzt werden.
  * z.B. double myDouble = 9.78;
        int myInt = (int) my Double;
  * Beim impliziten Type Casting wird der gewünschte Wert einfach der Variable zugewiesen.
  * z.B. int myInt = 9;
        double myDouble = myInt;
        
10. Was ist der Unterschied zwischen expliziten und impliziten Typecasting?
 * Implizites Typecasting: Wird vom Compiler durchgeführt, ohne dass er explizit angewiesen wird (z.B. von int zu double > widening casting)
 * Explizites Typecasting: Explizite Anweisung, einen Datentyp zu ändern (z.B. von double zu int, narrowing casting)
 
11. Erkläre die folgenden Schlüsselwörter: `super`, `this`
 * super ermöglicht es, von einer Subklasse aus auf z.B. Methoden einer Superklasse zuzugreifen.
 * this wird eingesetzt, wenn eine lokale Variable und der Übergabeparameter einer Methode denselben Namen haben.
 
12. Für was dient der `instanceof` Operator. Gib ein sinnvolles Beispiel.
 * Der instanceof-Operator beantwortet die Frage, ob ein Objekt eine Instanz einer bestimmten Klasse ist.
 * Beispiel: Beim Vergleich von Objekten ist es sinnvoll, zuerst einen instanceof-Abgleich zu machen.
 
 ---
 Eclipse bietet auch Markdown unterstützung inklusive Preview. Für die Verwendung muss kein Plugin installiert werden.
