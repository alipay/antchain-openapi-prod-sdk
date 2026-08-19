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

    // 消息内容
    /**
     * <strong>example:</strong>
     * <p>{&quot;content&quot;:&quot;你好！我是一个由Z.ai训练的大型语言模型（GLM）。我可以回答问题、提供信息、协助写作、翻译以及编写代码等。请问有什么我可以帮你的吗？&quot;,&quot;role&quot;:&quot;assistant&quot;}}</p>
     */
    @NameInMap("message")
    @Validation(required = true)
    public ChatMessage message;

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

    public ChoiceData setMessage(ChatMessage message) {
        this.message = message;
        return this;
    }
    public ChatMessage getMessage() {
        return this.message;
    }

}
