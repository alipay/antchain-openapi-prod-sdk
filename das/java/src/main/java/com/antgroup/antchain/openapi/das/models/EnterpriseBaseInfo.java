// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class EnterpriseBaseInfo extends TeaModel {
    // 机构名称
    /**
     * <strong>example:</strong>
     * <p>机构名称</p>
     */
    @NameInMap("org_name")
    @Validation(required = true)
    public String orgName;

    // 统一社会信用代码
    /**
     * <strong>example:</strong>
     * <p>统一社会信用代码</p>
     */
    @NameInMap("credit_code")
    @Validation(required = true)
    public String creditCode;

    // 企业公司注册证号
    /**
     * <strong>example:</strong>
     * <p>企业公司注册证号</p>
     */
    @NameInMap("reg_number")
    @Validation(required = true)
    public String regNumber;

    // 持股比例
    /**
     * <strong>example:</strong>
     * <p>持股比例</p>
     */
    @NameInMap("invest_rate")
    public String investRate;

    // 查询人与这家企业的关联
    /**
     * <strong>example:</strong>
     * <p>sh;lp;tm</p>
     */
    @NameInMap("relationship")
    public String relationship;

    public static EnterpriseBaseInfo build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseBaseInfo self = new EnterpriseBaseInfo();
        return TeaModel.build(map, self);
    }

    public EnterpriseBaseInfo setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public EnterpriseBaseInfo setCreditCode(String creditCode) {
        this.creditCode = creditCode;
        return this;
    }
    public String getCreditCode() {
        return this.creditCode;
    }

    public EnterpriseBaseInfo setRegNumber(String regNumber) {
        this.regNumber = regNumber;
        return this;
    }
    public String getRegNumber() {
        return this.regNumber;
    }

    public EnterpriseBaseInfo setInvestRate(String investRate) {
        this.investRate = investRate;
        return this;
    }
    public String getInvestRate() {
        return this.investRate;
    }

    public EnterpriseBaseInfo setRelationship(String relationship) {
        this.relationship = relationship;
        return this;
    }
    public String getRelationship() {
        return this.relationship;
    }

}
