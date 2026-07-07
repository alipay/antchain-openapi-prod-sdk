// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class CreateFinanceReportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 银行碳账户
    @NameInMap("enterprise_no")
    @Validation(required = true)
    public String enterpriseNo;

    // 企业社会统一信用编码
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    // 对比年
    @NameInMap("compare_year")
    @Validation(required = true)
    public String compareYear;

    // 基准年份
    @NameInMap("base_year")
    @Validation(required = true)
    public String baseYear;

    // 转型路径分析
    @NameInMap("transfer_path_analysis_list")
    @Validation(required = true)
    public java.util.List<TransferPathAnalysis> transferPathAnalysisList;

    public static CreateFinanceReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFinanceReportRequest self = new CreateFinanceReportRequest();
        return TeaModel.build(map, self);
    }

    public CreateFinanceReportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFinanceReportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateFinanceReportRequest setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo;
        return this;
    }
    public String getEnterpriseNo() {
        return this.enterpriseNo;
    }

    public CreateFinanceReportRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public CreateFinanceReportRequest setCompareYear(String compareYear) {
        this.compareYear = compareYear;
        return this;
    }
    public String getCompareYear() {
        return this.compareYear;
    }

    public CreateFinanceReportRequest setBaseYear(String baseYear) {
        this.baseYear = baseYear;
        return this;
    }
    public String getBaseYear() {
        return this.baseYear;
    }

    public CreateFinanceReportRequest setTransferPathAnalysisList(java.util.List<TransferPathAnalysis> transferPathAnalysisList) {
        this.transferPathAnalysisList = transferPathAnalysisList;
        return this;
    }
    public java.util.List<TransferPathAnalysis> getTransferPathAnalysisList() {
        return this.transferPathAnalysisList;
    }

}
