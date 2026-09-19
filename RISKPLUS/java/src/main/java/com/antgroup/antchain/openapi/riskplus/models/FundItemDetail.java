// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class FundItemDetail extends TeaModel {
    // 账户类型，PET-活体、GOODS-商品、POINT_PACKAGE-积分包（储值卡）
    /**
     * <strong>example:</strong>
     * <p>POINT_PACKAGE</p>
     */
    @NameInMap("fund_type")
    @Validation(required = true)
    public String fundType;

    // 可用金额，不含冻结占用，无可用返回0，单位元
    /**
     * <strong>example:</strong>
     * <p>199.68</p>
     */
    @NameInMap("available_amount")
    @Validation(required = true)
    public String availableAmount;

    // 最高可退金额，涵盖了手续费，无可用返回0，单位元
    /**
     * <strong>example:</strong>
     * <p>199.68</p>
     */
    @NameInMap("can_refund_amount")
    @Validation(required = true)
    public String canRefundAmount;

    // 冻结金额，无冻结返回0，单位元
    /**
     * <strong>example:</strong>
     * <p>199.68</p>
     */
    @NameInMap("frozen_amount")
    @Validation(required = true)
    public String frozenAmount;

    // 账户归属的入驻id
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    public static FundItemDetail build(java.util.Map<String, ?> map) throws Exception {
        FundItemDetail self = new FundItemDetail();
        return TeaModel.build(map, self);
    }

    public FundItemDetail setFundType(String fundType) {
        this.fundType = fundType;
        return this;
    }
    public String getFundType() {
        return this.fundType;
    }

    public FundItemDetail setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
        return this;
    }
    public String getAvailableAmount() {
        return this.availableAmount;
    }

    public FundItemDetail setCanRefundAmount(String canRefundAmount) {
        this.canRefundAmount = canRefundAmount;
        return this;
    }
    public String getCanRefundAmount() {
        return this.canRefundAmount;
    }

    public FundItemDetail setFrozenAmount(String frozenAmount) {
        this.frozenAmount = frozenAmount;
        return this;
    }
    public String getFrozenAmount() {
        return this.frozenAmount;
    }

    public FundItemDetail setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
