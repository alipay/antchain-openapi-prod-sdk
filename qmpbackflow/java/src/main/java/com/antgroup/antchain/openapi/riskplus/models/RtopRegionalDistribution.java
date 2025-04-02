// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopRegionalDistribution extends TeaModel {
    // 统计值
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    // 地区
    @NameInMap("place")
    @Validation(required = true)
    public String place;

    // 当前地区的涉众风险类型分布，即非法集资有多少企业，传销有多少企业
    @NameInMap("type_distribution")
    public java.util.List<RtopTypeDistribution> typeDistribution;

    public static RtopRegionalDistribution build(java.util.Map<String, ?> map) throws Exception {
        RtopRegionalDistribution self = new RtopRegionalDistribution();
        return TeaModel.build(map, self);
    }

    public RtopRegionalDistribution setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public RtopRegionalDistribution setPlace(String place) {
        this.place = place;
        return this;
    }
    public String getPlace() {
        return this.place;
    }

    public RtopRegionalDistribution setTypeDistribution(java.util.List<RtopTypeDistribution> typeDistribution) {
        this.typeDistribution = typeDistribution;
        return this;
    }
    public java.util.List<RtopTypeDistribution> getTypeDistribution() {
        return this.typeDistribution;
    }

}
