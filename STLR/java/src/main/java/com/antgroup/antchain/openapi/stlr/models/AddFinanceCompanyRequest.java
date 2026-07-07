// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AddFinanceCompanyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 银行碳账户
    @NameInMap("enterprise_no")
    @Validation(required = true)
    public String enterpriseNo;

    // 企业统一信用代码或者项目编号
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    // 企业名称或者项目名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 行业编码，枚举值
    @NameInMap("industry_code")
    @Validation(required = true)
    public String industryCode;

    // 地区编码
    @NameInMap("area_code")
    @Validation(required = true)
    public String areaCode;

    // 提交人
    @NameInMap("company_submitter")
    @Validation(required = true)
    public String companySubmitter;

    // 企业或项目注册年份
    @NameInMap("register_year")
    @Validation(required = true)
    public String registerYear;

    public static AddFinanceCompanyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFinanceCompanyRequest self = new AddFinanceCompanyRequest();
        return TeaModel.build(map, self);
    }

    public AddFinanceCompanyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddFinanceCompanyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddFinanceCompanyRequest setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo;
        return this;
    }
    public String getEnterpriseNo() {
        return this.enterpriseNo;
    }

    public AddFinanceCompanyRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public AddFinanceCompanyRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public AddFinanceCompanyRequest setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
        return this;
    }
    public String getIndustryCode() {
        return this.industryCode;
    }

    public AddFinanceCompanyRequest setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    public String getAreaCode() {
        return this.areaCode;
    }

    public AddFinanceCompanyRequest setCompanySubmitter(String companySubmitter) {
        this.companySubmitter = companySubmitter;
        return this;
    }
    public String getCompanySubmitter() {
        return this.companySubmitter;
    }

    public AddFinanceCompanyRequest setRegisterYear(String registerYear) {
        this.registerYear = registerYear;
        return this;
    }
    public String getRegisterYear() {
        return this.registerYear;
    }

}
