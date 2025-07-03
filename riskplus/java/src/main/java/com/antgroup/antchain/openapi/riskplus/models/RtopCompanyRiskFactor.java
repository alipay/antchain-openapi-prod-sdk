// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopCompanyRiskFactor extends TeaModel {
    // 维度名称
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("name")
    public String name;

    // 维度分数
    @NameInMap("score")
    public Long score;

    public static RtopCompanyRiskFactor build(java.util.Map<String, ?> map) throws Exception {
        RtopCompanyRiskFactor self = new RtopCompanyRiskFactor();
        return TeaModel.build(map, self);
    }

    public RtopCompanyRiskFactor setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RtopCompanyRiskFactor setScore(Long score) {
        this.score = score;
        return this;
    }
    public Long getScore() {
        return this.score;
    }

}
