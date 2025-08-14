// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dog.models;

import com.aliyun.tea.*;

public class InitPack extends TeaModel {
    // 2022-11-07 14:48
    /**
     * <strong>example:</strong>
     * <p>2022-11-07 14:48</p>
     */
    @NameInMap("time")
    public String time;

    // wanyi
    /**
     * <strong>example:</strong>
     * <p>wanyi</p>
     */
    @NameInMap("operator")
    public String operator;

    // 1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("count")
    public Long count;

    public static InitPack build(java.util.Map<String, ?> map) throws Exception {
        InitPack self = new InitPack();
        return TeaModel.build(map, self);
    }

    public InitPack setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public InitPack setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public InitPack setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
