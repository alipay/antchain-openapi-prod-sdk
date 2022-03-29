// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XTimeMetricsValue extends TeaModel {
    //  
    @NameInMap("values")
    @Validation(required = true)
    public java.util.List<XStringKeyValue> values;

    //  
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    public static XTimeMetricsValue build(java.util.Map<String, ?> map) throws Exception {
        XTimeMetricsValue self = new XTimeMetricsValue();
        return TeaModel.build(map, self);
    }

    public XTimeMetricsValue setValues(java.util.List<XStringKeyValue> values) {
        this.values = values;
        return this;
    }
    public java.util.List<XStringKeyValue> getValues() {
        return this.values;
    }

    public XTimeMetricsValue setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
