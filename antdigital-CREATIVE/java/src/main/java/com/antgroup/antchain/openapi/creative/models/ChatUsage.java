// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class ChatUsage extends TeaModel {
    // 输入 token 数
    /**
     * <strong>example:</strong>
     * <p>121212</p>
     */
    @NameInMap("prompt_tokens")
    public String promptTokens;

    // 输出 token 数
    /**
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("completion_tokens")
    public String completionTokens;

    // 总 token 数
    /**
     * <strong>example:</strong>
     * <p>121212</p>
     */
    @NameInMap("total_tokens")
    public String totalTokens;

    // 本次调用实际消耗金额
    /**
     * <strong>example:</strong>
     * <p>11.01</p>
     */
    @NameInMap("original_price")
    public String originalPrice;

    // 币种
    /**
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("currency")
    public String currency;

    public static ChatUsage build(java.util.Map<String, ?> map) throws Exception {
        ChatUsage self = new ChatUsage();
        return TeaModel.build(map, self);
    }

    public ChatUsage setPromptTokens(String promptTokens) {
        this.promptTokens = promptTokens;
        return this;
    }
    public String getPromptTokens() {
        return this.promptTokens;
    }

    public ChatUsage setCompletionTokens(String completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }
    public String getCompletionTokens() {
        return this.completionTokens;
    }

    public ChatUsage setTotalTokens(String totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public String getTotalTokens() {
        return this.totalTokens;
    }

    public ChatUsage setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public ChatUsage setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}
