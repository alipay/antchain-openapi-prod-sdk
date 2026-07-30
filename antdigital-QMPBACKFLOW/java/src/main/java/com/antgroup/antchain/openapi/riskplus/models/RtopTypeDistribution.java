// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopTypeDistribution extends TeaModel {
    // 统计值
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    @Validation(required = true)
    public Integer count;

    // 当前类型下的等级分布
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("levelDistribution")
    @Validation(required = true)
    public java.util.List<RtopLevelDistribution> levelDistribution;

    // 类型
    /**
     * <strong>example:</strong>
     * <p>MLM</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static RtopTypeDistribution build(java.util.Map<String, ?> map) throws Exception {
        RtopTypeDistribution self = new RtopTypeDistribution();
        return TeaModel.build(map, self);
    }

    public RtopTypeDistribution setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public RtopTypeDistribution setLevelDistribution(java.util.List<RtopLevelDistribution> levelDistribution) {
        this.levelDistribution = levelDistribution;
        return this;
    }
    public java.util.List<RtopLevelDistribution> getLevelDistribution() {
        return this.levelDistribution;
    }

    public RtopTypeDistribution setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
