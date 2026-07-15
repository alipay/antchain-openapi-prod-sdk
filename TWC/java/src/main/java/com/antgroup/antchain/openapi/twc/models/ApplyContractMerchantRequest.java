// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyContractMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入驻信息，必须是json字符串
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 代理商户账户ID，此参数传null默认平台机构账户入驻，不允许传空字符串
    @NameInMap("agent_account_id")
    public String agentAccountId;

    public static ApplyContractMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyContractMerchantRequest self = new ApplyContractMerchantRequest();
        return TeaModel.build(map, self);
    }

    public ApplyContractMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyContractMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyContractMerchantRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public ApplyContractMerchantRequest setAgentAccountId(String agentAccountId) {
        this.agentAccountId = agentAccountId;
        return this;
    }
    public String getAgentAccountId() {
        return this.agentAccountId;
    }

}
