// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class ExecAntcloudMarketingagentCreativeScriptexpandRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 待扩写的原始脚本或简要描述
    @NameInMap("prompt")
    @Validation(required = true)
    public String prompt;

    public static ExecAntcloudMarketingagentCreativeScriptexpandRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudMarketingagentCreativeScriptexpandRequest self = new ExecAntcloudMarketingagentCreativeScriptexpandRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudMarketingagentCreativeScriptexpandRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntcloudMarketingagentCreativeScriptexpandRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

}
