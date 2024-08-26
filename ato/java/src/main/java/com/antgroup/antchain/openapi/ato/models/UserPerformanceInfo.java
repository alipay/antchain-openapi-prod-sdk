// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UserPerformanceInfo extends TeaModel {
    // 履约期数
    @NameInMap("period_num")
    @Validation(required = true)
    public Long periodNum;

    // 履约时间，格式 yyyy-MM-dd
    // 针对签收日作为起租日模式,未签收时：以签收日开始计算
    @NameInMap("pay_date")
    @Validation(required = true)
    public String payDate;

    // 履约金额，单位为分
    @NameInMap("pay_money")
    @Validation(required = true)
    public Long payMoney;

    public static UserPerformanceInfo build(java.util.Map<String, ?> map) throws Exception {
        UserPerformanceInfo self = new UserPerformanceInfo();
        return TeaModel.build(map, self);
    }

    public UserPerformanceInfo setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public UserPerformanceInfo setPayDate(String payDate) {
        this.payDate = payDate;
        return this;
    }
    public String getPayDate() {
        return this.payDate;
    }

    public UserPerformanceInfo setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
        return this;
    }
    public Long getPayMoney() {
        return this.payMoney;
    }

}
