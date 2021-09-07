// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DailyEmissions extends TeaModel {
    // 日期
    @NameInMap("date")
    @Validation(required = true)
    public String date;

    // 排放量值
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    public static DailyEmissions build(java.util.Map<String, ?> map) throws Exception {
        DailyEmissions self = new DailyEmissions();
        return TeaModel.build(map, self);
    }

    public DailyEmissions setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public DailyEmissions setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

}
