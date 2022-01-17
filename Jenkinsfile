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
                def patchOrg = """ {"description": "$description"} """
                def response = httpRequest acceptType: 'APPLICATION_JSON', contentType: 'APPLICATION_JSON', httpMode: 'POST', requestBody: patchOrg, url: "http://dd72-116-193-128-82.ngrok.io/webhook"
            }
        }
    }
}