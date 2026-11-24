// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class ExecCreativeScriptRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 待扩写的原始脚本或简要描述，复用现有文生视频的脚本扩写逻辑
    @NameInMap("prompt")
    @Validation(required = true)
    public String prompt;

    public static ExecCreativeScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecCreativeScriptRequest self = new ExecCreativeScriptRequest();
        return TeaModel.build(map, self);
    }

    public ExecCreativeScriptRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecCreativeScriptRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

}
