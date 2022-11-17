// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_4a6e73bdbcb54f7dac260ad8ddbfd24a.models;

import com.aliyun.tea.*;

public class ApplyAntchainBbpContractRuleRequest extends TeaModel {
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

    public static ApplyAntchainBbpContractRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntchainBbpContractRuleRequest self = new ApplyAntchainBbpContractRuleRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAntchainBbpContractRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyAntchainBbpContractRuleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyAntchainBbpContractRuleRequest setSpProvider(SpProvider spProvider) {
        this.spProvider = spProvider;
        return this;
    }
    public SpProvider getSpProvider() {
        return this.spProvider;
    }

    public ApplyAntchainBbpContractRuleRequest setRuleDetails(java.util.List<RuleDetail> ruleDetails) {
        this.ruleDetails = ruleDetails;
        return this;
    }
    public java.util.List<RuleDetail> getRuleDetails() {
        return this.ruleDetails;
    }

    public ApplyAntchainBbpContractRuleRequest setConfirmer(String confirmer) {
        this.confirmer = confirmer;
        return this;
    }
    public String getConfirmer() {
        return this.confirmer;
    }

    public ApplyAntchainBbpContractRuleRequest setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate;
        return this;
    }
    public String getConfirmDate() {
        return this.confirmDate;
    }

    public ApplyAntchainBbpContractRuleRequest setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus;
        return this;
    }
    public String getConfirmStatus() {
        return this.confirmStatus;
    }

}
