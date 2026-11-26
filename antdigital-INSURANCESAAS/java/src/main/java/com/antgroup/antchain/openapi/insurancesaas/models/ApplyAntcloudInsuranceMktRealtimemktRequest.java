// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurancesaas.models;

import com.aliyun.tea.*;

public class ApplyAntcloudInsuranceMktRealtimemktRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 项目ID，待蚂蚁分配
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 加密类型，MD5，32位[小]
    @NameInMap("encryption_type")
    @Validation(required = true)
    public String encryptionType;

    // 实时营销人群列表
    @NameInMap("realtime_mkt_audience_list")
    @Validation(required = true)
    public java.util.List<RealtimeMktAudience> realtimeMktAudienceList;

    public static ApplyAntcloudInsuranceMktRealtimemktRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntcloudInsuranceMktRealtimemktRequest self = new ApplyAntcloudInsuranceMktRealtimemktRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAntcloudInsuranceMktRealtimemktRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyAntcloudInsuranceMktRealtimemktRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyAntcloudInsuranceMktRealtimemktRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ApplyAntcloudInsuranceMktRealtimemktRequest setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public String getEncryptionType() {
        return this.encryptionType;
    }

    public ApplyAntcloudInsuranceMktRealtimemktRequest setRealtimeMktAudienceList(java.util.List<RealtimeMktAudience> realtimeMktAudienceList) {
        this.realtimeMktAudienceList = realtimeMktAudienceList;
        return this;
    }
    public java.util.List<RealtimeMktAudience> getRealtimeMktAudienceList() {
        return this.realtimeMktAudienceList;
    }

}
