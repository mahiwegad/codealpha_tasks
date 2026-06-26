pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking source code'
            }
        }

        stage('Build') {
            steps {
                echo 'Building Java application using Gradle'
                bat 'gradlew clean build'
            }
        }

        stage('Run Application') {
            steps {
                echo 'Running Java application'
                bat 'gradlew :app:run'
            }
        }

        stage('Test') {
            steps {
                echo 'Executing tests'
                bat 'gradlew test'
            }
        }
    }

    post {

        success {
            echo 'CI/CD Pipeline completed successfully'
        }

        failure {
            echo 'Pipeline failed'
        }
    }
}