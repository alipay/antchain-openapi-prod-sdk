// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryBatchSecurityPolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求事件编码
    @NameInMap("event_code")
    @Validation(required = true)
    public String eventCode;

    // 查询客户主体
    @NameInMap("query_keys")
    @Validation(required = true)
    public java.util.List<String> queryKeys;

    // 用户凭证类型, 手机号/身份证号/加密类型等
    @NameInMap("query_key_type")
    @Validation(required = true)
    public String queryKeyType;

    // 额外的事件属性
    @NameInMap("event_info")
    @Validation(required = true)
    public java.util.List<EventInfo> eventInfo;

    public static QueryBatchSecurityPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchSecurityPolicyRequest self = new QueryBatchSecurityPolicyRequest();
        return TeaModel.build(map, self);
    }

    public QueryBatchSecurityPolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBatchSecurityPolicyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBatchSecurityPolicyRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public QueryBatchSecurityPolicyRequest setQueryKeys(java.util.List<String> queryKeys) {
        this.queryKeys = queryKeys;
        return this;
    }
    public java.util.List<String> getQueryKeys() {
        return this.queryKeys;
    }

    public QueryBatchSecurityPolicyRequest setQueryKeyType(String queryKeyType) {
        this.queryKeyType = queryKeyType;
        return this;
    }
    public String getQueryKeyType() {
        return this.queryKeyType;
    }

    public QueryBatchSecurityPolicyRequest setEventInfo(java.util.List<EventInfo> eventInfo) {
        this.eventInfo = eventInfo;
        return this;
    }
    public java.util.List<EventInfo> getEventInfo() {
        return this.eventInfo;
    }

}
