// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SignFundFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 资方统一社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 合同待签署url
    @NameInMap("sign_doc_url")
    public String signDocUrl;

    // 签署状态 SIGNED-已签署 UNDO-作废
    @NameInMap("sign_status")
    @Validation(required = true)
    public String signStatus;

    // 签约id
    @NameInMap("sign_no")
    @Validation(required = true)
    public String signNo;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 文件名 非必填，sign_doc_url传了，此字段必传
    @NameInMap("contract_name")
    public String contractName;

    public static SignFundFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        SignFundFlowRequest self = new SignFundFlowRequest();
        return TeaModel.build(map, self);
    }

    public SignFundFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SignFundFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SignFundFlowRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SignFundFlowRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public SignFundFlowRequest setSignDocUrl(String signDocUrl) {
        this.signDocUrl = signDocUrl;
        return this;
    }
    public String getSignDocUrl() {
        return this.signDocUrl;
    }

    public SignFundFlowRequest setSignStatus(String signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public String getSignStatus() {
        return this.signStatus;
    }

    public SignFundFlowRequest setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

    public SignFundFlowRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SignFundFlowRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

}
