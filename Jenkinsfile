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
                bat 'mvn clean package'
            }
        }
    }
}
