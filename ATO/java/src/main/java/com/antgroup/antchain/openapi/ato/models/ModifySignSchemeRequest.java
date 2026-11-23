// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ModifySignSchemeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号，须为商户名下短租订单，且尚未发起签约
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

    // 代扣协议额度（分），所有含信用减免的方案必须等于 credit_reduce_amount；仅预授权=0
    @NameInMap("withhold_quota")
    public Long withholdQuota;

    // 签约后允许的超期时长（分钟）；建单/修改落库后用于签约完成时 signed 透传
    @NameInMap("signed_overdue_minutes")
    @Validation(required = true)
    public Long signedOverdueMinutes;

    public static ModifySignSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySignSchemeRequest self = new ModifySignSchemeRequest();
        return TeaModel.build(map, self);
    }

    public ModifySignSchemeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ModifySignSchemeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ModifySignSchemeRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifySignSchemeRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ModifySignSchemeRequest setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public ModifySignSchemeRequest setCreditReduceAmount(Long creditReduceAmount) {
        this.creditReduceAmount = creditReduceAmount;
        return this;
    }
    public Long getCreditReduceAmount() {
        return this.creditReduceAmount;
    }

    public ModifySignSchemeRequest setPreauthAmount(Long preauthAmount) {
        this.preauthAmount = preauthAmount;
        return this;
    }
    public Long getPreauthAmount() {
        return this.preauthAmount;
    }

    public ModifySignSchemeRequest setWithholdQuota(Long withholdQuota) {
        this.withholdQuota = withholdQuota;
        return this;
    }
    public Long getWithholdQuota() {
        return this.withholdQuota;
    }

    public ModifySignSchemeRequest setSignedOverdueMinutes(Long signedOverdueMinutes) {
        this.signedOverdueMinutes = signedOverdueMinutes;
        return this;
    }
    public Long getSignedOverdueMinutes() {
        return this.signedOverdueMinutes;
    }

}
