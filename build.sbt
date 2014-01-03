organization := "dmm.sbt-scct"

name := "sbt-scct"

version := "0.3-SNAPSHOT"

scalaVersion := "2.10.2"

sbtPlugin := true

credentials += Credentials("Sonatype Nexus Repository Manager", "oss.sonatype.org", System.getenv("SONATYPE_USER"), System.getenv("SONATYPE_PASS"))

credentials += Credentials("Artifactory Realm", System.getProperty("deploy.realm"), System.getProperty("deploy.user"), System.getProperty("deploy.password"))

resolvers += "dmm-libs-snapshots" at "http://dominionmarinemedia.artifactoryonline.com/dominionmarinemedia/libs-snapshots-local"

resolvers += "Sonatype OSS" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies += "dmm.scct" %% "scct" % "0.3-SNAPSHOT"

publishTo := {
  val dmmRepo = "http://dominionmarinemedia.artifactoryonline.com/dominionmarinemedia/"
  Some("dmm-plugins-snapshots" at dmmRepo + "plugins-snapshots-local")
}

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { x => false }

pomExtra := <url>http://scct.github.io/scct/</url>
  <licenses>
    <license>
      <name>Apache License, Version 2.0</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:SCCT/sbt-scct.git</url>
    <connection>scm:git:git@github.com:SCCT/sbt-scct.git</connection>
  </scm>
  <developers>
    <developer>
      <id>mtkopone</id>
      <name>Mikko Koponen</name>
      <url>http://mtkopone.github.com</url>
    </developer>
  </developers>

