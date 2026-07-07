// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class UpdateFinanceCompanyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 银行碳账户
    @NameInMap("enterprise_no")
    @Validation(required = true)
    public String enterpriseNo;

    // 企业统一信用代码
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    // 企业或者项目名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 行业编码
    @NameInMap("industry_code")
    @Validation(required = true)
    public String industryCode;

    // 地区编码
    @NameInMap("area_code")
    @Validation(required = true)
    public String areaCode;

    public static UpdateFinanceCompanyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFinanceCompanyRequest self = new UpdateFinanceCompanyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFinanceCompanyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateFinanceCompanyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateFinanceCompanyRequest setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo;
        return this;
    }
    public String getEnterpriseNo() {
        return this.enterpriseNo;
    }

    public UpdateFinanceCompanyRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public UpdateFinanceCompanyRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public UpdateFinanceCompanyRequest setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
        return this;
    }
    public String getIndustryCode() {
        return this.industryCode;
    }

    public UpdateFinanceCompanyRequest setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    public String getAreaCode() {
        return this.areaCode;
    }

}
