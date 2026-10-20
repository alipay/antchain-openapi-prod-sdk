// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryHealthLocationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 品牌方渠道标识
    @NameInMap("channel_id")
    @Validation(required = true)
    public String channelId;

    // 设备唯一id
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 预留可扩展字段
    @NameInMap("extra_info")
    public String extraInfo;

    public static QueryHealthLocationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHealthLocationRequest self = new QueryHealthLocationRequest();
        return TeaModel.build(map, self);
    }

    public QueryHealthLocationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryHealthLocationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryHealthLocationRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryHealthLocationRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryHealthLocationRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
