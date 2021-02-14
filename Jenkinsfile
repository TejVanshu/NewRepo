pipeline{
  agent any
  stages{
    stage("build"){
      mvn clean
    }
    stage("deploy"){
      mvn install
    }
    stage("test"){
      mvn test
    }
  }
}
