// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SLSLogItem extends TeaModel {
    // 日志的时间戳（精度为秒，从 1970-1-1 00:00:00 UTC 计算起的秒数）。
    @NameInMap("log_time")
    @Validation(required = true)
    public Long logTime;

    // 日志的来源，写入日志时指定。
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 日志原始内容
    @NameInMap("contents")
    @Validation(required = true)
    public java.util.List<SLSLogContent> contents;

    public static SLSLogItem build(java.util.Map<String, ?> map) throws Exception {
        SLSLogItem self = new SLSLogItem();
        return TeaModel.build(map, self);
    }

    public SLSLogItem setLogTime(Long logTime) {
        this.logTime = logTime;
        return this;
    }
    public Long getLogTime() {
        return this.logTime;
    }

    public SLSLogItem setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SLSLogItem setContents(java.util.List<SLSLogContent> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<SLSLogContent> getContents() {
        return this.contents;
    }

}
