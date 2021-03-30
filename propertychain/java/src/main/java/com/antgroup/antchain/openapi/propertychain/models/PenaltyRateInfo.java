// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class PenaltyRateInfo extends TeaModel {
    // 罚息
    @NameInMap("rate")
    @Validation(required = true)
    public String rate;

    // 起始-天
    @NameInMap("start_day")
    @Validation(required = true)
    public Long startDay;

    // 终止-天
    @NameInMap("end_day")
    @Validation(required = true)
    public Long endDay;

    public static PenaltyRateInfo build(java.util.Map<String, ?> map) throws Exception {
        PenaltyRateInfo self = new PenaltyRateInfo();
        return TeaModel.build(map, self);
    }

    public PenaltyRateInfo setRate(String rate) {
        this.rate = rate;
        return this;
    }
    public String getRate() {
        return this.rate;
    }

    public PenaltyRateInfo setStartDay(Long startDay) {
        this.startDay = startDay;
        return this;
    }
    public Long getStartDay() {
        return this.startDay;
    }

    public PenaltyRateInfo setEndDay(Long endDay) {
        this.endDay = endDay;
        return this;
    }
    public Long getEndDay() {
        return this.endDay;
    }

}
