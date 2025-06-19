// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class TradeRangeData extends TeaModel {
    // 区间开始
    @NameInMap("start")
    @Validation(required = true)
    public String start;

    // 区间结束
    @NameInMap("end")
    @Validation(required = true)
    public String end;

    // 区间内统计值
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    // 百分比
    @NameInMap("rate")
    @Validation(required = true)
    public String rate;

    public static TradeRangeData build(java.util.Map<String, ?> map) throws Exception {
        TradeRangeData self = new TradeRangeData();
        return TeaModel.build(map, self);
    }

    public TradeRangeData setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

    public TradeRangeData setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public TradeRangeData setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

    public TradeRangeData setRate(String rate) {
        this.rate = rate;
        return this;
    }
    public String getRate() {
        return this.rate;
    }

}
