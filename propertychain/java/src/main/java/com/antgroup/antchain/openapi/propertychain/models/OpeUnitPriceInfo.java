// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class OpeUnitPriceInfo extends TeaModel {
    // 操作费单价 （分）
    @NameInMap("unit_price")
    @Validation(required = true)
    public Long unitPrice;

    // 起始-天 （-999 表示无日期限制）
    @NameInMap("start_day")
    @Validation(required = true)
    public Long startDay;

    // 终止-天 （-999 表示无日期限制）
    @NameInMap("end_day")
    @Validation(required = true)
    public Long endDay;

    public static OpeUnitPriceInfo build(java.util.Map<String, ?> map) throws Exception {
        OpeUnitPriceInfo self = new OpeUnitPriceInfo();
        return TeaModel.build(map, self);
    }

    public OpeUnitPriceInfo setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }
    public Long getUnitPrice() {
        return this.unitPrice;
    }

    public OpeUnitPriceInfo setStartDay(Long startDay) {
        this.startDay = startDay;
        return this;
    }
    public Long getStartDay() {
        return this.startDay;
    }

    public OpeUnitPriceInfo setEndDay(Long endDay) {
        this.endDay = endDay;
        return this;
    }
    public Long getEndDay() {
        return this.endDay;
    }

}
