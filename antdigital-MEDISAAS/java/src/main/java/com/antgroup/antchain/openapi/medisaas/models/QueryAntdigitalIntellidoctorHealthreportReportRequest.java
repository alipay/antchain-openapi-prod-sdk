// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.medisaas.models;

import com.aliyun.tea.*;

public class QueryAntdigitalIntellidoctorHealthreportReportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 客户侧租户 Code
    @NameInMap("custom_code")
    @Validation(required = true)
    public String customCode;

    // 报告日期，report_type为daily:20260824;weekly:202617;monthly:202608;yearly:2026
    @NameInMap("report_date")
    @Validation(required = true)
    public String reportDate;

    // 报告类型,日/周/月/年报:daily / weekly / monthly / yearly
    @NameInMap("report_type")
    @Validation(required = true)
    public String reportType;

    // 设备ID
    @NameInMap("device_id")
    public String deviceId;

    public static QueryAntdigitalIntellidoctorHealthreportReportRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalIntellidoctorHealthreportReportRequest self = new QueryAntdigitalIntellidoctorHealthreportReportRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalIntellidoctorHealthreportReportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntdigitalIntellidoctorHealthreportReportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntdigitalIntellidoctorHealthreportReportRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAntdigitalIntellidoctorHealthreportReportRequest setCustomCode(String customCode) {
        this.customCode = customCode;
        return this;
    }
    public String getCustomCode() {
        return this.customCode;
    }

    public QueryAntdigitalIntellidoctorHealthreportReportRequest setReportDate(String reportDate) {
        this.reportDate = reportDate;
        return this;
    }
    public String getReportDate() {
        return this.reportDate;
    }

    public QueryAntdigitalIntellidoctorHealthreportReportRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public QueryAntdigitalIntellidoctorHealthreportReportRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
