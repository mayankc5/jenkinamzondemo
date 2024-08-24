opipeline
{
    
    agent any    
   tools {
   
   maven 'MAVEN_HOME'
}
    stages{
        

          stage('Build stage')
        {
            steps{
             
               bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
       
    }
}
