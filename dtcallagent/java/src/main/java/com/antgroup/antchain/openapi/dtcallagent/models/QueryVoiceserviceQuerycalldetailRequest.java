// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtcallagent.models;

import com.aliyun.tea.*;

public class QueryVoiceserviceQuerycalldetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 分配的租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 分配的业务code
    @NameInMap("instance_code")
    @Validation(required = true)
    public String instanceCode;

    // 通话的唯一识别 ID。调用外呼接口发起通话后，返回参数中会携带 CallId。
    @NameInMap("call_id")
    @Validation(required = true)
    public String callId;

    // 通话发生的时间。格式为 Unix 时间戳，单位：毫秒。
    @NameInMap("query_date")
    @Validation(required = true)
    public String queryDate;

    public static QueryVoiceserviceQuerycalldetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVoiceserviceQuerycalldetailRequest self = new QueryVoiceserviceQuerycalldetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryVoiceserviceQuerycalldetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryVoiceserviceQuerycalldetailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryVoiceserviceQuerycalldetailRequest setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
        return this;
    }
    public String getInstanceCode() {
        return this.instanceCode;
    }

    public QueryVoiceserviceQuerycalldetailRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public QueryVoiceserviceQuerycalldetailRequest setQueryDate(String queryDate) {
        this.queryDate = queryDate;
        return this;
    }
    public String getQueryDate() {
        return this.queryDate;
    }

}
