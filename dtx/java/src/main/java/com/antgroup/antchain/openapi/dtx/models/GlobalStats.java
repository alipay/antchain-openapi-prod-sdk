// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class GlobalStats extends TeaModel {
    // 异常事务数
    @NameInMap("exception")
    @Validation(required = true)
    public Long exception;

    // 进行中事务数
    @NameInMap("activity")
    @Validation(required = true)
    public Long activity;

    // 当天事务数
    @NameInMap("today")
    @Validation(required = true)
    public Long today;

    // connection
    @NameInMap("connection")
    public Long connection;

    public static GlobalStats build(java.util.Map<String, ?> map) throws Exception {
        GlobalStats self = new GlobalStats();
        return TeaModel.build(map, self);
    }

    public GlobalStats setException(Long exception) {
        this.exception = exception;
        return this;
    }
    public Long getException() {
        return this.exception;
    }

    public GlobalStats setActivity(Long activity) {
        this.activity = activity;
        return this;
    }
    public Long getActivity() {
        return this.activity;
    }

    public GlobalStats setToday(Long today) {
        this.today = today;
        return this;
    }
    public Long getToday() {
        return this.today;
    }

    public GlobalStats setConnection(Long connection) {
        this.connection = connection;
        return this;
    }
    public Long getConnection() {
        return this.connection;
    }

}
