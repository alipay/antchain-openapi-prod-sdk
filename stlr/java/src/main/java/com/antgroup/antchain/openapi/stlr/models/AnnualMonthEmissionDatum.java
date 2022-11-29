// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AnnualMonthEmissionDatum extends TeaModel {
    // 统计的年份
    @NameInMap("year")
    @Validation(required = true)
    public String year;

    // 统计的月份
    @NameInMap("month")
    @Validation(required = true)
    public String month;

    // 统计排放量
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static AnnualMonthEmissionDatum build(java.util.Map<String, ?> map) throws Exception {
        AnnualMonthEmissionDatum self = new AnnualMonthEmissionDatum();
        return TeaModel.build(map, self);
    }

    public AnnualMonthEmissionDatum setYear(String year) {
        this.year = year;
        return this;
    }
    public String getYear() {
        return this.year;
    }

    public AnnualMonthEmissionDatum setMonth(String month) {
        this.month = month;
        return this;
    }
    public String getMonth() {
        return this.month;
    }

    public AnnualMonthEmissionDatum setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
