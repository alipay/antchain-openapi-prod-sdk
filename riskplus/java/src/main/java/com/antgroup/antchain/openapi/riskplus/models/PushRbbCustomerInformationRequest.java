// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushRbbCustomerInformationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 社会信用代码
    @NameInMap("credit_code")
    @Validation(required = true)
    public String creditCode;

    // 公司名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 法人姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 身份证号
    @NameInMap("id_card")
    @Validation(required = true)
    public String idCard;

    // 手机号
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 合作伙伴
    @NameInMap("business_partner")
    @Validation(required = true)
    public String businessPartner;

    // 指定产品方
    @NameInMap("product_side")
    @Validation(required = true)
    public String productSide;

    // 账号
    @NameInMap("account")
    @Validation(required = true)
    public String account;

    // 密码
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    public static PushRbbCustomerInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRbbCustomerInformationRequest self = new PushRbbCustomerInformationRequest();
        return TeaModel.build(map, self);
    }

    public PushRbbCustomerInformationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRbbCustomerInformationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRbbCustomerInformationRequest setCreditCode(String creditCode) {
        this.creditCode = creditCode;
        return this;
    }
    public String getCreditCode() {
        return this.creditCode;
    }

    public PushRbbCustomerInformationRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public PushRbbCustomerInformationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PushRbbCustomerInformationRequest setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

    public PushRbbCustomerInformationRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public PushRbbCustomerInformationRequest setBusinessPartner(String businessPartner) {
        this.businessPartner = businessPartner;
        return this;
    }
    public String getBusinessPartner() {
        return this.businessPartner;
    }

    public PushRbbCustomerInformationRequest setProductSide(String productSide) {
        this.productSide = productSide;
        return this;
    }
    public String getProductSide() {
        return this.productSide;
    }

    public PushRbbCustomerInformationRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public PushRbbCustomerInformationRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
