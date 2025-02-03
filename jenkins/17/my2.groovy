@Library('myLibrary') _ // Load the shared library called 'myLibrary2'

pipeline {
    agent any // Use any available agent for the build
    
    stages {
        stage('Use Advanced Function') {
            steps {
                // Call the printMessage function with parameters
                script {
                    printMessage('Hello from Advanced Shared Library!', 3)
                }
            }
        }
    }
}