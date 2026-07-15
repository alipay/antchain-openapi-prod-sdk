// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class FulfillmentOptions extends TeaModel {
    // 是否延迟履约，默认false
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("deplay")
    public Boolean deplay;

    // 实际履约开始时间，默认支付完成时间；只有deplay=true时，start_time才生效
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 跳过SPI回调，默认false，优先级高于商品上默认的接入属性
    /**
     * <strong>example:</strong>
     * <p>true,false</p>
     */
    @NameInMap("spi_skip")
    public Boolean spiSkip;

    public static FulfillmentOptions build(java.util.Map<String, ?> map) throws Exception {
        FulfillmentOptions self = new FulfillmentOptions();
        return TeaModel.build(map, self);
    }

    public FulfillmentOptions setDeplay(Boolean deplay) {
        this.deplay = deplay;
        return this;
    }
    public Boolean getDeplay() {
        return this.deplay;
    }

    public FulfillmentOptions setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public FulfillmentOptions setSpiSkip(Boolean spiSkip) {
        this.spiSkip = spiSkip;
        return this;
    }
    public Boolean getSpiSkip() {
        return this.spiSkip;
    }

}
