// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TurnUsage extends TeaModel {
    // 对话轮次ID
    /**
     * <strong>example:</strong>
     * <p>7468486322254688256</p>
     */
    @NameInMap("turn_id")
    @Validation(required = true)
    public String turnId;

    // 该轮用量是否完整
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("complete")
    @Validation(required = true)
    public Boolean complete;

    // 模型调用明细
    /**
     * <strong>example:</strong>
     * <p>[{},{}]</p>
     */
    @NameInMap("model_calls")
    @Validation(required = true)
    public java.util.List<TurnModelCallsUsages> modelCalls;

    public static TurnUsage build(java.util.Map<String, ?> map) throws Exception {
        TurnUsage self = new TurnUsage();
        return TeaModel.build(map, self);
    }

    public TurnUsage setTurnId(String turnId) {
        this.turnId = turnId;
        return this;
    }
    public String getTurnId() {
        return this.turnId;
    }

    public TurnUsage setComplete(Boolean complete) {
        this.complete = complete;
        return this;
    }
    public Boolean getComplete() {
        return this.complete;
    }

    public TurnUsage setModelCalls(java.util.List<TurnModelCallsUsages> modelCalls) {
        this.modelCalls = modelCalls;
        return this;
    }
    public java.util.List<TurnModelCallsUsages> getModelCalls() {
        return this.modelCalls;
    }

}
