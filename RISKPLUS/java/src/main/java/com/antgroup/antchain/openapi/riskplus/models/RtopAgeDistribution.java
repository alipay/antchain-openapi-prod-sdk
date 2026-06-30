// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopAgeDistribution extends TeaModel {
    // 年龄
    /**
     * <strong>example:</strong>
     * <p>above20</p>
     */
    @NameInMap("age")
    @Validation(required = true)
    public String age;

    // 统计值
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    @Validation(required = true)
    public Integer count;

    public static RtopAgeDistribution build(java.util.Map<String, ?> map) throws Exception {
        RtopAgeDistribution self = new RtopAgeDistribution();
        return TeaModel.build(map, self);
    }

    public RtopAgeDistribution setAge(String age) {
        this.age = age;
        return this;
    }
    public String getAge() {
        return this.age;
    }

    public RtopAgeDistribution setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

}
