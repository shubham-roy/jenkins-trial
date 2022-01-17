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
                curl -X POST -F 'name=linuxize' -F 'email=linuxize@example.com' http://dd72-116-193-128-82.ngrok.io/webhook
            }
        }
    }
}