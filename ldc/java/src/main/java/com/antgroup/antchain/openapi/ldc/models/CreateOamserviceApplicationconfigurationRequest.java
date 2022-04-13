// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateOamserviceApplicationconfigurationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // ApplicationConfiguration yaml字符串
    @NameInMap("yamlcontent")
    @Validation(required = true)
    public String yamlcontent;

    public static CreateOamserviceApplicationconfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOamserviceApplicationconfigurationRequest self = new CreateOamserviceApplicationconfigurationRequest();
        return TeaModel.build(map, self);
    }

    public CreateOamserviceApplicationconfigurationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateOamserviceApplicationconfigurationRequest setYamlcontent(String yamlcontent) {
        this.yamlcontent = yamlcontent;
        return this;
    }
    public String getYamlcontent() {
        return this.yamlcontent;
    }

}
