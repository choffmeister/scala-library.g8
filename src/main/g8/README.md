# $name$

[![Download](https://api.bintray.com/packages/$bintray_user$/maven/$name;format="norm"$/images/download.svg)](https://bintray.com/$bintray_user$/maven/$name;format="norm"$/_latestVersion)

## Usage

```
libraryDependencies += "$organization$" %% "$name;format="norm"$" % "..." // see download badge for latest version
```

## Development

```bash
# testing
sbt test
sbt scalafmt test:scalafmt
sbt scalafmtCheck test:scalafmtCheck

# packaging
sbt +publishLocal
sbt +publish

# documentation
sbt previewSite
sbt ghpagesPushSite
```
