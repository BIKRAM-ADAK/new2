pipeline {
    agent any 
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/BIKRAM-ADAK/new2.git', branch: 'feature1'
            }
        }
        stage('Build') {
            steps {
                try {
                    sh 'javac Sample.java'
                } catch (Exception e) {
                    currentBuild.result = 'FAILED'
                    echo "Compilation failed: ${e.message}"
                }
            }
        }
        stage('Test') {
            steps {
                try {
                    sh 'java Sample'
                } catch (Exception e) {
                    currentBuild.result = 'FAILED'
                    echo "Execution failed: ${e.message}"
                }
            }
        }
    }
}
