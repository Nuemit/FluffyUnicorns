### Merge and Quicksort stuff

## Merge Sort
* Vergleiche
  * < n
* Bewegungen
  * 

### TOP-Down Mergesort (Rekursiv)
1. Teile die zu sortierende Folge in zwei "gleich Große" Teilfolgen auf.
2. Sortiere beide Teilflolgen (Falls Länge > 1) rekursiv mit Mergesort.
3. Mische die beiden sortierten Teilfolgen zu einer sortierten Folge.

```py
def mergesort(a, left, right):
    # > 1 Elements?
    if left < right: 
        # Halve it
        middle = (left + right) // 2
        # Recursion
        mergesort(a, left, middle)
        mergesort(a, middle + 1, right)
        # Mix
        merge(a, middle, right)
```
> Bei ungerader Anzahl ist linker Teil größer (z.B. 7 = 4 + 3)

### Bottom-UP Mergesort (iterativ)
1. Interpretiere den Input als n sortierte Teilfolgen der Länge 1
2. Mische 

#### Komplexität im Unterschied
* Selection & Insertion Sort: O(n^2) im Durchschnitt und im schlimmsten Fall, O(n) im besten Fall
* Merge Sort: O(n log n) im Durchschnitt und im schlimmsten Fall, O(n log n) im besten Fall
  * Also hat Merge Sort keinen Worst/Best case, es ist im Wesentlichen Optimal, da immer 0(n log n) vergleiche stattfinden.
  * Die Bewegungen allerdings, sind immer 2n * lb(n) Bewegungen (also relativ viel, z.B. mehr als Selection Sort)
* Quick Sort: O(n log n) im Durchschnitt, O(n^2) im schlimmsten Fall, O(n log n) im besten Fall
  * Quick Sort ist im Durchschnitt schneller als Merge Sort, da die Konstante vor dem n log n Faktor kleiner ist.
  * Allerdings kann Quick Sort im schlimmsten Fall sehr ineffizient sein, wenn das Pivot-Element schlecht gewählt wird.
  * Durch Techniken wie Randomized Quick Sort oder Median-of-Three kann die Wahrscheinlichkeit eines schlechten Pivots reduziert werden.

##### Warum sind diese Aussagen wahr?

* Selection & Insertion Sort:
  * Diese Algorithmen vergleichen jedes Element mit jedem anderen Element. Das bedeutet, dass sie im schlimmsten Fall und im Durchschnitt viele Vergleiche machen müssen, was zu O(n^2) führt. Im besten Fall, wenn die Liste schon fast sortiert ist, brauchen sie nur wenige Vergleiche, was zu O(n) führt.

* Merge Sort:
  * Merge Sort teilt die Liste immer in zwei Hälften, sortiert jede Hälfte und fügt sie dann wieder zusammen. Das Teilen und Zusammenfügen braucht immer ungefähr die gleiche Anzahl von Schritten, egal wie die Liste aussieht. Deshalb ist die Komplexität immer O(n log n).

* Quick Sort:
  * Quick Sort wählt ein Pivot-Element und teilt die Liste in zwei Teile: Elemente kleiner als das Pivot und Elemente größer als das Pivot. Wenn das Pivot gut gewählt ist, sind die Teile ungefähr gleich groß, und die Komplexität ist O(n log n). Wenn das Pivot schlecht gewählt ist, kann ein Teil viel größer sein als der andere, was zu O(n^2) führt. Techniken wie Randomized Quick Sort oder Median-of-Three helfen, ein gutes Pivot zu wählen und die Wahrscheinlichkeit eines schlechten Falls zu verringern.

#### Speicher
Bei **Selection & Insertion Sort** haben wir das problem, das gespeicherte Informationen immer wieder weggeworfen und.

#### Links
[Towers Of Hanoi](https://towersofhanoi.info/play.aspx)
