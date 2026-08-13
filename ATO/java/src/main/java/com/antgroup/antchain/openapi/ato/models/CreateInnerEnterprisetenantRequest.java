// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerEnterprisetenantRequest extends TeaModel {
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

    public static CreateInnerEnterprisetenantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerEnterprisetenantRequest self = new CreateInnerEnterprisetenantRequest();
        return TeaModel.build(map, self);
    }

    public CreateInnerEnterprisetenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInnerEnterprisetenantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInnerEnterprisetenantRequest setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public String getEnterpriseId() {
        return this.enterpriseId;
    }

    public CreateInnerEnterprisetenantRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public CreateInnerEnterprisetenantRequest setTaxRegistrationNo(String taxRegistrationNo) {
        this.taxRegistrationNo = taxRegistrationNo;
        return this;
    }
    public String getTaxRegistrationNo() {
        return this.taxRegistrationNo;
    }

}
