package org.opensearch.sample.dataprepper.hello;

import org.opensearch.dataprepper.model.annotations.DataPrepperPlugin;
import org.opensearch.dataprepper.model.event.Event;
import org.opensearch.dataprepper.model.processor.Processor;
import org.opensearch.dataprepper.model.record.Record;

import java.util.Collection;

/**
 * This sample plugin adds a field named 'hello' with a value of 'world'
 * to each Event.
 */
@DataPrepperPlugin(name = "hello", pluginType = Processor.class)
public class HelloPlugin implements Processor<Record<Event>, Record<Event>> {

    @Override
    public Collection<Record<Event>> execute(final Collection<Record<Event>> collection) {
        collection
                .stream()
                .map(Record::getData)
                .forEach(event -> event.put("hello", "world"));

        return collection;
    }

    @Override
    public void prepareForShutdown() {

    }

    @Override
    public boolean isReadyForShutdown() {
        return true;
    }

    @Override
    public void shutdown() {

    }
}
