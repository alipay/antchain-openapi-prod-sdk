// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class FavoritesIotagentMusicRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能体 ID，与client_id至少填1项
    @NameInMap("agent_id")
    public String agentId;

    // 客户端 ID，与agent_id至少填1项
    @NameInMap("client_id")
    public String clientId;

    // 返回条数，默认 30
    @NameInMap("limit")
    public Long limit;

    // 偏移量，默认 0
    @NameInMap("offset")
    public Long offset;

    public static FavoritesIotagentMusicRequest build(java.util.Map<String, ?> map) throws Exception {
        FavoritesIotagentMusicRequest self = new FavoritesIotagentMusicRequest();
        return TeaModel.build(map, self);
    }

    public FavoritesIotagentMusicRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FavoritesIotagentMusicRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FavoritesIotagentMusicRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public FavoritesIotagentMusicRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public FavoritesIotagentMusicRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public FavoritesIotagentMusicRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

}
