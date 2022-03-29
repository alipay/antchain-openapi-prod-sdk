// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TranslateMapping extends TeaModel {
    // 原始列值
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // 翻译后列值
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    // 正则类型 (完整正则或简单正则)
    @NameInMap("mode")
    @Validation(required = true)
    public String mode;

    public static TranslateMapping build(java.util.Map<String, ?> map) throws Exception {
        TranslateMapping self = new TranslateMapping();
        return TeaModel.build(map, self);
    }

    public TranslateMapping setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public TranslateMapping setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public TranslateMapping setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
