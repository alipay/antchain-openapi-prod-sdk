// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class PayOptions extends TeaModel {
    // 系统自动会根据账号类型、当前OU进行付费渠道判定；如果传入的付款渠道不满足，则报错
    /**
     * <strong>example:</strong>
     * <p>CUSTOMER_FUND</p>
     */
    @NameInMap("pay_channel")
    public String payChannel;

    // 支付方式，例如：直付通
    /**
     * <strong>example:</strong>
     * <p>ZFT</p>
     */
    @NameInMap("payment_method")
    public String paymentMethod;

    public static PayOptions build(java.util.Map<String, ?> map) throws Exception {
        PayOptions self = new PayOptions();
        return TeaModel.build(map, self);
    }

    public PayOptions setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public PayOptions setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }
    public String getPaymentMethod() {
        return this.paymentMethod;
    }

}
