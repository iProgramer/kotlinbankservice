Mögliche Änderungen
- Layer zwischen API und Service einbauen, um einem potenziellen [fat controller antipattern](https://github.com/user/repo/blob/branch/other_file.md) entgegenzuwirken.


Überlegungen:
- JPA ORM Annotations direkt an die Models, sprich ein Entity für Persistenz und Domain Logik verwenden
- DTO Objekte für API einführen (Requet- und Repsonse Models)