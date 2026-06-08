// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaasspi.models;

import com.aliyun.tea.*;

public class Metric extends TeaModel {
    // 度量编码
    /**
     * <strong>example:</strong>
     * <p>ori_use_amount</p>
     */
    @NameInMap("metric_code")
    @Validation(required = true)
    public String metricCode;

    // 计算列
    /**
     * <strong>example:</strong>
     * <p>ori_use_amount</p>
     */
    @NameInMap("metric_column")
    @Validation(required = true)
    public String metricColumn;

    // 计算方式
    /**
     * <strong>example:</strong>
     * <p>SUM</p>
     */
    @NameInMap("function_type")
    public String functionType;

    public static Metric build(java.util.Map<String, ?> map) throws Exception {
        Metric self = new Metric();
        return TeaModel.build(map, self);
    }

    public Metric setMetricCode(String metricCode) {
        this.metricCode = metricCode;
        return this;
    }
    public String getMetricCode() {
        return this.metricCode;
    }

    public Metric setMetricColumn(String metricColumn) {
        this.metricColumn = metricColumn;
        return this;
    }
    public String getMetricColumn() {
        return this.metricColumn;
    }

    public Metric setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

}
