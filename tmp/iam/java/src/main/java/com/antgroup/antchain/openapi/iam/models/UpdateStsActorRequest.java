// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class UpdateStsActorRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 虚拟身份ID
    @NameInMap("actor_id")
    @Validation(required = true)
    public String actorId;

    // 针对虚拟身份的描述
    @NameInMap("description")
    public String description;

    public static UpdateStsActorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStsActorRequest self = new UpdateStsActorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStsActorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateStsActorRequest setActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }
    public String getActorId() {
        return this.actorId;
    }

    public UpdateStsActorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
