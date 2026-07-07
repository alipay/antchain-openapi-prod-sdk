// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class ListFinanceReportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 银行碳账户
    @NameInMap("enterprise_no")
    @Validation(required = true)
    public String enterpriseNo;

    // 企业统一信用代码或者项目id
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    // 报告年，当前年，对比年
    @NameInMap("compare_year")
    @Validation(required = true)
    public String compareYear;

    // 基准年，被对比年
    @NameInMap("base_year")
    @Validation(required = true)
    public String baseYear;

    public static ListFinanceReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFinanceReportRequest self = new ListFinanceReportRequest();
        return TeaModel.build(map, self);
    }

    public ListFinanceReportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListFinanceReportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListFinanceReportRequest setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo;
        return this;
    }
    public String getEnterpriseNo() {
        return this.enterpriseNo;
    }

    public ListFinanceReportRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public ListFinanceReportRequest setCompareYear(String compareYear) {
        this.compareYear = compareYear;
        return this;
    }
    public String getCompareYear() {
        return this.compareYear;
    }

    public ListFinanceReportRequest setBaseYear(String baseYear) {
        this.baseYear = baseYear;
        return this;
    }
    public String getBaseYear() {
        return this.baseYear;
    }

}
