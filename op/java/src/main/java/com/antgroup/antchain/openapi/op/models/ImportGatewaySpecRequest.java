// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ImportGatewaySpecRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // API数据描述，XML文件内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static ImportGatewaySpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportGatewaySpecRequest self = new ImportGatewaySpecRequest();
        return TeaModel.build(map, self);
    }

    public ImportGatewaySpecRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportGatewaySpecRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
