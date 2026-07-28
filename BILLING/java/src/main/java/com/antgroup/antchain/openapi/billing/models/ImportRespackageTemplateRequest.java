// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class ImportRespackageTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // json格式的模板内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static ImportRespackageTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportRespackageTemplateRequest self = new ImportRespackageTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ImportRespackageTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportRespackageTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
