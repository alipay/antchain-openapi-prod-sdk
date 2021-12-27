// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopLevelDistribution extends TeaModel {
    // 统计值
    @NameInMap("count")
    @Validation(required = true)
    public Integer count;

    // 等级
    @NameInMap("level")
    @Validation(required = true)
    public String level;

    public static RtopLevelDistribution build(java.util.Map<String, ?> map) throws Exception {
        RtopLevelDistribution self = new RtopLevelDistribution();
        return TeaModel.build(map, self);
    }

    public RtopLevelDistribution setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public RtopLevelDistribution setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

}
