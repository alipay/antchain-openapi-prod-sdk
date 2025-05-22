// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class InitParks extends TeaModel {
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

    public static InitParks build(java.util.Map<String, ?> map) throws Exception {
        InitParks self = new InitParks();
        return TeaModel.build(map, self);
    }

    public InitParks setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public InitParks setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public InitParks setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
