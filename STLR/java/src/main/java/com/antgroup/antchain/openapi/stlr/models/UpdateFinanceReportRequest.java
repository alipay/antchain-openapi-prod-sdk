// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class UpdateFinanceReportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 银行碳账号
    @NameInMap("enterprise_no")
    @Validation(required = true)
    public String enterpriseNo;

    // 报告盖章人
    @NameInMap("report_singer")
    @Validation(required = true)
    public String reportSinger;

    // 可以直接公网可以下载的oss地址
    @NameInMap("report_oss_url")
    @Validation(required = true)
    public String reportOssUrl;

    // 社会统一信用参数
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    // 是否盖章
    @NameInMap("is_seal")
    @Validation(required = true)
    public Boolean isSeal;

    // 报告年份
    @NameInMap("report_year")
    @Validation(required = true)
    public String reportYear;

    // 基准年份
    @NameInMap("base_year")
    @Validation(required = true)
    public String baseYear;

    public static UpdateFinanceReportRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFinanceReportRequest self = new UpdateFinanceReportRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFinanceReportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateFinanceReportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateFinanceReportRequest setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo;
        return this;
    }
    public String getEnterpriseNo() {
        return this.enterpriseNo;
    }

    public UpdateFinanceReportRequest setReportSinger(String reportSinger) {
        this.reportSinger = reportSinger;
        return this;
    }
    public String getReportSinger() {
        return this.reportSinger;
    }

    public UpdateFinanceReportRequest setReportOssUrl(String reportOssUrl) {
        this.reportOssUrl = reportOssUrl;
        return this;
    }
    public String getReportOssUrl() {
        return this.reportOssUrl;
    }

    public UpdateFinanceReportRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public UpdateFinanceReportRequest setIsSeal(Boolean isSeal) {
        this.isSeal = isSeal;
        return this;
    }
    public Boolean getIsSeal() {
        return this.isSeal;
    }

    public UpdateFinanceReportRequest setReportYear(String reportYear) {
        this.reportYear = reportYear;
        return this;
    }
    public String getReportYear() {
        return this.reportYear;
    }

    public UpdateFinanceReportRequest setBaseYear(String baseYear) {
        this.baseYear = baseYear;
        return this;
    }
    public String getBaseYear() {
        return this.baseYear;
    }

}
