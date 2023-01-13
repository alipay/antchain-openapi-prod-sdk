// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class TriggerCheckpoint extends TeaModel {
    // 当前处理的高度
    @NameInMap("height")
    public Long height;

    // 检查点偏移量
    @NameInMap("index")
    public Long index;

    // 检查点的类型
    @NameInMap("type")
    public String type;

    // 最近的错误信息
    @NameInMap("last_error")
    public String lastError;

    // 错误计数
    @NameInMap("error_count")
    public Long errorCount;

    // 推送的事件数量
    @NameInMap("total_count")
    public Long totalCount;

    public static TriggerCheckpoint build(java.util.Map<String, ?> map) throws Exception {
        TriggerCheckpoint self = new TriggerCheckpoint();
        return TeaModel.build(map, self);
    }

    public TriggerCheckpoint setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public TriggerCheckpoint setIndex(Long index) {
        this.index = index;
        return this;
    }
    public Long getIndex() {
        return this.index;
    }

    public TriggerCheckpoint setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public TriggerCheckpoint setLastError(String lastError) {
        this.lastError = lastError;
        return this;
    }
    public String getLastError() {
        return this.lastError;
    }

    public TriggerCheckpoint setErrorCount(Long errorCount) {
        this.errorCount = errorCount;
        return this;
    }
    public Long getErrorCount() {
        return this.errorCount;
    }

    public TriggerCheckpoint setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
