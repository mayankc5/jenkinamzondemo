pipeline
{
    
    agent any    
   tools {
   
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
