// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopGenderDistribution extends TeaModel {
    // 统计值
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    @Validation(required = true)
    public Integer count;

    // 性别
    /**
     * <strong>example:</strong>
     * <p>MALE</p>
     */
    @NameInMap("gender")
    @Validation(required = true)
    public String gender;

    public static RtopGenderDistribution build(java.util.Map<String, ?> map) throws Exception {
        RtopGenderDistribution self = new RtopGenderDistribution();
        return TeaModel.build(map, self);
    }

    public RtopGenderDistribution setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public RtopGenderDistribution setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

}
