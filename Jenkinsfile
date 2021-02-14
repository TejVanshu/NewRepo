pipeline{
  agent any
  stages{
    stage("build"){
      steps{
        mvn clean
      }
     }
    stage("deploy"){
      steps{
       mvn install
      }
    }
    stage("test"){
      steps{
        mvn test
      }
    }
  }
}
