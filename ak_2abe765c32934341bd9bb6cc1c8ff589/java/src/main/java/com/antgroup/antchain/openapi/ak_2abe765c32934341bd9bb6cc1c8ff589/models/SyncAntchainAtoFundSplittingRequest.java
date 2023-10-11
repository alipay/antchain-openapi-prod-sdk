// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class SyncAntchainAtoFundSplittingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方订单号
    @NameInMap("fund_no")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String fundNo;

    // 商户的订单号
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orderId;

    // 商户的数科租户ID
    @NameInMap("merchant_tenant_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String merchantTenantId;

    // 第几期，例如：2表示第二期
    @NameInMap("term_num")
    @Validation(required = true)
    public Long termNum;

    // 扣款时间， yyyy-MM-dd HH:mm:ss 格式
    @NameInMap("deduction_time")
    @Validation(required = true)
    public String deductionTime;

    // 扣款金额，单位精确到分， 例如：12462300为124623.00元
    @NameInMap("deduction_amount")
    @Validation(required = true)
    public Long deductionAmount;

    // 商户分账金额，单位精确到分，比如：666601 = 6666.01元
    @NameInMap("merchant_split_amount")
    @Validation(required = true)
    public Long merchantSplitAmount;

    // 资方分账金额，单位精确到分。比如：666610 = 6666.10元
    @NameInMap("fund_split_amount")
    @Validation(required = true)
    public Long fundSplitAmount;

    // 其他参与方分账信息，JSON格式的数组，样例：
    // [{"participants":"参与方A","amount":666600,"accountNo":"777223","accountType":"ICBC"}]
    @NameInMap("other_split_info")
    public String otherSplitInfo;

    public static SyncAntchainAtoFundSplittingRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainAtoFundSplittingRequest self = new SyncAntchainAtoFundSplittingRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainAtoFundSplittingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainAtoFundSplittingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainAtoFundSplittingRequest setFundNo(String fundNo) {
        this.fundNo = fundNo;
        return this;
    }
    public String getFundNo() {
        return this.fundNo;
    }

    public SyncAntchainAtoFundSplittingRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncAntchainAtoFundSplittingRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

    public SyncAntchainAtoFundSplittingRequest setTermNum(Long termNum) {
        this.termNum = termNum;
        return this;
    }
    public Long getTermNum() {
        return this.termNum;
    }

    public SyncAntchainAtoFundSplittingRequest setDeductionTime(String deductionTime) {
        this.deductionTime = deductionTime;
        return this;
    }
    public String getDeductionTime() {
        return this.deductionTime;
    }

    public SyncAntchainAtoFundSplittingRequest setDeductionAmount(Long deductionAmount) {
        this.deductionAmount = deductionAmount;
        return this;
    }
    public Long getDeductionAmount() {
        return this.deductionAmount;
    }

    public SyncAntchainAtoFundSplittingRequest setMerchantSplitAmount(Long merchantSplitAmount) {
        this.merchantSplitAmount = merchantSplitAmount;
        return this;
    }
    public Long getMerchantSplitAmount() {
        return this.merchantSplitAmount;
    }

    public SyncAntchainAtoFundSplittingRequest setFundSplitAmount(Long fundSplitAmount) {
        this.fundSplitAmount = fundSplitAmount;
        return this;
    }
    public Long getFundSplitAmount() {
        return this.fundSplitAmount;
    }

    public SyncAntchainAtoFundSplittingRequest setOtherSplitInfo(String otherSplitInfo) {
        this.otherSplitInfo = otherSplitInfo;
        return this;
    }
    public String getOtherSplitInfo() {
        return this.otherSplitInfo;
    }

}
