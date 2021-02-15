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
        bat "mvn install"
      }
    }
    stage("test"){
      steps{
        echo "in test stage"
        dir("target/Project5-0.0.1-SNAPSHOT"){
          bat "java -jar Project5-0.0.1-SNAPSHOT.jar"
        }
          
        
      }
    }
  }
}
