// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class ProcessConversionMetricData extends TeaModel {
    // 发放数
    @NameInMap("send")
    @Validation(required = true)
    public Long send;

    // 核销数
    @NameInMap("used")
    @Validation(required = true)
    public Long used;

    // 核销转化率
    @NameInMap("rate")
    @Validation(required = true)
    public String rate;

    public static ProcessConversionMetricData build(java.util.Map<String, ?> map) throws Exception {
        ProcessConversionMetricData self = new ProcessConversionMetricData();
        return TeaModel.build(map, self);
    }

    public ProcessConversionMetricData setSend(Long send) {
        this.send = send;
        return this;
    }
    public Long getSend() {
        return this.send;
    }

    public ProcessConversionMetricData setUsed(Long used) {
        this.used = used;
        return this;
    }
    public Long getUsed() {
        return this.used;
    }

    public ProcessConversionMetricData setRate(String rate) {
        this.rate = rate;
        return this;
    }
    public String getRate() {
        return this.rate;
    }

}
