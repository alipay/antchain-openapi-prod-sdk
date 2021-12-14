// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.notification.models;

import com.aliyun.tea.*;

public class ExportEventMetadataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 事件码
    @NameInMap("event_code")
    @Validation(required = true)
    public String eventCode;

    public static ExportEventMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportEventMetadataRequest self = new ExportEventMetadataRequest();
        return TeaModel.build(map, self);
    }

    public ExportEventMetadataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExportEventMetadataRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

}
