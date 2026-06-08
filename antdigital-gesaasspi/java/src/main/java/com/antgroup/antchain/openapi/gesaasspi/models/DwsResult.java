// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaasspi.models;

import com.aliyun.tea.*;

public class DwsResult extends TeaModel {
    // 维度列表
    @NameInMap("dimension_list")
    @Validation(required = true)
    public java.util.List<Dimension> dimensionList;

    // 度量列表
    @NameInMap("metric_list")
    @Validation(required = true)
    public java.util.List<RultMetric> metricList;

    public static DwsResult build(java.util.Map<String, ?> map) throws Exception {
        DwsResult self = new DwsResult();
        return TeaModel.build(map, self);
    }

    public DwsResult setDimensionList(java.util.List<Dimension> dimensionList) {
        this.dimensionList = dimensionList;
        return this;
    }
    public java.util.List<Dimension> getDimensionList() {
        return this.dimensionList;
    }

    public DwsResult setMetricList(java.util.List<RultMetric> metricList) {
        this.metricList = metricList;
        return this;
    }
    public java.util.List<RultMetric> getMetricList() {
        return this.metricList;
    }

}
