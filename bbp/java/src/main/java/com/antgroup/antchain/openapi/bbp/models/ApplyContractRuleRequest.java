// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class ApplyContractRuleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务提供商
    @NameInMap("sp_provider")
    @Validation(required = true)
    public SpProvider spProvider;

    // 明细
    @NameInMap("rule_details")
    @Validation(required = true)
    public java.util.List<RuleDetail> ruleDetails;

    // confirmer
    @NameInMap("confirmer")
    @Validation(required = true)
    public String confirmer;

    // 确认时间
    @NameInMap("confirm_date")
    @Validation(required = true)
    public String confirmDate;

    // confirm_status
    @NameInMap("confirm_status")
    @Validation(required = true)
    public String confirmStatus;

    public static ApplyContractRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyContractRuleRequest self = new ApplyContractRuleRequest();
        return TeaModel.build(map, self);
    }

    public ApplyContractRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyContractRuleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyContractRuleRequest setSpProvider(SpProvider spProvider) {
        this.spProvider = spProvider;
        return this;
    }
    public SpProvider getSpProvider() {
        return this.spProvider;
    }

    public ApplyContractRuleRequest setRuleDetails(java.util.List<RuleDetail> ruleDetails) {
        this.ruleDetails = ruleDetails;
        return this;
    }
    public java.util.List<RuleDetail> getRuleDetails() {
        return this.ruleDetails;
    }

    public ApplyContractRuleRequest setConfirmer(String confirmer) {
        this.confirmer = confirmer;
        return this;
    }
    public String getConfirmer() {
        return this.confirmer;
    }

    public ApplyContractRuleRequest setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate;
        return this;
    }
    public String getConfirmDate() {
        return this.confirmDate;
    }

    public ApplyContractRuleRequest setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus;
        return this;
    }
    public String getConfirmStatus() {
        return this.confirmStatus;
    }

}
