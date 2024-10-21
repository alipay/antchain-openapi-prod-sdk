// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ReportInfo extends TeaModel {
    // 项目报告ID
    @NameInMap("report_id")
    @Validation(required = true)
    public String reportId;

    // 项目报告名
    @NameInMap("report_name")
    @Validation(required = true)
    public String reportName;

    // 报告文件ID
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 项目报告创建时间戳
    @NameInMap("gmt_created")
    @Validation(required = true)
    public Long gmtCreated;

    public static ReportInfo build(java.util.Map<String, ?> map) throws Exception {
        ReportInfo self = new ReportInfo();
        return TeaModel.build(map, self);
    }

    public ReportInfo setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public ReportInfo setReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }
    public String getReportName() {
        return this.reportName;
    }

    public ReportInfo setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ReportInfo setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

}
