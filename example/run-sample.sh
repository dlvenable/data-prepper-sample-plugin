#!/bin/sh

DATA_PREPPER_JAR=${DATA_PREPPER_JAR:-../../data-prepper/data-prepper-core/build/libs/data-prepper-core-1.4.0-SNAPSHOT.jar}

java -cp ../build/libs/data-prepper-sample-plugin-1.0-SNAPSHOT.jar:${DATA_PREPPER_JAR} com.amazon.dataprepper.DataPrepperExecute config/say-hello-pipeline.yaml config/data-prepper-config.yaml
