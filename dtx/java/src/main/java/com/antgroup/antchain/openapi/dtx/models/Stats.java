// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class Stats extends TeaModel {
    // 异常事务数
    @NameInMap("exception")
    @Validation(required = true)
    public ExceptionStats exception;

    // 进行中事务数统计
    @NameInMap("ongoing")
    @Validation(required = true)
    public Ongoing ongoing;

    // 当天事务数统计
    @NameInMap("today")
    @Validation(required = true)
    public Today today;

    public static Stats build(java.util.Map<String, ?> map) throws Exception {
        Stats self = new Stats();
        return TeaModel.build(map, self);
    }

    public Stats setException(ExceptionStats exception) {
        this.exception = exception;
        return this;
    }
    public ExceptionStats getException() {
        return this.exception;
    }

    public Stats setOngoing(Ongoing ongoing) {
        this.ongoing = ongoing;
        return this;
    }
    public Ongoing getOngoing() {
        return this.ongoing;
    }

    public Stats setToday(Today today) {
        this.today = today;
        return this;
    }
    public Today getToday() {
        return this.today;
    }

}
