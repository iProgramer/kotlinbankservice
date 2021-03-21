Mögliche Änderungen

- Layer zwischen API und Service einbauen, um einem
  potenziellen [fat controller antipattern](https://github.com/user/repo/blob/branch/other_file.md) entgegenzuwirken.

Überlegungen:

- JPA ORM Annotations direkt an die Models, sprich ein Entity für Persistenz und Domain Logik verwenden
- DTO Objekte für API einführen (Requet- und Repsonse Models)
- Could be splitted into 2 different classes (1 for incoming requests, 1 for outgoing responses)
- Deutsch-Englisch Kombination nicht schön - aufgrund der Aufgabenstellung, und um es mal mit DDD zu versuchen, auf
  deutsch gehalten