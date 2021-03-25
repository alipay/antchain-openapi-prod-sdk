// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetStsActorRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 虚拟身份ID，与虚拟身份名称两个参数二选一传入
    @NameInMap("actor_id")
    public String actorId;

    // 虚拟身份名称，与虚拟身份名称两个参数二选一传入
    @NameInMap("actor_name")
    public String actorName;

    public static GetStsActorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStsActorRequest self = new GetStsActorRequest();
        return TeaModel.build(map, self);
    }

    public GetStsActorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetStsActorRequest setActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }
    public String getActorId() {
        return this.actorId;
    }

    public GetStsActorRequest setActorName(String actorName) {
        this.actorName = actorName;
        return this;
    }
    public String getActorName() {
        return this.actorName;
    }

}
