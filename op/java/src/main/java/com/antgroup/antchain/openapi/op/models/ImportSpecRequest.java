// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ImportSpecRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // API数据描述，XML文件内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static ImportSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportSpecRequest self = new ImportSpecRequest();
        return TeaModel.build(map, self);
    }

    public ImportSpecRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportSpecRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
