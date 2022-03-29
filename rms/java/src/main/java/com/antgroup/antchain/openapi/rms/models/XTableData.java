// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XTableData extends TeaModel {
    //  
    @NameInMap("tags")
    public java.util.List<XStringKeyValue> tags;

    //  
    @NameInMap("metric_values")
    public java.util.List<XTimeMetricsValue> metricValues;

    public static XTableData build(java.util.Map<String, ?> map) throws Exception {
        XTableData self = new XTableData();
        return TeaModel.build(map, self);
    }

    public XTableData setTags(java.util.List<XStringKeyValue> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<XStringKeyValue> getTags() {
        return this.tags;
    }

    public XTableData setMetricValues(java.util.List<XTimeMetricsValue> metricValues) {
        this.metricValues = metricValues;
        return this;
    }
    public java.util.List<XTimeMetricsValue> getMetricValues() {
        return this.metricValues;
    }

}
