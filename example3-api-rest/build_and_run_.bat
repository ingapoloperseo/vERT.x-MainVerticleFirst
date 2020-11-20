SET JMX_OPTIONS="-Dcom.sun.management.jmxremote=true -Dcom.sun.management.jmxremote.port=7778 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Djava.rmi.server.hostname=paradigma.cursovertx "
mvn clean package -DskipTests 
java %JMX_OPTIONS% -Dvertx.logger-delegate-factory-class-name=io.vertx.core.logging.SLF4JLogDelegateFactory -Dhazelcast.logging.type=slf4j -Dvertx.options.blockedThreadCheckInterval=1000000 -jar target/example3-api-rest-fat.jar -conf src/config/config.json
