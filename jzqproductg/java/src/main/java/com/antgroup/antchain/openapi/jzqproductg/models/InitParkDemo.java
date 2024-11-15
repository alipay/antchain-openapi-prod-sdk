// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.jzqproductg.models;

import com.aliyun.tea.*;

public class InitParkDemo extends TeaModel {
    // 时间
    @NameInMap("time")
    @Validation(required = true)
    public String time;

    // 请求人
    @NameInMap("operate")
    @Validation(required = true)
    public String operate;

    // 请求编号
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    public static InitParkDemo build(java.util.Map<String, ?> map) throws Exception {
        InitParkDemo self = new InitParkDemo();
        return TeaModel.build(map, self);
    }

    public InitParkDemo setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public InitParkDemo setOperate(String operate) {
        this.operate = operate;
        return this;
    }
    public String getOperate() {
        return this.operate;
    }

    public InitParkDemo setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
