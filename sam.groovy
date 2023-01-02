def call(String stageName){
    if ("${stageName}"  ==  "Build")
    {
        sh "mvn clean package"
    }
else if ("${stageName}"  == "SonarQube Report")
    {
        sh "echo 'Runnning code Quality Report analysis' "
        sh "mvn sonar:sonar"
    }
else if ("${stageName}"  == "Uploard artifacts")
    {
        sh "echo ' uploading artifacts into Nexus' "
        sh "mvn deploy"
    }
}
