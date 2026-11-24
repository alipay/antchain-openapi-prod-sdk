// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateSignSchemeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号，须为商户名下短租订单且处于已进件状态（未建单）
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商户社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 押金方案
    @NameInMap("deposit_type")
    @Validation(required = true)
    public String depositType;

    // 信用减免金额（分）。仅免押=depositAmount，仅预授权=0，免押&预授权 ∈ (0, depositAmount)
    @NameInMap("credit_reduce_amount")
    public Long creditReduceAmount;

    // 预授权申请冻结额（分）。仅预授权=depositAmount；免押&预授权满足 0 < preauth_amount ≤ depositAmount；仅免押=0
    @NameInMap("preauth_amount")
    public Long preauthAmount;

    // 签约后允许的超期时长（分钟）；签约完成时随订单域 signed 透传，用于订单侧计算关单时间
    @NameInMap("signed_overdue_minutes")
    @Validation(required = true)
    public Long signedOverdueMinutes;

    // 签约场景：RENTAL（短租）
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 是否需要合同签署
    @NameInMap("contract_enabled")
    @Validation(required = true)
    public Boolean contractEnabled;

    public static CreateSignSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSignSchemeRequest self = new CreateSignSchemeRequest();
        return TeaModel.build(map, self);
    }

    public CreateSignSchemeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSignSchemeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSignSchemeRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateSignSchemeRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CreateSignSchemeRequest setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public CreateSignSchemeRequest setCreditReduceAmount(Long creditReduceAmount) {
        this.creditReduceAmount = creditReduceAmount;
        return this;
    }
    public Long getCreditReduceAmount() {
        return this.creditReduceAmount;
    }

    public CreateSignSchemeRequest setPreauthAmount(Long preauthAmount) {
        this.preauthAmount = preauthAmount;
        return this;
    }
    public Long getPreauthAmount() {
        return this.preauthAmount;
    }

    public CreateSignSchemeRequest setSignedOverdueMinutes(Long signedOverdueMinutes) {
        this.signedOverdueMinutes = signedOverdueMinutes;
        return this;
    }
    public Long getSignedOverdueMinutes() {
        return this.signedOverdueMinutes;
    }

    public CreateSignSchemeRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateSignSchemeRequest setContractEnabled(Boolean contractEnabled) {
        this.contractEnabled = contractEnabled;
        return this;
    }
    public Boolean getContractEnabled() {
        return this.contractEnabled;
    }

}
