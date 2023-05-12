// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class ExceptionStats extends TeaModel {
    // 异常事务数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    public static ExceptionStats build(java.util.Map<String, ?> map) throws Exception {
        ExceptionStats self = new ExceptionStats();
        return TeaModel.build(map, self);
    }

    public ExceptionStats setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
