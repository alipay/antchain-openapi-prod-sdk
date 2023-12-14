// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_aafd16538edd4fc0ab50acd01355adb6.models;

import com.aliyun.tea.*;

public class StartBlockchainTaxRiskEvaluationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 个人身份证号
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 个人姓名
    @NameInMap("identity_name")
    public String identityName;

    // 企业的统一社会信用编码
    @NameInMap("enterprise_id")
    public String enterpriseId;

    // 某某某公司
    @NameInMap("enterprise_name")
    public String enterpriseName;

    // 企业或者个人企业：ENTERPRISE 个人：PERSONAL
    @NameInMap("identity_type")
    @Validation(required = true)
    public String identityType;

    // 101
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 授权订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 请求流水号(必填),调用 方保证每次请求号唯   一，受理方用来校验唯 一性，同一受理号返回 请求结果一致
    @NameInMap("biz_request_id")
    @Validation(required = true)
    public String bizRequestId;

    // 子渠道渠道编码，需要同步蚂蚁，由蚂蚁设置。如果是银行本身，可不填 备注：如果同一信贷客户在不同银行的调用需要严格区分，分别授权
    @NameInMap("sub_tenant")
    @Validation(required = true)
    public String subTenant;

    // 扩展信息
    @NameInMap("extend_info")
    @Validation(required = true)
    public RiskEvaluationExtendInfoRequest extendInfo;

    // 查询模式，SINGLE_CITY 查到第一个城市就结束，ALL_CITY 查询所有城市，默认ALL_CITY
    @NameInMap("search_model")
    public String searchModel;

    public static StartBlockchainTaxRiskEvaluationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBlockchainTaxRiskEvaluationRequest self = new StartBlockchainTaxRiskEvaluationRequest();
        return TeaModel.build(map, self);
    }

    public StartBlockchainTaxRiskEvaluationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartBlockchainTaxRiskEvaluationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartBlockchainTaxRiskEvaluationRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public StartBlockchainTaxRiskEvaluationRequest setIdentityName(String identityName) {
        this.identityName = identityName;
        return this;
    }
    public String getIdentityName() {
        return this.identityName;
    }

    public StartBlockchainTaxRiskEvaluationRequest setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public String getEnterpriseId() {
        return this.enterpriseId;
    }

    public StartBlockchainTaxRiskEvaluationRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public StartBlockchainTaxRiskEvaluationRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public StartBlockchainTaxRiskEvaluationRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public StartBlockchainTaxRiskEvaluationRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public StartBlockchainTaxRiskEvaluationRequest setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public StartBlockchainTaxRiskEvaluationRequest setSubTenant(String subTenant) {
        this.subTenant = subTenant;
        return this;
    }
    public String getSubTenant() {
        return this.subTenant;
    }

    public StartBlockchainTaxRiskEvaluationRequest setExtendInfo(RiskEvaluationExtendInfoRequest extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public RiskEvaluationExtendInfoRequest getExtendInfo() {
        return this.extendInfo;
    }

    public StartBlockchainTaxRiskEvaluationRequest setSearchModel(String searchModel) {
        this.searchModel = searchModel;
        return this;
    }
    public String getSearchModel() {
        return this.searchModel;
    }

}
