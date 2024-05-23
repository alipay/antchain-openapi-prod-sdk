// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class UpdateAntchainAtoTradeUserpromiseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 49, minLength = 6)
    public String orderId;

    // 商家社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 199, minLength = 1)
    public String merchantId;

    // 修改的用户履约期数
    @NameInMap("term_idx")
    @Validation(required = true)
    public Long termIdx;

    // 更新后的租金，单位为分
    // 1234=12.34元
    @NameInMap("updated_rental_money")
    @Validation(required = true)
    public Long updatedRentalMoney;

    // 调整原因，枚举
    // ● A01 : 违章罚金
    // ● A02 : 水电煤费用
    @NameInMap("reason")
    @Validation(required = true, maxLength = 10, minLength = 1)
    public String reason;

    // 调整说明，本说明同步到支付宝账户备注中，需准确填写
    @NameInMap("desc")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String desc;

    public static UpdateAntchainAtoTradeUserpromiseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntchainAtoTradeUserpromiseRequest self = new UpdateAntchainAtoTradeUserpromiseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntchainAtoTradeUserpromiseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAntchainAtoTradeUserpromiseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAntchainAtoTradeUserpromiseRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateAntchainAtoTradeUserpromiseRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public UpdateAntchainAtoTradeUserpromiseRequest setTermIdx(Long termIdx) {
        this.termIdx = termIdx;
        return this;
    }
    public Long getTermIdx() {
        return this.termIdx;
    }

    public UpdateAntchainAtoTradeUserpromiseRequest setUpdatedRentalMoney(Long updatedRentalMoney) {
        this.updatedRentalMoney = updatedRentalMoney;
        return this;
    }
    public Long getUpdatedRentalMoney() {
        return this.updatedRentalMoney;
    }

    public UpdateAntchainAtoTradeUserpromiseRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public UpdateAntchainAtoTradeUserpromiseRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
