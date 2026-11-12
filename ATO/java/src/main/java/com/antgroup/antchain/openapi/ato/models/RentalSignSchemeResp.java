// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RentalSignSchemeResp extends TeaModel {
    // 修改后的押金方案，同入参
    /**
     * <strong>example:</strong>
     * <p>PREAUTH_ONLY</p>
     */
    @NameInMap("deposit_type")
    public String depositType;

    // 经校验落库的信用减免金额（分）
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("credit_reduce_amount")
    public Long creditReduceAmount;

    // 动作集：是否需要预授权冻结
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("need_preauth")
    public Boolean needPreauth;

    // 动作集：是否需要代扣签约（含信用减免的方案为 true；组合方案的代扣与预授权一并发起）
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("need_withhold")
    public Boolean needWithhold;

    // 动作集：是否需要合同签署（由订单进件时的 contractEnabled 决定，不由本接口修改）
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("need_contract")
    public Boolean needContract;

    // 合同签署完成后的回跳地址，用于小程序在合同签署完成后跳回；由订单快照的回跳配置生成，不经商家传入。本方案不含合同时为空
    /**
     * <strong>example:</strong>
     * <p><a href="https://m.taobao.com/rental/confirm?orderId=2026111200012345">https://m.taobao.com/rental/confirm?orderId=2026111200012345</a></p>
     */
    @NameInMap("return_url")
    public String returnUrl;

    public static RentalSignSchemeResp build(java.util.Map<String, ?> map) throws Exception {
        RentalSignSchemeResp self = new RentalSignSchemeResp();
        return TeaModel.build(map, self);
    }

    public RentalSignSchemeResp setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public RentalSignSchemeResp setCreditReduceAmount(Long creditReduceAmount) {
        this.creditReduceAmount = creditReduceAmount;
        return this;
    }
    public Long getCreditReduceAmount() {
        return this.creditReduceAmount;
    }

    public RentalSignSchemeResp setNeedPreauth(Boolean needPreauth) {
        this.needPreauth = needPreauth;
        return this;
    }
    public Boolean getNeedPreauth() {
        return this.needPreauth;
    }

    public RentalSignSchemeResp setNeedWithhold(Boolean needWithhold) {
        this.needWithhold = needWithhold;
        return this;
    }
    public Boolean getNeedWithhold() {
        return this.needWithhold;
    }

    public RentalSignSchemeResp setNeedContract(Boolean needContract) {
        this.needContract = needContract;
        return this;
    }
    public Boolean getNeedContract() {
        return this.needContract;
    }

    public RentalSignSchemeResp setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

}
