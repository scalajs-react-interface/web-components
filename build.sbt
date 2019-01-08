name := "web-components"

//version := "2018.10.0-SNPASHOT"

enablePlugins(ScalaJSPlugin)


val scala212 = "2.12.6"

scalaVersion := scala212

crossScalaVersions := Seq(scala212)

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)


//deps

libraryDependencies ++= Seq("scalajs-react-interface" %%% "core" % "2018.10.25-RC" % Provided,
  "scalajs-react-interface" %%% "universal" % "2018.10.25-RC" % Provided,
  "scalajs-react-interface" %%% "vdom" % "2018.10.25-RC" % Provided)

//disable doc gen

sources in (Compile,doc) := Seq.empty
publishArtifact in (Compile, packageDoc) := false

//bintray
resolvers += Resolver.jcenterRepo

organization := "scalajs-react-interface"

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization := Some("scalajs-react-interface")

bintrayRepository := "maven"


publishArtifact in Test := false

//Test

scalaJSUseTestModuleInitializer in test := true

scalaJSLinkerConfig ~= (_.withModuleKind(ModuleKind.CommonJSModule))

resolvers ++= Seq(Resolver.bintrayRepo("scalajs-react-interface", "maven"),
  Resolver.bintrayRepo("scalajs-plus", "maven"))
scalaJSStage in Global := FastOptStage
