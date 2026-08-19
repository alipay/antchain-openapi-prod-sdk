// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qmbrain.models;

import com.aliyun.tea.*;

public class ChoiceData extends TeaModel {
    // 结束原因
    /**
     * <strong>example:</strong>
     * <p>stop</p>
     */
    @NameInMap("finish_reason")
    @Validation(required = true)
    public String finishReason;

    // 序号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("index")
    @Validation(required = true)
    public Long index;

    // 深度思考内容
    /**
     * <strong>example:</strong>
     * <p>深度思考内容</p>
     */
    @NameInMap("reasoning_content")
    public String reasoningContent;

    public static ChoiceData build(java.util.Map<String, ?> map) throws Exception {
        ChoiceData self = new ChoiceData();
        return TeaModel.build(map, self);
    }

    public ChoiceData setFinishReason(String finishReason) {
        this.finishReason = finishReason;
        return this;
    }
    public String getFinishReason() {
        return this.finishReason;
    }

    public ChoiceData setIndex(Long index) {
        this.index = index;
        return this;
    }
    public Long getIndex() {
        return this.index;
    }

    public ChoiceData setReasoningContent(String reasoningContent) {
        this.reasoningContent = reasoningContent;
        return this;
    }
    public String getReasoningContent() {
        return this.reasoningContent;
    }

}
