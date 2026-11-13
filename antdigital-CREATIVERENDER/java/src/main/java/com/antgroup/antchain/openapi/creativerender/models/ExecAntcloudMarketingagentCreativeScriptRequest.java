// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class ExecAntcloudMarketingagentCreativeScriptRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 待扩写的原始脚本或简要描述，复用现有文生视频的脚本扩写逻辑
    @NameInMap("prompt")
    @Validation(required = true)
    public String prompt;

    public static ExecAntcloudMarketingagentCreativeScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudMarketingagentCreativeScriptRequest self = new ExecAntcloudMarketingagentCreativeScriptRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudMarketingagentCreativeScriptRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntcloudMarketingagentCreativeScriptRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

}
