pipeline
{
    
    agent any    
   tools {
     jdk 'JAVA_HOME'
   maven 'MAVEN_HOME'
  
}
    stages{
        

          stage('Build stage')
        {
            steps{
             
               bat "mvn clean test"
            }
        }
       
    }
}
