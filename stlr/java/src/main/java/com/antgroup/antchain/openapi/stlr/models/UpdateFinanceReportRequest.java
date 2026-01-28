// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class UpdateFinanceReportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 报告单号
    @NameInMap("report_no")
    @Validation(required = true)
    public String reportNo;

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

    public UpdateFinanceReportRequest setReportNo(String reportNo) {
        this.reportNo = reportNo;
        return this;
    }
    public String getReportNo() {
        return this.reportNo;
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

}
