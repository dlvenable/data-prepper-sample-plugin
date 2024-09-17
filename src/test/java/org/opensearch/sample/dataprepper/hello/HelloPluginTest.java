package org.opensearch.sample.dataprepper.hello;

import org.junit.jupiter.api.Test;
import org.opensearch.dataprepper.model.event.Event;
import org.opensearch.dataprepper.model.record.Record;

import java.util.Collection;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class HelloPluginTest {
    private HelloPlugin createObjectUnderTest() {
        return new HelloPlugin();
    }

    @Test
    void execute_adds_hello_world_to_single_Event() {
        final HelloPlugin objectUnderTest = createObjectUnderTest();
        final Record<Event> record = mock(Record.class);
        final Event event = mock(Event.class);
        when(record.getData()).thenReturn(event);

        final Collection<Record<Event>> records = objectUnderTest.execute(Collections.singletonList(record));

        assertThat(records.size(), equalTo(1));
        verify(event).put("hello", "world");
    }
}