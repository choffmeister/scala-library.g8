name := "$name;format="norm"$"
organization := "$organization$"
scalaVersion := "$scala_version$"
crossScalaVersions := Seq("$scala_version$", "2.11.12")

resolvers += Resolver.bintrayRepo("$bintray_user$", "maven")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.5" % Test
)

scmInfo := Some(ScmInfo(url("$github_url$"), "$github_git_url$"))
git.remoteRepo := scmInfo.value.get.connection
sourceDirectory in Paradox := baseDirectory.value / "docs"
siteSubdirName in SiteScaladoc := "api"
paradoxProperties in Paradox ++= Map(
  "snip.src.base_dir" -> (baseDirectory.value + "/src/main/scala/$package;format="packaged"$/"),
  "snip.test.base_dir" -> (baseDirectory.value + "/src/test/scala/$package;format="packaged"$/"),
  "scaladoc.$package$.base_url" -> "/api"
)

enablePlugins(GitVersioning)
enablePlugins(ParadoxSitePlugin, SiteScaladocPlugin, GhpagesPlugin)
