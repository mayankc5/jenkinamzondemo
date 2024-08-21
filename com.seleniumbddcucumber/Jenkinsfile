pipeline
{
    
    agent any
    
   tools {
  maven 'MavenBuild'
}
    stages{
        
        stage('Build stage')
        {
            steps{
                mvn clean package
            }
        }
    }
}