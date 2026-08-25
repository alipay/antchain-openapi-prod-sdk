// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.skintellidoctor.models;

import com.aliyun.tea.*;

public class QueryAntdigitalIntellidoctorReportHealthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 报告日期
    @NameInMap("report_date")
    @Validation(required = true)
    public String reportDate;

    // 报告类型
    @NameInMap("report_type")
    @Validation(required = true)
    public String reportType;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 客户租户code
    @NameInMap("custom_code")
    @Validation(required = true)
    public String customCode;

    // 设备ID
    @NameInMap("device_id")
    public String deviceId;

    public static QueryAntdigitalIntellidoctorReportHealthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalIntellidoctorReportHealthRequest self = new QueryAntdigitalIntellidoctorReportHealthRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalIntellidoctorReportHealthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntdigitalIntellidoctorReportHealthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntdigitalIntellidoctorReportHealthRequest setReportDate(String reportDate) {
        this.reportDate = reportDate;
        return this;
    }
    public String getReportDate() {
        return this.reportDate;
    }

    public QueryAntdigitalIntellidoctorReportHealthRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public QueryAntdigitalIntellidoctorReportHealthRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAntdigitalIntellidoctorReportHealthRequest setCustomCode(String customCode) {
        this.customCode = customCode;
        return this;
    }
    public String getCustomCode() {
        return this.customCode;
    }

    public QueryAntdigitalIntellidoctorReportHealthRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
