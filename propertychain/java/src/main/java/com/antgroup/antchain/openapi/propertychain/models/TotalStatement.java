// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class TotalStatement extends TeaModel {
    // 企业编号
    @NameInMap("company_no")
    @Validation(required = true)
    public String companyNo;

    // 记账日期 yyyy-mm-dd
    @NameInMap("account_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String accountDate;

    // 总分润金额
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 风险承担方金额
    @NameInMap("risk_taker")
    @Validation(required = true)
    public Long riskTaker;

    // 货物监管方金额
    @NameInMap("cargo_supervision")
    @Validation(required = true)
    public Long cargoSupervision;

    // 资金推荐方金额
    @NameInMap("capital_recommend")
    @Validation(required = true)
    public Long capitalRecommend;

    // 融资推荐方金额
    @NameInMap("funder_recommend")
    @Validation(required = true)
    public Long funderRecommend;

    // 运营管理方金额
    @NameInMap("management")
    @Validation(required = true)
    public Long management;

    // 技术支持方金额
    @NameInMap("technical")
    @Validation(required = true)
    public Long technical;

    public static TotalStatement build(java.util.Map<String, ?> map) throws Exception {
        TotalStatement self = new TotalStatement();
        return TeaModel.build(map, self);
    }

    public TotalStatement setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
        return this;
    }
    public String getCompanyNo() {
        return this.companyNo;
    }

    public TotalStatement setAccountDate(String accountDate) {
        this.accountDate = accountDate;
        return this;
    }
    public String getAccountDate() {
        return this.accountDate;
    }

    public TotalStatement setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public TotalStatement setRiskTaker(Long riskTaker) {
        this.riskTaker = riskTaker;
        return this;
    }
    public Long getRiskTaker() {
        return this.riskTaker;
    }

    public TotalStatement setCargoSupervision(Long cargoSupervision) {
        this.cargoSupervision = cargoSupervision;
        return this;
    }
    public Long getCargoSupervision() {
        return this.cargoSupervision;
    }

    public TotalStatement setCapitalRecommend(Long capitalRecommend) {
        this.capitalRecommend = capitalRecommend;
        return this;
    }
    public Long getCapitalRecommend() {
        return this.capitalRecommend;
    }

    public TotalStatement setFunderRecommend(Long funderRecommend) {
        this.funderRecommend = funderRecommend;
        return this;
    }
    public Long getFunderRecommend() {
        return this.funderRecommend;
    }

    public TotalStatement setManagement(Long management) {
        this.management = management;
        return this;
    }
    public Long getManagement() {
        return this.management;
    }

    public TotalStatement setTechnical(Long technical) {
        this.technical = technical;
        return this;
    }
    public Long getTechnical() {
        return this.technical;
    }

}
