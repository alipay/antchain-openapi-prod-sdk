// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class AgentChatResponse extends TeaModel {
    // 是否结束
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 对话data数据
    @NameInMap("data")
    @Validation(required = true)
    public AgentChatData data;

    public static AgentChatResponse build(java.util.Map<String, ?> map) throws Exception {
        AgentChatResponse self = new AgentChatResponse();
        return TeaModel.build(map, self);
    }

    public AgentChatResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AgentChatResponse setData(AgentChatData data) {
        this.data = data;
        return this;
    }
    public AgentChatData getData() {
        return this.data;
    }

}
