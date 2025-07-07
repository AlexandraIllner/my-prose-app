![Java](https://img.shields.io/badge/Java-11%2B-brightgreen.svg)
![Maven](https://img.shields.io/badge/Maven-3.6.3%2B-brightgreen.svg)
![Version](https://img.shields.io/badge/version-1.0.0-orange.svg)
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)


# My-Prose-App

**My-Prose-App** ist ein Beispiel für die Verwendung des **Prose-Builder**-Projekts.
Es zeigt, wie mit dem `ProseBuilder` aus der `prose-builder` Bibliothek einfache
Sätze zu Prosatexten zusammengefügt werden können.

**Prose-Builder** ist ein einfaches Open-Source-Tool zur Erstellung von Prosatexten,
basierend auf importierten Sätzen. Es ermöglicht Entwickler:innen, einfach Sätze zu
registrieren und daraus fließende Prosa zu generieren.

## Überblick

My-Prose-App demonstriert die Funktionalität von Prose-Builder, indem es einfache Sätze
registriert und daraus eine komplette Prosa generiert, die dann in der Konsole
ausgegeben wird.

## Features

- **Integration von Prose-Builder**: Nutzung der `ProseBuilder`-Klasse für einfache
Prosa-Erstellung.
- **Beispielimplementierung**: Enthält eine einfache Implementierung eines
`Sentence`-Interfaces.

## Installation

Um die Applikation zu installieren und auszuführen, wird Maven benötigt,
um die Abhängigkeiten zu verwalten.

- **Klonen des Repositories:**

  ```shell
  git clone https://github.com/eliseHtw/my-prose-app.git
  cd my-prose-app
  ```

- **Erstellen des Projekts mit Maven:**

  ```shell
  mvn clean install
  ```

## Verwendung

Um My-Prose-App auszuführen, kann der folgende Befehl im Terminal verwendet werden:

```shell
mvn exec:java -Dexec.mainClass="de.htw_berlin.fb4.elise.my-prose-app.App"
```

Das Programm wird eine einfache Nachricht und die generierte Prosa basierend auf der
`SimpleSentence` Klasse in der Konsole ausgeben.

## Abhängigkeit zu Prose-Builder

My-Prose-App ist auf Prose-Builder angewiesen, welches als Maven-Abhängigkeit in der
`pom.xml` enthalten ist:

URL zum Repository: https://maven.pkg.github.com/bs-jokri/prose-builder
(https://github.com/bs-jokri/prose-builder)

```shell
<dependency>
  <groupId>de.htw_berlin.fb4.ossd</groupId>
  <artifactId>prose_builder</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```


## Beitrag

Beiträge und Verbesserungen sind herzlich willkommen! Um mitzumachen, folge diesen
Schritten:

1. Forke das Repository.
2. Erstelle einen neuen Feature-Branch (`git checkout -b feature/neues-feature`).
3. Committe die Änderungen (`git commit -m 'Neues Feature hinzugefügt'`).
4. Push zu deinem Branch (`git push origin feature/neues-feature`).
5. Sende einen Pull Request.


## Lizenz

Dieses Projekt wird unter der European Union Public License 1.2 lizenziert.
Es erlaubt freie Nutzung, Modifikation und Verteilung unter Beibehaltung der
Lizenzbedingungen. Details findest du in der LICENSE-Datei.

## Kontakt

Bei Fragen oder Anregungen zu My-Prose-App kann direkt über das GitHub Repository
ein Issue erstellt werden.
