// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class BizNoCondition extends TeaModel {
    // 枚举
    // CITY 城市
    // BLOCK 区县
    // AGE 年龄
    /**
     * <strong>example:</strong>
     * <p>100010</p>
     */
    @NameInMap("dimension")
    @Validation(required = true)
    public String dimension;

    // 枚举范围，每个维度的值是或的关系,需要校验场景和取值范围是否匹配
    // CITY:区划码
    // BLOCK:区划码（底包暂不支持）
    // AGE:30+、40+、50+（底包暂不支持
    /**
     * <strong>example:</strong>
     * <p>[&quot;100010&quot;,&quot;100011&quot;,&quot;100020&quot;]</p>
     */
    @NameInMap("value_scope")
    @Validation(required = true)
    public java.util.List<String> valueScope;

    public static BizNoCondition build(java.util.Map<String, ?> map) throws Exception {
        BizNoCondition self = new BizNoCondition();
        return TeaModel.build(map, self);
    }

    public BizNoCondition setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public BizNoCondition setValueScope(java.util.List<String> valueScope) {
        this.valueScope = valueScope;
        return this;
    }
    public java.util.List<String> getValueScope() {
        return this.valueScope;
    }

}
