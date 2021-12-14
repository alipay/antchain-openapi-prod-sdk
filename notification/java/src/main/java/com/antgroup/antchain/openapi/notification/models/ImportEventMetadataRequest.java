// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.notification.models;

import com.aliyun.tea.*;

public class ImportEventMetadataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 元数据文本
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static ImportEventMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportEventMetadataRequest self = new ImportEventMetadataRequest();
        return TeaModel.build(map, self);
    }

    public ImportEventMetadataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportEventMetadataRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
