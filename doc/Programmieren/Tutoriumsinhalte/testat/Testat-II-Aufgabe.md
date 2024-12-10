# Schreiben Sie ein Programm mit folgenden komponenten
## Implementieren Sie in der Klasse "GeschwindigkeitAuto" folgende Methoden
```
Methodenkopf-1:
public static void einlesenGeschwindigkeit(int geschwindigkeiten[])

Methodenfunktion-1:
Die Methode liest Geschwindigkeiten für ein Auto mit ganzzahligen, realistischen Werten ein (d.h. zwischen 1 und 300 km/h, Randwerte einschließlich). 
Die Werte werden solange eingegeben bis -1 eingegeben wird oder das Array voll ist.

Methodenkopf-2:
public static void ausgeben(int geschwindigkeiten[])

Methodenfunktion-2:
Geben Sie in dieser Methode mit Hilfe einer Schleife die Geschwindigkeiten wieder auf der Konsole aus, wobei nur die eingelesenen Werte ausgegeben werden sollen.

Ausgabeformat:
Geschwindigkeit: X km/h
Geschwindigkeit: Y km/h
Geschwindigkeit: Z km/h
...
```

## GeschwindigkeitAutoTesttreiber
```
GeschwindigkeitAutoTesttreiber

Aufgabe:
Testen der oben aufgeführten Methoden (mithilfe der main-Methode).
```

## Hinweise:
* Ihr Programm darf nicht abstürzen, wenn keine Geschwindigkeiten übergeben werden.

### Mögliche Fehler
```
error: incompatible types: [erwarteter Datentyp] cannot be converted to [falscher Datentyp][Klassenname.methodenname(parameterliste)];
Ihr Programm nimmt wahrscheinlich andere Datentypen entgegen, als vom Bewertungssystem erwartet.
Bitte überprüfen Sie, ob Sie dieselben Datentypen verwenden, wie in der Aufgabenstellung gefordert.
 
error: cannot find symbol [Klassenname.methodenname(parameterliste)];
Dieses Problem kann vorliegen, wenn eine Methode oder eine Klasse anders benannt wurde, als vom Bewertungssystem erwartet.
Bitte überprüfen Sie, ob Sie dieselben Klassen- und Methodennamen verwenden, wie in der Aufgabenstellung gefordert.
 
java.lang.ArithmeticException
Es liegt ein Problem mit einer arithmetischen Operation bei bestimmten Eingaben in Ihr Programm vor. Eine Ursache kann die Division durch 0 sein.
 
java.lang.NullPointerException
Dieses Problem liegt oft vor, wenn ein Objekt (wie z. B. der Scanner) noch nicht instanziiert wurde und eine Methode auf diesem Objekt ausgeführt werden soll.
```

## Persönliche Meinung:
Anstelle eines Arrays sollte man eigtl Arraylisten benutzen, aber da es eine Strikte vorgabe gibt, wird hier ein riesiges Array erstellt um die Aufgabe zu erfüllen. Nehmt euch bitte kein Beispiel daran, um davon auszugehen - das es so auch in der Realität aussieht...