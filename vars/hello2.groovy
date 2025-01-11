def call(Map config = [:]) {
  sh "echo Hello ${config.firstname} ${config.middlename} ${config.lastname}"
}
