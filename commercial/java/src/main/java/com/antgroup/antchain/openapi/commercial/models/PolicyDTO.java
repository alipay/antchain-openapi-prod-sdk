// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class PolicyDTO extends TeaModel {
    // 政策信息
    @NameInMap("policy")
    @Validation(required = true)
    public Policy policy;

    // 政策关联商品
    @NameInMap("policy_commodity")
    @Validation(required = true)
    public PolicyCommodity policyCommodity;

    // 合同id
    @NameInMap("agreement_id")
    public String agreementId;

    // 签约状态
    @NameInMap("sign_status")
    @Validation(required = true)
    public String signStatus;

    public static PolicyDTO build(java.util.Map<String, ?> map) throws Exception {
        PolicyDTO self = new PolicyDTO();
        return TeaModel.build(map, self);
    }

    public PolicyDTO setPolicy(Policy policy) {
        this.policy = policy;
        return this;
    }
    public Policy getPolicy() {
        return this.policy;
    }

    public PolicyDTO setPolicyCommodity(PolicyCommodity policyCommodity) {
        this.policyCommodity = policyCommodity;
        return this;
    }
    public PolicyCommodity getPolicyCommodity() {
        return this.policyCommodity;
    }

    public PolicyDTO setAgreementId(String agreementId) {
        this.agreementId = agreementId;
        return this;
    }
    public String getAgreementId() {
        return this.agreementId;
    }

    public PolicyDTO setSignStatus(String signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public String getSignStatus() {
        return this.signStatus;
    }

}
