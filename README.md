`cf set-env spring-boot-cli-application  JBP_CONFIG_OPEN_JDK_JRE '{jre: { version: 17.+ }}'`


`cf push spring-boot-cli-application -p cf-springboot-postgress-0.0.1-SNAPSHOT.jar -b https://github.com/cloudfoundry/java-buildpack.git`

`cf enable-ssh spring-boot-cli-application`

`cf ssh -L 63306:postgres-fc3069c9-3af7-4c5d-82aa-359a9ea84e29.cqryblsdrbcs.us-east-1.rds.amazonaws.com:6012 spring-boot-cli-application
`
