// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commerce.models;

import com.aliyun.tea.*;

public class AmortizationInfo extends TeaModel {
    // 摊销类型
    /**
     * <strong>example:</strong>
     * <p>CYCLE_BY_PERIOD</p>
     */
    @NameInMap("amortization_type")
    @Validation(required = true)
    public String amortizationType;

    // 开始时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 结束时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    public static AmortizationInfo build(java.util.Map<String, ?> map) throws Exception {
        AmortizationInfo self = new AmortizationInfo();
        return TeaModel.build(map, self);
    }

    public AmortizationInfo setAmortizationType(String amortizationType) {
        this.amortizationType = amortizationType;
        return this;
    }
    public String getAmortizationType() {
        return this.amortizationType;
    }

    public AmortizationInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AmortizationInfo setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
