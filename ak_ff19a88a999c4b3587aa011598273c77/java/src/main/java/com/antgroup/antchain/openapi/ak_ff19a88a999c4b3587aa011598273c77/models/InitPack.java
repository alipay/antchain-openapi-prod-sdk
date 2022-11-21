// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ff19a88a999c4b3587aa011598273c77.models;

import com.aliyun.tea.*;

public class InitPack extends TeaModel {
    // 返回接收到请求的当前时间
    @NameInMap("time")
    @Validation(required = true)
    public String time;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 请求编号
    @NameInMap("count")
    @Validation(required = true)
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
