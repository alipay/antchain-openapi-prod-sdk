// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class UpdateCustomerIdentityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 客户id
    @NameInMap("customer_id")
    public String customerId;

    // 企业名称或个人名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 证件号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 证件类型
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 法人姓名
    @NameInMap("real_name")
    public String realName;

    // 法人证件号码
    @NameInMap("artificial_person_cert_no")
    public String artificialPersonCertNo;

    // 法人证件类型
    @NameInMap("artificial_person_cert_type")
    public String artificialPersonCertType;

    // 业务场景码
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    // 业务角色
    @NameInMap("bussiness_role")
    public String bussinessRole;

    public static UpdateCustomerIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomerIdentityRequest self = new UpdateCustomerIdentityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomerIdentityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateCustomerIdentityRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public UpdateCustomerIdentityRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCustomerIdentityRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateCustomerIdentityRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public UpdateCustomerIdentityRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public UpdateCustomerIdentityRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public UpdateCustomerIdentityRequest setArtificialPersonCertNo(String artificialPersonCertNo) {
        this.artificialPersonCertNo = artificialPersonCertNo;
        return this;
    }
    public String getArtificialPersonCertNo() {
        return this.artificialPersonCertNo;
    }

    public UpdateCustomerIdentityRequest setArtificialPersonCertType(String artificialPersonCertType) {
        this.artificialPersonCertType = artificialPersonCertType;
        return this;
    }
    public String getArtificialPersonCertType() {
        return this.artificialPersonCertType;
    }

    public UpdateCustomerIdentityRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public UpdateCustomerIdentityRequest setBussinessRole(String bussinessRole) {
        this.bussinessRole = bussinessRole;
        return this;
    }
    public String getBussinessRole() {
        return this.bussinessRole;
    }

}
