// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class AuthenticateBatchEvent extends TeaModel {
    // 鉴权事件列表
    @NameInMap("events")
    @Validation(required = true)
    public java.util.List<AuthenticateEvent> events;

    public static AuthenticateBatchEvent build(java.util.Map<String, ?> map) throws Exception {
        AuthenticateBatchEvent self = new AuthenticateBatchEvent();
        return TeaModel.build(map, self);
    }

    public AuthenticateBatchEvent setEvents(java.util.List<AuthenticateEvent> events) {
        this.events = events;
        return this;
    }
    public java.util.List<AuthenticateEvent> getEvents() {
        return this.events;
    }

}
