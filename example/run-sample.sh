#!/bin/sh

DATA_PREPPER_ARCHIVE=${DATA_PREPPER_ARCHIVE:-../data-prepper/release/archives/linux/build/distributions/opensearch-data-prepper-2.5.0-SNAPSHOT-linux-x64.tar.gz}

archive_directory=`realpath "$DATA_PREPPER_ARCHIVE"`

pushd example

tar xzf $archive_directory

cp config/say-hello-pipeline.yaml opensearch-data-prepper-2.5.0-SNAPSHOT-linux-x64/pipelines/
cp config/data-prepper-config.yaml opensearch-data-prepper-2.5.0-SNAPSHOT-linux-x64/config/
cp ../build/libs/data-prepper-sample-plugin-1.0-SNAPSHOT.jar opensearch-data-prepper-2.5.0-SNAPSHOT-linux-x64/lib/

popd

./example/opensearch-data-prepper-2.5.0-SNAPSHOT-linux-x64/bin/data-prepper
