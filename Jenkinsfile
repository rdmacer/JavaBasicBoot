pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean compile' 
            }
        }
        stage('Intregration Test') {
            steps {
                echo 'Testing..'
                sh 'mvn clean test'
                sh 'mvn clean test -Dtest=JavaBasicBoot#test_1'
            }
        }
    }
}
