// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopPopulationDistribution extends TeaModel {
    // 市
    /**
     * <strong>example:</strong>
     * <p>杭州市</p>
     */
    @NameInMap("city")
    @Validation(required = true)
    public String city;

    // 统计值
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    @Validation(required = true)
    public Integer count;

    public static RtopPopulationDistribution build(java.util.Map<String, ?> map) throws Exception {
        RtopPopulationDistribution self = new RtopPopulationDistribution();
        return TeaModel.build(map, self);
    }

    public RtopPopulationDistribution setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public RtopPopulationDistribution setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

}
