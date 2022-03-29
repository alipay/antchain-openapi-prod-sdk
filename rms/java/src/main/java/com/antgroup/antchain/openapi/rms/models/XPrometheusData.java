// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XPrometheusData extends TeaModel {
    //  
    @NameInMap("metrics")
    public java.util.List<XExpression> metrics;

    //  
    @NameInMap("query")
    public XPrometheusQuery query;

    public static XPrometheusData build(java.util.Map<String, ?> map) throws Exception {
        XPrometheusData self = new XPrometheusData();
        return TeaModel.build(map, self);
    }

    public XPrometheusData setMetrics(java.util.List<XExpression> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<XExpression> getMetrics() {
        return this.metrics;
    }

    public XPrometheusData setQuery(XPrometheusQuery query) {
        this.query = query;
        return this;
    }
    public XPrometheusQuery getQuery() {
        return this.query;
    }

}
