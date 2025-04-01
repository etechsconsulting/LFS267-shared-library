#vars/postBuildSuccess.groovy

def call(Map config = [:] {
    archiveArtifacts 'target/*.jar'
  stash(name: "${config.stastName}", includes: 'target/**')
}
