// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BindContractMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户ID
    @NameInMap("smid")
    @Validation(required = true)
    public String smid;

    // 商户证件号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 代理用户id，不填默认挂接平台方
    @NameInMap("agent_account_id")
    public String agentAccountId;

    public static BindContractMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        BindContractMerchantRequest self = new BindContractMerchantRequest();
        return TeaModel.build(map, self);
    }

    public BindContractMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindContractMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindContractMerchantRequest setSmid(String smid) {
        this.smid = smid;
        return this;
    }
    public String getSmid() {
        return this.smid;
    }

    public BindContractMerchantRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public BindContractMerchantRequest setAgentAccountId(String agentAccountId) {
        this.agentAccountId = agentAccountId;
        return this;
    }
    public String getAgentAccountId() {
        return this.agentAccountId;
    }

}
