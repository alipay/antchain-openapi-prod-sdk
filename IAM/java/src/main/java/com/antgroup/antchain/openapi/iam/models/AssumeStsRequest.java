// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class AssumeStsRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 虚拟身份唯一名称
    @NameInMap("actor_name")
    @Validation(required = true)
    public String actorName;

    // 虚拟身份所属租户
    @NameInMap("actor_tenant")
    @Validation(required = true)
    public String actorTenant;

    // 过期时间，单位为秒，范围900-3600，默认为3600
    @NameInMap("duration_seconds")
    public Integer durationSeconds;

    // 会话名称
    @NameInMap("session_name")
    @Validation(required = true)
    public String sessionName;

    public static AssumeStsRequest build(java.util.Map<String, ?> map) throws Exception {
        AssumeStsRequest self = new AssumeStsRequest();
        return TeaModel.build(map, self);
    }

    public AssumeStsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AssumeStsRequest setActorName(String actorName) {
        this.actorName = actorName;
        return this;
    }
    public String getActorName() {
        return this.actorName;
    }

    public AssumeStsRequest setActorTenant(String actorTenant) {
        this.actorTenant = actorTenant;
        return this;
    }
    public String getActorTenant() {
        return this.actorTenant;
    }

    public AssumeStsRequest setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    public AssumeStsRequest setSessionName(String sessionName) {
        this.sessionName = sessionName;
        return this;
    }
    public String getSessionName() {
        return this.sessionName;
    }

}
