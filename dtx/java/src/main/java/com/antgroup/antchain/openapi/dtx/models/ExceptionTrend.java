// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class ExceptionTrend extends TeaModel {
    // 时间点
    @NameInMap("time")
    @Validation(required = true)
    public Long time;

    // 异常事务数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    public static ExceptionTrend build(java.util.Map<String, ?> map) throws Exception {
        ExceptionTrend self = new ExceptionTrend();
        return TeaModel.build(map, self);
    }

    public ExceptionTrend setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public ExceptionTrend setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
