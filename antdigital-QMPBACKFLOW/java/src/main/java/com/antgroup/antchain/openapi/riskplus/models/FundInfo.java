// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class FundInfo extends TeaModel {
    // 资金方编号
    /**
     * <strong>example:</strong>
     * <p>D20250701000000001</p>
     */
    @NameInMap("fund_code")
    @Validation(required = true)
    public String fundCode;

    // 资金方简称
    /**
     * <strong>example:</strong>
     * <p>科融</p>
     */
    @NameInMap("abbre_fund_name")
    @Validation(required = true)
    public String abbreFundName;

    // 额度状态
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("credit_status")
    @Validation(required = true)
    public String creditStatus;

    // 授信总额度
    /**
     * <strong>example:</strong>
     * <p>200000</p>
     */
    @NameInMap("credit_amount")
    public String creditAmount;

    // 剩余可用余额
    /**
     * <strong>example:</strong>
     * <p>200000</p>
     */
    @NameInMap("rest_amount")
    public String restAmount;

    // 年利率
    /**
     * <strong>example:</strong>
     * <p>0.1250</p>
     */
    @NameInMap("year_interest_rate")
    public String yearInterestRate;

    public static FundInfo build(java.util.Map<String, ?> map) throws Exception {
        FundInfo self = new FundInfo();
        return TeaModel.build(map, self);
    }

    public FundInfo setFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }
    public String getFundCode() {
        return this.fundCode;
    }

    public FundInfo setAbbreFundName(String abbreFundName) {
        this.abbreFundName = abbreFundName;
        return this;
    }
    public String getAbbreFundName() {
        return this.abbreFundName;
    }

    public FundInfo setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
        return this;
    }
    public String getCreditStatus() {
        return this.creditStatus;
    }

    public FundInfo setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public String getCreditAmount() {
        return this.creditAmount;
    }

    public FundInfo setRestAmount(String restAmount) {
        this.restAmount = restAmount;
        return this;
    }
    public String getRestAmount() {
        return this.restAmount;
    }

    public FundInfo setYearInterestRate(String yearInterestRate) {
        this.yearInterestRate = yearInterestRate;
        return this;
    }
    public String getYearInterestRate() {
        return this.yearInterestRate;
    }

}
