// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class QueryUserTagRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 12345678
    @NameInMap("channel_no")
    @Validation(required = true)
    public String channelNo;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户id类型
    @NameInMap("user_id_type")
    @Validation(required = true)
    public String userIdType;

    // 用户访问时生成的埋点traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static QueryUserTagRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserTagRequest self = new QueryUserTagRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserTagRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUserTagRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUserTagRequest setChannelNo(String channelNo) {
        this.channelNo = channelNo;
        return this;
    }
    public String getChannelNo() {
        return this.channelNo;
    }

    public QueryUserTagRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryUserTagRequest setUserIdType(String userIdType) {
        this.userIdType = userIdType;
        return this;
    }
    public String getUserIdType() {
        return this.userIdType;
    }

    public QueryUserTagRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
