pipeline{
  agent any
  stages{
    stage("build"){
      steps{
        echo "in build stage"
        bat "mvn clean"
      }
     }
    stage("deploy"){
      steps{
       echo "in install stage"
      }
    }
    stage("test"){
      steps{
        echo "in test stage"
      }
    }
  }
}
