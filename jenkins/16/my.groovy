@Library('myLibrary') _

pipeline {
    agent any
    
    stages {
        stage('Test Shared Library') {
            steps {
                helloWorld('Jenkins Students')  // Calls the function from helloWorld.groovy
            }
        }
    }
}