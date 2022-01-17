pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('WebHooking') {
            steps {
                sh 'curl -X POST  http://dd72-116-193-128-82.ngrok.io/webhook'
            }
        }
    }
}