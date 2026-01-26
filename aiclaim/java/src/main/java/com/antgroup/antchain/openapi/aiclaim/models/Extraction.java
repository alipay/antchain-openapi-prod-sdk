// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiclaim.models;

import com.aliyun.tea.*;

public class Extraction extends TeaModel {
    // 提取出的具体信息的基类，不同类型的影像材料，有不同的数据结构，下文会详细展开。不同的sub_type映射不同的BaseExtractionData子类。
    @NameInMap("data")
    public BaseExtractionData data;

    // 失败原因(失败时填写)，成功时为null
    /**
     * <strong>example:</strong>
     * <p>category_not_supported</p>
     */
    @NameInMap("failure_reason")
    public String failureReason;

    // 提取状态: success/not_supported
    /**
     * <strong>example:</strong>
     * <p>not_supported</p>
     */
    @NameInMap("status")
    public String status;

    public static Extraction build(java.util.Map<String, ?> map) throws Exception {
        Extraction self = new Extraction();
        return TeaModel.build(map, self);
    }

    public Extraction setData(BaseExtractionData data) {
        this.data = data;
        return this;
    }
    public BaseExtractionData getData() {
        return this.data;
    }

    public Extraction setFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }
    public String getFailureReason() {
        return this.failureReason;
    }

    public Extraction setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
