pipeline {
	agent any
		stages{
			stage('first stage is printing the ip'){
								steps{
								      sh '''
								      myip="$(dig +short myip.opendns.com @resolver1.opendns.com)"
 								      echo "My WAN/Public IP address: ${myip}"
								      '''
								     }
              							}                      
                     }
			stage('first stage is printing the ip'){
								steps{
								      sh '''
                                                                      myip="$(ps)"
                                                                      echo "process: ${myip}"
                                                                      '''
							         	}
								}		 

	}

