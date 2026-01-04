// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class MultiAgentEdge extends TeaModel {
    // edge 指向的下个agent instance id
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("next_instance_id")
    @Validation(required = true)
    public String nextInstanceId;

    // 跳到next agent的prompt
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("prompt")
    @Validation(required = true)
    public String prompt;

    public static MultiAgentEdge build(java.util.Map<String, ?> map) throws Exception {
        MultiAgentEdge self = new MultiAgentEdge();
        return TeaModel.build(map, self);
    }

    public MultiAgentEdge setNextInstanceId(String nextInstanceId) {
        this.nextInstanceId = nextInstanceId;
        return this;
    }
    public String getNextInstanceId() {
        return this.nextInstanceId;
    }

    public MultiAgentEdge setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

}
