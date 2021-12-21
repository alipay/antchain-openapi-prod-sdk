// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CodeCirculation extends TeaModel {
    // 正版码的编码
    @NameInMap("code")
    public String code;

    // 流转信息标题
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 流转详细信息
    @NameInMap("content")
    public String content;

    // 哈希值
    @NameInMap("hash")
    public String hash;

    // 流转时间
    @NameInMap("time")
    public Long time;

    public static CodeCirculation build(java.util.Map<String, ?> map) throws Exception {
        CodeCirculation self = new CodeCirculation();
        return TeaModel.build(map, self);
    }

    public CodeCirculation setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CodeCirculation setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CodeCirculation setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CodeCirculation setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public CodeCirculation setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

}
