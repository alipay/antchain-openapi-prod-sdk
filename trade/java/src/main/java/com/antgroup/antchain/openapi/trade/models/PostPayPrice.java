// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class PostPayPrice extends TeaModel {
    //  币种单位值，156（CNY)
    /**
     * <strong>example:</strong>
     * <p> 币种单位值，156（CNY)</p>
     */
    @NameInMap("currency_value")
    public String currencyValue;

    //  价格周期
    /**
     * <strong>example:</strong>
     * <p> 价格周期</p>
     */
    @NameInMap("duration")
    public OrderDuration duration;

    // 非继承型一客一价
    /**
     * <strong>example:</strong>
     * <p>非继承型一客一价</p>
     */
    @NameInMap("no_extend_prices")
    public java.util.List<NoExtendPrice> noExtendPrices;

    public static PostPayPrice build(java.util.Map<String, ?> map) throws Exception {
        PostPayPrice self = new PostPayPrice();
        return TeaModel.build(map, self);
    }

    public PostPayPrice setCurrencyValue(String currencyValue) {
        this.currencyValue = currencyValue;
        return this;
    }
    public String getCurrencyValue() {
        return this.currencyValue;
    }

    public PostPayPrice setDuration(OrderDuration duration) {
        this.duration = duration;
        return this;
    }
    public OrderDuration getDuration() {
        return this.duration;
    }

    public PostPayPrice setNoExtendPrices(java.util.List<NoExtendPrice> noExtendPrices) {
        this.noExtendPrices = noExtendPrices;
        return this;
    }
    public java.util.List<NoExtendPrice> getNoExtendPrices() {
        return this.noExtendPrices;
    }

}
