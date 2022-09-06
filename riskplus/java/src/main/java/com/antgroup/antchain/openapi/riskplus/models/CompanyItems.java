// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CompanyItems extends TeaModel {
    // 公司id
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    // 蚂蚁科技集团股份有限公司
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 匹配名称
    @NameInMap("matching_name")
    @Validation(required = true)
    public String matchingName;

    // 匹配类型
    @NameInMap("matching_type")
    @Validation(required = true)
    public String matchingType;

    // 匹配值
    @NameInMap("matching_value")
    @Validation(required = true)
    public String matchingValue;

    // 返回标识
    @NameInMap("uc_code")
    @Validation(required = true)
    public String ucCode;

    public static CompanyItems build(java.util.Map<String, ?> map) throws Exception {
        CompanyItems self = new CompanyItems();
        return TeaModel.build(map, self);
    }

    public CompanyItems setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public CompanyItems setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public CompanyItems setMatchingName(String matchingName) {
        this.matchingName = matchingName;
        return this;
    }
    public String getMatchingName() {
        return this.matchingName;
    }

    public CompanyItems setMatchingType(String matchingType) {
        this.matchingType = matchingType;
        return this;
    }
    public String getMatchingType() {
        return this.matchingType;
    }

    public CompanyItems setMatchingValue(String matchingValue) {
        this.matchingValue = matchingValue;
        return this;
    }
    public String getMatchingValue() {
        return this.matchingValue;
    }

    public CompanyItems setUcCode(String ucCode) {
        this.ucCode = ucCode;
        return this;
    }
    public String getUcCode() {
        return this.ucCode;
    }

}
