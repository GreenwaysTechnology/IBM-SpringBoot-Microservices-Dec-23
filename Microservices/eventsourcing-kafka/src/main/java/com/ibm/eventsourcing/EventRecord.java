package com.ibm.eventsourcing;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class EventRecord {
    private long eventId;
    private String eventType;
    private String entityId;
    private String eventData;
    private LocalDateTime eventTime;
}
