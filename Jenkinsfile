pipeline
{
    
    agent any

    tools {
  jdk 'jdk-21'
}

    
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
