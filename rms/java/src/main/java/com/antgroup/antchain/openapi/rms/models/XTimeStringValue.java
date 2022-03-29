// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XTimeStringValue extends TeaModel {
    // unix timestamp (s)
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // double string
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static XTimeStringValue build(java.util.Map<String, ?> map) throws Exception {
        XTimeStringValue self = new XTimeStringValue();
        return TeaModel.build(map, self);
    }

    public XTimeStringValue setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public XTimeStringValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
