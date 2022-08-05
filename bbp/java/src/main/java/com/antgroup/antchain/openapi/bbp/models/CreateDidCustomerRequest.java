// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class CreateDidCustomerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("biz_code")
    @Validation(required = true)
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

    // 个人身份类型
    @NameInMap("person_cert_type")
    public String personCertType;

    public static CreateDidCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDidCustomerRequest self = new CreateDidCustomerRequest();
        return TeaModel.build(map, self);
    }

    public CreateDidCustomerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDidCustomerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDidCustomerRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateDidCustomerRequest setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

    public CreateDidCustomerRequest setPersonName(String personName) {
        this.personName = personName;
        return this;
    }
    public String getPersonName() {
        return this.personName;
    }

    public CreateDidCustomerRequest setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
        return this;
    }
    public String getPersonPhone() {
        return this.personPhone;
    }

    public CreateDidCustomerRequest setPersonCertNo(String personCertNo) {
        this.personCertNo = personCertNo;
        return this;
    }
    public String getPersonCertNo() {
        return this.personCertNo;
    }

    public CreateDidCustomerRequest setPersonCertType(String personCertType) {
        this.personCertType = personCertType;
        return this;
    }
    public String getPersonCertType() {
        return this.personCertType;
    }

}
