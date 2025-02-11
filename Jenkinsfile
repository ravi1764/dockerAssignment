pipeline {
    agent any
    tools {
        maven "wsl_maven"
    }
 
    stages {        
        stage('Build') {
            steps {
                echo "building JAR"
                sh "mvn clean package"
            }
        }
        stage('Unit tests'){
            steps{
                echo "Running unit tests"
                sh "mvn test"
            }
        }
 
        stage('Create Docker image'){
          steps{
            echo "Creating Docker image"
            sh "sudo docker build -t docker_Assignment_deploy ."
          }
        }
 
        stage('Deploy'){
          steps{
            // Push Docker image to Docker registry. For now, skipping.
 
            // Run the image. NOTE: mysql container should be running.
                  // before running, stop and remove the previously started container for this application.
                  sh 'sudo docker stop docker_Assignment_deploy || true'
                  sh 'sudo docker rm docker_Assignment_deploy || true'
            sh "sudo docker run --name docker_Assignment_deploy -d -p 9291:9291 docker_Assignment_deploy"
            echo "deployed successfully"
          }
        }
    }
}
