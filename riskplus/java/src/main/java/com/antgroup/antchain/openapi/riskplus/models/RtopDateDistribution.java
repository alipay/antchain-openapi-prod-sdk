// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopDateDistribution extends TeaModel {
    // 统计值
    @NameInMap("count")
    @Validation(required = true)
    public Integer count;

    // 年龄
    @NameInMap("date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String date;

    public static RtopDateDistribution build(java.util.Map<String, ?> map) throws Exception {
        RtopDateDistribution self = new RtopDateDistribution();
        return TeaModel.build(map, self);
    }

    public RtopDateDistribution setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public RtopDateDistribution setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
