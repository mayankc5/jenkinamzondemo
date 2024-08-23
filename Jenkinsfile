pipeline
{
    
    agent any    
   tools {
    jdk 'jdk-21'
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
