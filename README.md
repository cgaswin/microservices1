## The open feign client used here uses spring cloud openfeign which provides integrations for Spring Boot apps through autoconfiguration and binding to the Spring Environment and other Spring programming model idioms.


## Sleuth: (Now moved to micrometer tracing, sleuth not supported in spring boot 3)

### **Application name** – This is the name we set in the properties file, and can be used to aggregate logs from multiple instances of the same application.

### **TraceId** – This is an id that’s assigned to a single request, job, or action. Something like each unique user initiated web request will have its own traceId.

### **SpanId** – Tracks a unit of work. Think of a request that consists of multiple steps. Each step could have its own spanId and be tracked individually. By default, any application flow will start with the same TraceId and SpanId.

### **Export** – This property is a boolean that indicates whether or not this log was exported to an aggregator like Zipkin. Zipkin is beyond the scope of this article, but plays an important role in analyzing logs created by Sleuth.
