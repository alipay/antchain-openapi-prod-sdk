// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ChannelCounter extends TeaModel {
    // 渠道名字
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 统计值
    @NameInMap("counter")
    @Validation(required = true)
    public Long counter;

    // 月份。如果月份有具体值则数据为该月份数据，月份为空则为全部统计数据。
    @NameInMap("month")
    public String month;

    // 渠道交易金额
    @NameInMap("total_price")
    public String totalPrice;

    public static ChannelCounter build(java.util.Map<String, ?> map) throws Exception {
        ChannelCounter self = new ChannelCounter();
        return TeaModel.build(map, self);
    }

    public ChannelCounter setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public ChannelCounter setCounter(Long counter) {
        this.counter = counter;
        return this;
    }
    public Long getCounter() {
        return this.counter;
    }

    public ChannelCounter setMonth(String month) {
        this.month = month;
        return this;
    }
    public String getMonth() {
        return this.month;
    }

    public ChannelCounter setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
    public String getTotalPrice() {
        return this.totalPrice;
    }

}
