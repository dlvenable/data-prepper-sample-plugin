#!/bin/sh

DATA_PREPPER_JAR=${DATA_PREPPER_JAR:-../data-prepper/data-prepper-core/build/libs/data-prepper-core-1.3.0-SNAPSHOT.jar}

java -cp build/libs/data-prepper-sample-plugin-1.0-SNAPSHOT.jar:${DATA_PREPPER_JAR} com.amazon.dataprepper.DataPrepperExecute example/config/say-hello-pipeline.yaml example/config/data-prepper-config.yaml
