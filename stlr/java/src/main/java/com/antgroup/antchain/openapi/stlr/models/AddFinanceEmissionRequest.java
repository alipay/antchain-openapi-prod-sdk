// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AddFinanceEmissionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 银行碳账号
    @NameInMap("enterprise_no")
    @Validation(required = true)
    public String enterpriseNo;

    // 企业统一社会信用代码
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    // 排放盘查方案
    @NameInMap("plan_code")
    @Validation(required = true)
    public String planCode;

    // 排放量
    @NameInMap("emission_dosage")
    @Validation(required = true)
    public String emissionDosage;

    // 年份
    @NameInMap("year")
    @Validation(required = true)
    public String year;

    public static AddFinanceEmissionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFinanceEmissionRequest self = new AddFinanceEmissionRequest();
        return TeaModel.build(map, self);
    }

    public AddFinanceEmissionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddFinanceEmissionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddFinanceEmissionRequest setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo;
        return this;
    }
    public String getEnterpriseNo() {
        return this.enterpriseNo;
    }

    public AddFinanceEmissionRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public AddFinanceEmissionRequest setPlanCode(String planCode) {
        this.planCode = planCode;
        return this;
    }
    public String getPlanCode() {
        return this.planCode;
    }

    public AddFinanceEmissionRequest setEmissionDosage(String emissionDosage) {
        this.emissionDosage = emissionDosage;
        return this;
    }
    public String getEmissionDosage() {
        return this.emissionDosage;
    }

    public AddFinanceEmissionRequest setYear(String year) {
        this.year = year;
        return this;
    }
    public String getYear() {
        return this.year;
    }

}
