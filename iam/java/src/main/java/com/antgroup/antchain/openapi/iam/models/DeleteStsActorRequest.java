// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class DeleteStsActorRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 虚拟身份ID，与虚拟身份名称两个参数二选一传入
    @NameInMap("actor_id")
    public String actorId;

    // 虚拟身份名称，与虚拟身份名称两个参数二选一传入
    @NameInMap("actor_name")
    public String actorName;

    public static DeleteStsActorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStsActorRequest self = new DeleteStsActorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStsActorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteStsActorRequest setActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }
    public String getActorId() {
        return this.actorId;
    }

    public DeleteStsActorRequest setActorName(String actorName) {
        this.actorName = actorName;
        return this;
    }
    public String getActorName() {
        return this.actorName;
    }

}
