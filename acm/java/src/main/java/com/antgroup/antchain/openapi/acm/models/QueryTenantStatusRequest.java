// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class QueryTenantStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 渠道码，接入时需要申请
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 业务场景码，接入时需要申请
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 智科租户id（支付宝会员id)
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static QueryTenantStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantStatusRequest self = new QueryTenantStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryTenantStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTenantStatusRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public QueryTenantStatusRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryTenantStatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
