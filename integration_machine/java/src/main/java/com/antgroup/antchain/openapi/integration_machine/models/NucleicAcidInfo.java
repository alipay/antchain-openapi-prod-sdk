// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class NucleicAcidInfo extends TeaModel {
    // 检测类型
    @NameInMap("report_type")
    public String reportType;

    // 检测结果
    @NameInMap("report_result")
    public String reportResult;

    // 检测机构
    @NameInMap("report_organization")
    public String reportOrganization;

    // 检测时间戳(单位: ms)
    @NameInMap("report_timestamp")
    public Long reportTimestamp;

    public static NucleicAcidInfo build(java.util.Map<String, ?> map) throws Exception {
        NucleicAcidInfo self = new NucleicAcidInfo();
        return TeaModel.build(map, self);
    }

    public NucleicAcidInfo setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public NucleicAcidInfo setReportResult(String reportResult) {
        this.reportResult = reportResult;
        return this;
    }
    public String getReportResult() {
        return this.reportResult;
    }

    public NucleicAcidInfo setReportOrganization(String reportOrganization) {
        this.reportOrganization = reportOrganization;
        return this;
    }
    public String getReportOrganization() {
        return this.reportOrganization;
    }

    public NucleicAcidInfo setReportTimestamp(Long reportTimestamp) {
        this.reportTimestamp = reportTimestamp;
        return this;
    }
    public Long getReportTimestamp() {
        return this.reportTimestamp;
    }

}
