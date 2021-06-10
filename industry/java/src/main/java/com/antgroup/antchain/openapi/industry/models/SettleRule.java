// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class SettleRule extends TeaModel {
    // 结算类型， bankCard-表示结算到银行卡；alipayAccount-表示结算到支付宝账号
    @NameInMap("default_settle_type")
    @Validation(required = true)
    public String defaultSettleType;

    // 结算目标
    // 如果settle_type = bankCard, 这里填写银行卡卡号;
    // 如果settle_type = alipayAccount, 这里填写支付宝账号登录号, 且要求与商户名称name同名
    @NameInMap("default_settle_target")
    @Validation(required = true)
    public String defaultSettleTarget;

    public static SettleRule build(java.util.Map<String, ?> map) throws Exception {
        SettleRule self = new SettleRule();
        return TeaModel.build(map, self);
    }

    public SettleRule setDefaultSettleType(String defaultSettleType) {
        this.defaultSettleType = defaultSettleType;
        return this;
    }
    public String getDefaultSettleType() {
        return this.defaultSettleType;
    }

    public SettleRule setDefaultSettleTarget(String defaultSettleTarget) {
        this.defaultSettleTarget = defaultSettleTarget;
        return this;
    }
    public String getDefaultSettleTarget() {
        return this.defaultSettleTarget;
    }

}
