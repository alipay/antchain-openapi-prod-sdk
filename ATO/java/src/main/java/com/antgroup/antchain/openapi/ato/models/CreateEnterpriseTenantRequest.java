// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateEnterpriseTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业id
    @NameInMap("enterprise_id")
    @Validation(required = true)
    public String enterpriseId;

    // 企业全称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 统一社会信用代码
    @NameInMap("tax_registration_no")
    @Validation(required = true)
    public String taxRegistrationNo;

    public static CreateEnterpriseTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseTenantRequest self = new CreateEnterpriseTenantRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateEnterpriseTenantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateEnterpriseTenantRequest setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public String getEnterpriseId() {
        return this.enterpriseId;
    }

    public CreateEnterpriseTenantRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public CreateEnterpriseTenantRequest setTaxRegistrationNo(String taxRegistrationNo) {
        this.taxRegistrationNo = taxRegistrationNo;
        return this;
    }
    public String getTaxRegistrationNo() {
        return this.taxRegistrationNo;
    }

}
