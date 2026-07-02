// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncFundFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商户统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 资方统一社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 电子签署流程ID, 业务方唯一id，每一个签署流程唯一确定一个flowId
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 合同待签署url
    @NameInMap("sign_url")
    @Validation(required = true)
    public String signUrl;

    // 合同类型
    // TRANSFER(传授信合同)、AUTHORIZATION(授权函)、CREDIT_UTILIZATION(用信合同)、OTHER(其他)
    @NameInMap("contract_type")
    @Validation(required = true)
    public String contractType;

    // 合同名称，资方可自行命名，传授信合同/征信授权函/保理合同/其他
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // json格式 拓展信息 由资方自行推送补充内容，例如签署最晚时间、签署要求等
    @NameInMap("extend_info")
    @Validation(required = true)
    public String extendInfo;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static SyncFundFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncFundFlowRequest self = new SyncFundFlowRequest();
        return TeaModel.build(map, self);
    }

    public SyncFundFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncFundFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncFundFlowRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncFundFlowRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncFundFlowRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public SyncFundFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public SyncFundFlowRequest setSignUrl(String signUrl) {
        this.signUrl = signUrl;
        return this;
    }
    public String getSignUrl() {
        return this.signUrl;
    }

    public SyncFundFlowRequest setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }
    public String getContractType() {
        return this.contractType;
    }

    public SyncFundFlowRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public SyncFundFlowRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public SyncFundFlowRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
