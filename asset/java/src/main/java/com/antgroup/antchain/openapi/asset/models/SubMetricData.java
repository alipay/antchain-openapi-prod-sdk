// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class SubMetricData extends TeaModel {
    // 日期
    @NameInMap("date")
    @Validation(required = true)
    public String date;

    // 指标类型:OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT,OPERATING_COST, GROSS_PROFIT_MARGIN,VOUCHER_CONVERSION, USER_CONVERSION
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 指标值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static SubMetricData build(java.util.Map<String, ?> map) throws Exception {
        SubMetricData self = new SubMetricData();
        return TeaModel.build(map, self);
    }

    public SubMetricData setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public SubMetricData setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SubMetricData setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
