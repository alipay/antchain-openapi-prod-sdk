// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SLSConfigSensitiveKey extends TeaModel {
    // 是否替换该字段中所有的敏感内容。建议设置为true
    @NameInMap("all")
    @Validation(required = true)
    public Boolean all;

    // 当type设置为const时必须填写
    @NameInMap("const_value")
    public String constValue;

    // 日志Key名称
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 敏感内容的前缀
    @NameInMap("regex_begin")
    @Validation(required = true)
    public String regexBegin;

    // 敏感内容正则表达式。
    @NameInMap("regex_content")
    @Validation(required = true)
    public String regexContent;

    // 脱敏方式，取值为const、md5。
    // 若取值为const，则将敏感内容替换成const字段取值内容。
    // 若取值为md5，则将敏感内容替换为其对应的MD5值。
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static SLSConfigSensitiveKey build(java.util.Map<String, ?> map) throws Exception {
        SLSConfigSensitiveKey self = new SLSConfigSensitiveKey();
        return TeaModel.build(map, self);
    }

    public SLSConfigSensitiveKey setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public SLSConfigSensitiveKey setConstValue(String constValue) {
        this.constValue = constValue;
        return this;
    }
    public String getConstValue() {
        return this.constValue;
    }

    public SLSConfigSensitiveKey setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SLSConfigSensitiveKey setRegexBegin(String regexBegin) {
        this.regexBegin = regexBegin;
        return this;
    }
    public String getRegexBegin() {
        return this.regexBegin;
    }

    public SLSConfigSensitiveKey setRegexContent(String regexContent) {
        this.regexContent = regexContent;
        return this;
    }
    public String getRegexContent() {
        return this.regexContent;
    }

    public SLSConfigSensitiveKey setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
