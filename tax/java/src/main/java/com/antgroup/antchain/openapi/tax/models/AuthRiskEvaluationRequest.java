// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class AuthRiskEvaluationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 个人身份证号
    @NameInMap("identity_id")
    @Validation(maxLength = 30)
    public String identityId;

    // 个人姓名
    @NameInMap("identity_name")
    @Validation(maxLength = 128)
    public String identityName;

    // 企业的统一社会信用编码
    @NameInMap("enterprise_id")
    @Validation(maxLength = 64)
    public String enterpriseId;

    // 企业的名称
    @NameInMap("enterprise_name")
    public String enterpriseName;

    // 企业或者个人企业：ENTERPRISE  个人：PERSONAL
    // 
    @NameInMap("identity_type")
    @Validation(required = true)
    public String identityType;

    // 授权的业务类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 授权订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 子渠道渠道编码，需要同步蚂蚁，由蚂蚁设置。如果是银行本身，可不填
    // 备注：如果同一信贷客户在不同银行的调用需要严格区分，分别授权
    // 
    @NameInMap("sub_tenant")
    public String subTenant;

    //  扩展信息
    @NameInMap("extend_info")
    @Validation(required = true)
    public RiskEvaluationExtendInfoRequest extendInfo;

    public static AuthRiskEvaluationRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthRiskEvaluationRequest self = new AuthRiskEvaluationRequest();
        return TeaModel.build(map, self);
    }

    public AuthRiskEvaluationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthRiskEvaluationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthRiskEvaluationRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public AuthRiskEvaluationRequest setIdentityName(String identityName) {
        this.identityName = identityName;
        return this;
    }
    public String getIdentityName() {
        return this.identityName;
    }

    public AuthRiskEvaluationRequest setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public String getEnterpriseId() {
        return this.enterpriseId;
    }

    public AuthRiskEvaluationRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public AuthRiskEvaluationRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public AuthRiskEvaluationRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public AuthRiskEvaluationRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public AuthRiskEvaluationRequest setSubTenant(String subTenant) {
        this.subTenant = subTenant;
        return this;
    }
    public String getSubTenant() {
        return this.subTenant;
    }

    public AuthRiskEvaluationRequest setExtendInfo(RiskEvaluationExtendInfoRequest extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public RiskEvaluationExtendInfoRequest getExtendInfo() {
        return this.extendInfo;
    }

}
