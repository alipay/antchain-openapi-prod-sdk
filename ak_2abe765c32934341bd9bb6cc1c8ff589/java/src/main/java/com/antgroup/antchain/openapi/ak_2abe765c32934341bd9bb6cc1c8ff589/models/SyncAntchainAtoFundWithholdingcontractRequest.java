// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class SyncAntchainAtoFundWithholdingcontractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orderId;

    // 商家在数科注册的租户id
    @NameInMap("merchant_tenant_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String merchantTenantId;

    // 代扣协议号
    @NameInMap("withholding_contract_id")
    @Validation(required = true, maxLength = 100, minLength = 1)
    public String withholdingContractId;

    // json的字符串，存储额外信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 签署状态：
    // - ACCEPT : 接受
    // - REFUSE : 拒绝
    // - TIMEOUT : 超时
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static SyncAntchainAtoFundWithholdingcontractRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainAtoFundWithholdingcontractRequest self = new SyncAntchainAtoFundWithholdingcontractRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainAtoFundWithholdingcontractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainAtoFundWithholdingcontractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainAtoFundWithholdingcontractRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncAntchainAtoFundWithholdingcontractRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

    public SyncAntchainAtoFundWithholdingcontractRequest setWithholdingContractId(String withholdingContractId) {
        this.withholdingContractId = withholdingContractId;
        return this;
    }
    public String getWithholdingContractId() {
        return this.withholdingContractId;
    }

    public SyncAntchainAtoFundWithholdingcontractRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public SyncAntchainAtoFundWithholdingcontractRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
