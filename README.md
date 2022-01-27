# Data Prepper Sample Plugin

This project is a sample plugin for Data Prepper.

## Setup

Set the directory for your Data Prepper jar:

For example:

```
 export DATA_PREPPER_JAR=/Users/myuser/Documents/data-prepper/data-prepper-core/build/libs/data-prepper-core-1.3.0-SNAPSHOT.jar
```

## Build & Run

```
./gradlew assemble
```

```
cd example
./run-sample.sh
```

You should see event lines which look like:

```
{"message":"1564de58-a3b3-452f-8131-fb8b4a53a4ee","hello":"world"}
{"message":"52436e2e-f6c4-4547-9041-d97cbdeca58d","hello":"world"}
{"message":"bb5a7ea4-8e12-4c0c-b328-72fc1812c656","hello":"world"}
```

