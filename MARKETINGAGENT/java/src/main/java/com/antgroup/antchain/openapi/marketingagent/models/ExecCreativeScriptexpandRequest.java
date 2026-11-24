// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class ExecCreativeScriptexpandRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 待扩写的原始脚本或简要描述
    @NameInMap("prompt")
    @Validation(required = true)
    public String prompt;

    public static ExecCreativeScriptexpandRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecCreativeScriptexpandRequest self = new ExecCreativeScriptexpandRequest();
        return TeaModel.build(map, self);
    }

    public ExecCreativeScriptexpandRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecCreativeScriptexpandRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

}
