// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class DefaultSettleRule extends TeaModel {
    // 默认结算类型，结算到银行卡: bankCard，结算到支付宝账号: alipayAccount
    /**
     * <strong>example:</strong>
     * <p>alipayAccount</p>
     */
    @NameInMap("default_settle_type")
    @Validation(required = true)
    public String defaultSettleType;

    // 默认结算目标	bankCard 时填银行卡号，alipayAccount 时填支付宝登录号
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:myalipay@alipay.com">myalipay@alipay.com</a></p>
     */
    @NameInMap("default_settle_target")
    @Validation(required = true)
    public String defaultSettleTarget;

    public static DefaultSettleRule build(java.util.Map<String, ?> map) throws Exception {
        DefaultSettleRule self = new DefaultSettleRule();
        return TeaModel.build(map, self);
    }

    public DefaultSettleRule setDefaultSettleType(String defaultSettleType) {
        this.defaultSettleType = defaultSettleType;
        return this;
    }
    public String getDefaultSettleType() {
        return this.defaultSettleType;
    }

    public DefaultSettleRule setDefaultSettleTarget(String defaultSettleTarget) {
        this.defaultSettleTarget = defaultSettleTarget;
        return this;
    }
    public String getDefaultSettleTarget() {
        return this.defaultSettleTarget;
    }

}
