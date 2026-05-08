// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryAgentFinancialRiskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户基础信息
    @NameInMap("user_profile")
    public UserProfile userProfile;

    // 交易明细信息
    @NameInMap("transaction_details")
    public TransactionDetails transactionDetails;

    // 风险评估因子列表
    @NameInMap("risk_factors")
    public java.util.List<RiskFactorDetail> riskFactors;

    // 业务上下文信息
    @NameInMap("business_context")
    public NameValuePair businessContext;

    // 风险等级标识（LOW/MEDIUM/HIGH/URGENT）
    @NameInMap("risk_level")
    public String riskLevel;

    // 接口超时时间（毫秒）
    @NameInMap("timeout")
    @Validation(maximum = 60000)
    public Long timeout;

    public static QueryAgentFinancialRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAgentFinancialRiskRequest self = new QueryAgentFinancialRiskRequest();
        return TeaModel.build(map, self);
    }

    public QueryAgentFinancialRiskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAgentFinancialRiskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAgentFinancialRiskRequest setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }
    public UserProfile getUserProfile() {
        return this.userProfile;
    }

    public QueryAgentFinancialRiskRequest setTransactionDetails(TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
        return this;
    }
    public TransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    public QueryAgentFinancialRiskRequest setRiskFactors(java.util.List<RiskFactorDetail> riskFactors) {
        this.riskFactors = riskFactors;
        return this;
    }
    public java.util.List<RiskFactorDetail> getRiskFactors() {
        return this.riskFactors;
    }

    public QueryAgentFinancialRiskRequest setBusinessContext(NameValuePair businessContext) {
        this.businessContext = businessContext;
        return this;
    }
    public NameValuePair getBusinessContext() {
        return this.businessContext;
    }

    public QueryAgentFinancialRiskRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public QueryAgentFinancialRiskRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
