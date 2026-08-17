// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qmbrain.models;

import com.aliyun.tea.*;

public class UsageData extends TeaModel {
    // 输出消耗
    /**
     * <strong>example:</strong>
     * <p>38</p>
     */
    @NameInMap("completion_tokens")
    @Validation(required = true)
    public Long completionTokens;

    // 输入消耗
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("prompt_tokens")
    @Validation(required = true)
    public Long promptTokens;

    // 总计消耗
    /**
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("total_tokens")
    @Validation(required = true)
    public Long totalTokens;

    // 请求token详情
    /**
     * <strong>example:</strong>
     * <p>{       &quot;cached_tokens&quot;: 0     }</p>
     */
    @NameInMap("prompt_tokens_details")
    @Validation(required = true)
    public PromptTokensDetail promptTokensDetails;

    public static UsageData build(java.util.Map<String, ?> map) throws Exception {
        UsageData self = new UsageData();
        return TeaModel.build(map, self);
    }

    public UsageData setCompletionTokens(Long completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }
    public Long getCompletionTokens() {
        return this.completionTokens;
    }

    public UsageData setPromptTokens(Long promptTokens) {
        this.promptTokens = promptTokens;
        return this;
    }
    public Long getPromptTokens() {
        return this.promptTokens;
    }

    public UsageData setTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public Long getTotalTokens() {
        return this.totalTokens;
    }

    public UsageData setPromptTokensDetails(PromptTokensDetail promptTokensDetails) {
        this.promptTokensDetails = promptTokensDetails;
        return this;
    }
    public PromptTokensDetail getPromptTokensDetails() {
        return this.promptTokensDetails;
    }

}
