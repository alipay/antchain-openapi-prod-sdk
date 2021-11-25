// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CreateDidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ⾃定义唯⼀id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 租户类型
    // 
    @NameInMap("tenant_type")
    @Validation(required = true)
    public String tenantType;

    // 认证类型，企业：FIRM，个人：PERSON
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 企业营业执照号(当认证类型为企业时为必传)
    @NameInMap("cert_reg_num")
    public String certRegNum;

    // 法人姓名
    @NameInMap("legal_name")
    public String legalName;

    // 法人身份证号
    @NameInMap("legal_cert_num")
    public String legalCertNum;

    // 企业名称(当认证类型为企业时为必传)
    @NameInMap("firm_name")
    public String firmName;

    // 个人email
    @NameInMap("email")
    public String email;

    // 个人身份证号
    @NameInMap("cert_num")
    @Validation(required = true)
    public String certNum;

    // 个人手机号
    @NameInMap("phone")
    public String phone;

    // 个人姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 个人did(当认证类型为企业时为必传)
    @NameInMap("user_did")
    public String userDid;

    public static CreateDidRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDidRequest self = new CreateDidRequest();
        return TeaModel.build(map, self);
    }

    public CreateDidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDidRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateDidRequest setTenantType(String tenantType) {
        this.tenantType = tenantType;
        return this;
    }
    public String getTenantType() {
        return this.tenantType;
    }

    public CreateDidRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateDidRequest setCertRegNum(String certRegNum) {
        this.certRegNum = certRegNum;
        return this;
    }
    public String getCertRegNum() {
        return this.certRegNum;
    }

    public CreateDidRequest setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public CreateDidRequest setLegalCertNum(String legalCertNum) {
        this.legalCertNum = legalCertNum;
        return this;
    }
    public String getLegalCertNum() {
        return this.legalCertNum;
    }

    public CreateDidRequest setFirmName(String firmName) {
        this.firmName = firmName;
        return this;
    }
    public String getFirmName() {
        return this.firmName;
    }

    public CreateDidRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateDidRequest setCertNum(String certNum) {
        this.certNum = certNum;
        return this;
    }
    public String getCertNum() {
        return this.certNum;
    }

    public CreateDidRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateDidRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDidRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

}
