// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiconumdecision.models;

import com.aliyun.tea.*;

public class QueryAntcloudDtcallagentVoiceinspectionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户 ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 业务空间实例编码
    @NameInMap("instance_code")
    @Validation(required = true)
    public String instanceCode;

    // execute 接口返回的质检记录 ID
    @NameInMap("qc_record_id")
    @Validation(required = true)
    public String qcRecordId;

    public static QueryAntcloudDtcallagentVoiceinspectionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudDtcallagentVoiceinspectionRequest self = new QueryAntcloudDtcallagentVoiceinspectionRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudDtcallagentVoiceinspectionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudDtcallagentVoiceinspectionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntcloudDtcallagentVoiceinspectionRequest setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
        return this;
    }
    public String getInstanceCode() {
        return this.instanceCode;
    }

    public QueryAntcloudDtcallagentVoiceinspectionRequest setQcRecordId(String qcRecordId) {
        this.qcRecordId = qcRecordId;
        return this;
    }
    public String getQcRecordId() {
        return this.qcRecordId;
    }

}
