// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AvatarScriptConfigInfo extends TeaModel {
    // 唤醒词列表
    /**
     * <strong>example:</strong>
     * <p>[&quot;你好&quot;]</p>
     */
    @NameInMap("wake_words")
    public java.util.List<String> wakeWords;

    // 欢迎语列表
    /**
     * <strong>example:</strong>
     * <p>[&quot;你好我是数字人&quot;]</p>
     */
    @NameInMap("welcome_phrases")
    public java.util.List<String> welcomePhrases;

    // 兜底语列表
    /**
     * <strong>example:</strong>
     * <p>[&quot;对不起&quot;]</p>
     */
    @NameInMap("fallback_phrases")
    public java.util.List<String> fallbackPhrases;

    public static AvatarScriptConfigInfo build(java.util.Map<String, ?> map) throws Exception {
        AvatarScriptConfigInfo self = new AvatarScriptConfigInfo();
        return TeaModel.build(map, self);
    }

    public AvatarScriptConfigInfo setWakeWords(java.util.List<String> wakeWords) {
        this.wakeWords = wakeWords;
        return this;
    }
    public java.util.List<String> getWakeWords() {
        return this.wakeWords;
    }

    public AvatarScriptConfigInfo setWelcomePhrases(java.util.List<String> welcomePhrases) {
        this.welcomePhrases = welcomePhrases;
        return this;
    }
    public java.util.List<String> getWelcomePhrases() {
        return this.welcomePhrases;
    }

    public AvatarScriptConfigInfo setFallbackPhrases(java.util.List<String> fallbackPhrases) {
        this.fallbackPhrases = fallbackPhrases;
        return this;
    }
    public java.util.List<String> getFallbackPhrases() {
        return this.fallbackPhrases;
    }

}
