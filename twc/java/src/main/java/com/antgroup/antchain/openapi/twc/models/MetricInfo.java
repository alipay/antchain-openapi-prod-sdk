// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class MetricInfo extends TeaModel {
    // 实际计收金额，单位：分。如传100，即为100分，1元
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("collect_amount")
    @Validation(required = true)
    public Long collectAmount;

    // 计收受理时间
    /**
     * <strong>example:</strong>
     * <p>2022-04-15 17:05:37</p>
     */
    @NameInMap("collect_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String collectTime;

    // 计收的订单流水号
    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("collect_serial_number")
    @Validation(required = true)
    public String collectSerialNumber;

    public static MetricInfo build(java.util.Map<String, ?> map) throws Exception {
        MetricInfo self = new MetricInfo();
        return TeaModel.build(map, self);
    }

    public MetricInfo setCollectAmount(Long collectAmount) {
        this.collectAmount = collectAmount;
        return this;
    }
    public Long getCollectAmount() {
        return this.collectAmount;
    }

    public MetricInfo setCollectTime(String collectTime) {
        this.collectTime = collectTime;
        return this;
    }
    public String getCollectTime() {
        return this.collectTime;
    }

    public MetricInfo setCollectSerialNumber(String collectSerialNumber) {
        this.collectSerialNumber = collectSerialNumber;
        return this;
    }
    public String getCollectSerialNumber() {
        return this.collectSerialNumber;
    }

}
