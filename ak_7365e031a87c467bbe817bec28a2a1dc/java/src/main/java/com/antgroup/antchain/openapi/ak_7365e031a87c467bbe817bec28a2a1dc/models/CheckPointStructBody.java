// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7365e031a87c467bbe817bec28a2a1dc.models;

import com.aliyun.tea.*;

public class CheckPointStructBody extends TeaModel {
    // 高度
    @NameInMap("height")
    public String height;

    // 序号
    @NameInMap("index")
    public String index;

    // 类型
    @NameInMap("type")
    public String type;

    // last_error
    @NameInMap("last_error")
    public String lastError;

    // 错误统计
    @NameInMap("error_count")
    public String errorCount;

    // 统计
    @NameInMap("total_count")
    public String totalCount;

    public static CheckPointStructBody build(java.util.Map<String, ?> map) throws Exception {
        CheckPointStructBody self = new CheckPointStructBody();
        return TeaModel.build(map, self);
    }

    public CheckPointStructBody setHeight(String height) {
        this.height = height;
        return this;
    }
    public String getHeight() {
        return this.height;
    }

    public CheckPointStructBody setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

    public CheckPointStructBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CheckPointStructBody setLastError(String lastError) {
        this.lastError = lastError;
        return this;
    }
    public String getLastError() {
        return this.lastError;
    }

    public CheckPointStructBody setErrorCount(String errorCount) {
        this.errorCount = errorCount;
        return this;
    }
    public String getErrorCount() {
        return this.errorCount;
    }

    public CheckPointStructBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

}
