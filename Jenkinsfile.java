pipeline {
    agent any 
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main' // Replace with the desired branch
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install' // Replace with your build command
            }
        }
    }
}
