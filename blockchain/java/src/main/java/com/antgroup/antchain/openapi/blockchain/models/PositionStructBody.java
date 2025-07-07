// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PositionStructBody extends TeaModel {
    // 错误计数
    /**
     * <strong>example:</strong>
     * <p>&quot;1&quot;</p>
     */
    @NameInMap("error_count")
    public String errorCount;

    // 高度
    /**
     * <strong>example:</strong>
     * <p>&quot;10&quot;</p>
     */
    @NameInMap("height")
    public String height;

    // 序号
    /**
     * <strong>example:</strong>
     * <p>“1”</p>
     */
    @NameInMap("index")
    public String index;

    // 最后一个错误
    /**
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("last_error")
    public String lastError;

    // 类型
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("type")
    public String type;

    public static PositionStructBody build(java.util.Map<String, ?> map) throws Exception {
        PositionStructBody self = new PositionStructBody();
        return TeaModel.build(map, self);
    }

    public PositionStructBody setErrorCount(String errorCount) {
        this.errorCount = errorCount;
        return this;
    }
    public String getErrorCount() {
        return this.errorCount;
    }

    public PositionStructBody setHeight(String height) {
        this.height = height;
        return this;
    }
    public String getHeight() {
        return this.height;
    }

    public PositionStructBody setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

    public PositionStructBody setLastError(String lastError) {
        this.lastError = lastError;
        return this;
    }
    public String getLastError() {
        return this.lastError;
    }

    public PositionStructBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
