// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class RegisterDevicecorpCustomerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目code
    @NameInMap("project_code")
    @Validation(required = true)
    public String projectCode;

    // 企业名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 企业品牌名称
    @NameInMap("company_brand_name")
    @Validation(required = true)
    public String companyBrandName;

    // 主联系人
    @NameInMap("contacts")
    public String contacts;

    // 主联系方式
    @NameInMap("contact_number")
    public String contactNumber;

    public static RegisterDevicecorpCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterDevicecorpCustomerRequest self = new RegisterDevicecorpCustomerRequest();
        return TeaModel.build(map, self);
    }

    public RegisterDevicecorpCustomerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterDevicecorpCustomerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterDevicecorpCustomerRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public RegisterDevicecorpCustomerRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public RegisterDevicecorpCustomerRequest setCompanyBrandName(String companyBrandName) {
        this.companyBrandName = companyBrandName;
        return this;
    }
    public String getCompanyBrandName() {
        return this.companyBrandName;
    }

    public RegisterDevicecorpCustomerRequest setContacts(String contacts) {
        this.contacts = contacts;
        return this;
    }
    public String getContacts() {
        return this.contacts;
    }

    public RegisterDevicecorpCustomerRequest setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }
    public String getContactNumber() {
        return this.contactNumber;
    }

}
