// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeleteDeploymentTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 模板编码
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static DeleteDeploymentTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentTemplateRequest self = new DeleteDeploymentTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDeploymentTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
