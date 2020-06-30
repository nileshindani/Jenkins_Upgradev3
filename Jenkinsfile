pipeline {
      agent any
      stages {
            stage('Init') {
                  steps {
                        echo 'Hi, this is Nilesh from LevelUp360'
                        echo 'We are Starting the Testing'
                  }
            }
            stage('Build') {
                  steps {
                        echo 'Building Sample Maven Project'
						archiveArtifacts artifacts: '**/*.war'
                  }
            }
            stage('Deploy') {
                  steps {
                        echo "Deploying in Staging Area"
						build job: 'Deploy_Application_Staging'
                  }
            }
            stage('Deploy Production') {
                  steps {
                        echo "Deploying in Production Area"
			
						build job: 'Deploy_Application_Prod'
                  }
            }
      }
}