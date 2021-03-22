// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPSettleRule extends TeaModel {
    // 结算类型， 1-表示结算到银行卡；2-表示结算到支付宝账号
    @NameInMap("settle_type")
    @Validation(required = true)
    public Long settleType;

    // 结算目标 如果settle_type = 1, 这里填写银行卡卡号; 如果settle_type = 2, 这里填写支付宝账号登录号, 且要求与商户名称name同名
    @NameInMap("settle_target")
    @Validation(required = true)
    public String settleTarget;

    public static IPSettleRule build(java.util.Map<String, ?> map) throws Exception {
        IPSettleRule self = new IPSettleRule();
        return TeaModel.build(map, self);
    }

    public IPSettleRule setSettleType(Long settleType) {
        this.settleType = settleType;
        return this;
    }
    public Long getSettleType() {
        return this.settleType;
    }

    public IPSettleRule setSettleTarget(String settleTarget) {
        this.settleTarget = settleTarget;
        return this;
    }
    public String getSettleTarget() {
        return this.settleTarget;
    }

}
