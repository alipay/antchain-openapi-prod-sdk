// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CheckPoint extends TeaModel {
    // 高度
    @NameInMap("height")
    public String height;

    // 序号
    @NameInMap("index")
    public Long index;

    // 类型
    @NameInMap("type")
    public String type;

    // last_error
    @NameInMap("last_error")
    public String lastError;

    // 错误统计
    @NameInMap("error_count")
    public Long errorCount;

    // 统计
    @NameInMap("total_count")
    public String totalCount;

    public static CheckPoint build(java.util.Map<String, ?> map) throws Exception {
        CheckPoint self = new CheckPoint();
        return TeaModel.build(map, self);
    }

    public CheckPoint setHeight(String height) {
        this.height = height;
        return this;
    }
    public String getHeight() {
        return this.height;
    }

    public CheckPoint setIndex(Long index) {
        this.index = index;
        return this;
    }
    public Long getIndex() {
        return this.index;
    }

    public CheckPoint setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CheckPoint setLastError(String lastError) {
        this.lastError = lastError;
        return this;
    }
    public String getLastError() {
        return this.lastError;
    }

    public CheckPoint setErrorCount(Long errorCount) {
        this.errorCount = errorCount;
        return this;
    }
    public Long getErrorCount() {
        return this.errorCount;
    }

    public CheckPoint setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

}
