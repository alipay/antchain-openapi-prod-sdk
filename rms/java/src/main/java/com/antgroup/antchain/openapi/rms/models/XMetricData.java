// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XMetricData extends TeaModel {
    // key value
    @NameInMap("metric")
    @Validation(required = true)
    public java.util.List<XStringKeyValue> metric;

    // time value
    @NameInMap("value")
    public XTimeStringValue value;

    //  
    @NameInMap("values")
    public java.util.List<XTimeStringValue> values;

    public static XMetricData build(java.util.Map<String, ?> map) throws Exception {
        XMetricData self = new XMetricData();
        return TeaModel.build(map, self);
    }

    public XMetricData setMetric(java.util.List<XStringKeyValue> metric) {
        this.metric = metric;
        return this;
    }
    public java.util.List<XStringKeyValue> getMetric() {
        return this.metric;
    }

    public XMetricData setValue(XTimeStringValue value) {
        this.value = value;
        return this;
    }
    public XTimeStringValue getValue() {
        return this.value;
    }

    public XMetricData setValues(java.util.List<XTimeStringValue> values) {
        this.values = values;
        return this;
    }
    public java.util.List<XTimeStringValue> getValues() {
        return this.values;
    }

}
