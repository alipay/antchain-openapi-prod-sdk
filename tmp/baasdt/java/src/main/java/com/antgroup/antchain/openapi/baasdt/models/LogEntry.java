// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class LogEntry extends TeaModel {
    // 交易发起方
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // log信息
    @NameInMap("log_data")
    @Validation(required = true)
    public String logData;

    // 交易接受方
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    // 交易topic
    @NameInMap("topics")
    @Validation(required = true)
    public java.util.List<String> topics;

    public static LogEntry build(java.util.Map<String, ?> map) throws Exception {
        LogEntry self = new LogEntry();
        return TeaModel.build(map, self);
    }

    public LogEntry setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public LogEntry setLogData(String logData) {
        this.logData = logData;
        return this;
    }
    public String getLogData() {
        return this.logData;
    }

    public LogEntry setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public LogEntry setTopics(java.util.List<String> topics) {
        this.topics = topics;
        return this;
    }
    public java.util.List<String> getTopics() {
        return this.topics;
    }

}
