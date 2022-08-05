// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class VerifyCustomerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("biz_code")
    public String bizCode;

    // 支付宝uid
    @NameInMap("alipay_uid")
    @Validation(required = true)
    public String alipayUid;

    // 个人名称
    @NameInMap("person_name")
    public String personName;

    // 个人联系电话
    @NameInMap("person_phone")
    public String personPhone;

    // 核验证件号
    @NameInMap("person_cert_no")
    public String personCertNo;

    // 个人身份类型  RESIDENT（身份证）
    @NameInMap("person_cert_type")
    public String personCertType;

    public static VerifyCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyCustomerRequest self = new VerifyCustomerRequest();
        return TeaModel.build(map, self);
    }

    public VerifyCustomerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyCustomerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyCustomerRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public VerifyCustomerRequest setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

    public VerifyCustomerRequest setPersonName(String personName) {
        this.personName = personName;
        return this;
    }
    public String getPersonName() {
        return this.personName;
    }

    public VerifyCustomerRequest setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
        return this;
    }
    public String getPersonPhone() {
        return this.personPhone;
    }

    public VerifyCustomerRequest setPersonCertNo(String personCertNo) {
        this.personCertNo = personCertNo;
        return this;
    }
    public String getPersonCertNo() {
        return this.personCertNo;
    }

    public VerifyCustomerRequest setPersonCertType(String personCertType) {
        this.personCertType = personCertType;
        return this;
    }
    public String getPersonCertType() {
        return this.personCertType;
    }

}
