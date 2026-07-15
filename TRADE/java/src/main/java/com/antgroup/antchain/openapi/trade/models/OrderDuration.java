// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class OrderDuration extends TeaModel {
    // 周期类型，YEAR：年；MONTH：月；DAY：日
    /**
     * <strong>example:</strong>
     * <p>YEAR</p>
     */
    @NameInMap("duration_type")
    @Validation(required = true)
    public String durationType;

    // 订购周期值
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("duration_value")
    @Validation(required = true)
    public Long durationValue;

    public static OrderDuration build(java.util.Map<String, ?> map) throws Exception {
        OrderDuration self = new OrderDuration();
        return TeaModel.build(map, self);
    }

    public OrderDuration setDurationType(String durationType) {
        this.durationType = durationType;
        return this;
    }
    public String getDurationType() {
        return this.durationType;
    }

    public OrderDuration setDurationValue(Long durationValue) {
        this.durationValue = durationValue;
        return this;
    }
    public Long getDurationValue() {
        return this.durationValue;
    }

}
