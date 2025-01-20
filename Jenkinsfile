pipeline {
    agent any 
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/BIKRAM-ADAK/new2.git', git branch: 'feature1' 
            }
        }
        stage('Build') {
            steps {
                sh 'javac Sample.java'
            }
        }
        stage('Test') {
            steps {
                sh 'java Sample'
            }
        }
    }
}
