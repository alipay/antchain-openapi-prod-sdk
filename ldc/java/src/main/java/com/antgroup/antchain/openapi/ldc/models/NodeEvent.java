// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class NodeEvent extends TeaModel {
    // event count
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    // event message
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // event modified time
    @NameInMap("modified_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String modifiedTime;

    // event reason
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    // event type
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static NodeEvent build(java.util.Map<String, ?> map) throws Exception {
        NodeEvent self = new NodeEvent();
        return TeaModel.build(map, self);
    }

    public NodeEvent setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public NodeEvent setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public NodeEvent setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public NodeEvent setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public NodeEvent setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
