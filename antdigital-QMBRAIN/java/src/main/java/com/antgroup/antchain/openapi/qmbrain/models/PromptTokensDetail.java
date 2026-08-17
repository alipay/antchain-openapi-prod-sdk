// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qmbrain.models;

import com.aliyun.tea.*;

public class PromptTokensDetail extends TeaModel {
    // 缓存token
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("cached_tokens")
    @Validation(required = true)
    public Long cachedTokens;

    public static PromptTokensDetail build(java.util.Map<String, ?> map) throws Exception {
        PromptTokensDetail self = new PromptTokensDetail();
        return TeaModel.build(map, self);
    }

    public PromptTokensDetail setCachedTokens(Long cachedTokens) {
        this.cachedTokens = cachedTokens;
        return this;
    }
    public Long getCachedTokens() {
        return this.cachedTokens;
    }

}
