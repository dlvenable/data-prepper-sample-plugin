package org.opensearch.sample.dataprepper.hello;

import org.opensearch.dataprepper.model.processor.Processor;
import org.opensearch.dataprepper.test.plugins.DataPrepperPluginTest;
import org.opensearch.dataprepper.test.plugins.junit.BaseDataPrepperPluginStandardTestSuite;

@DataPrepperPluginTest(pluginName = "hello", pluginType = Processor.class)
class HelloPlugin_AutoTest extends BaseDataPrepperPluginStandardTestSuite {

}
