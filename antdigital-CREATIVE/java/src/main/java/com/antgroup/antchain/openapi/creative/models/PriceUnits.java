// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class PriceUnits extends TeaModel {
    // 当前输出单元定价维度
    /**
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:&quot;1&quot;}</p>
     */
    @NameInMap("dimensions")
    public String dimensions;

    // 当前输出单元计量指标
    /**
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:&quot;1&quot;}</p>
     */
    @NameInMap("metrics")
    public String metrics;

    public static PriceUnits build(java.util.Map<String, ?> map) throws Exception {
        PriceUnits self = new PriceUnits();
        return TeaModel.build(map, self);
    }

    public PriceUnits setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public PriceUnits setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

}
