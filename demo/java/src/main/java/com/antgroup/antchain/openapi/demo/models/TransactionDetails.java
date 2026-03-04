// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class TransactionDetails extends TeaModel {
    // 金额
    /**
     * <strong>example:</strong>
     * <p>85000.00</p>
     */
    @NameInMap("amount")
    public Long amount;

    // 币种
    /**
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("currency")
    public String currency;

    // 渠道
    /**
     * <strong>example:</strong>
     * <p>ATM</p>
     */
    @NameInMap("channel")
    public String channel;

    // 地址
    /**
     * <strong>example:</strong>
     * <p>上海分行</p>
     */
    @NameInMap("location")
    public String location;

    // 时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String time;

    public static TransactionDetails build(java.util.Map<String, ?> map) throws Exception {
        TransactionDetails self = new TransactionDetails();
        return TeaModel.build(map, self);
    }

    public TransactionDetails setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public TransactionDetails setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public TransactionDetails setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public TransactionDetails setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public TransactionDetails setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
