// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class CreativeRenderRes extends TeaModel {
    // 生成批次 ID
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // 生成批次状态
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("batch_status")
    @Validation(required = true)
    public String batchStatus;

    // 业务场景标识
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 业务 ID
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 创意
    @NameInMap("creative")
    @Validation(required = true)
    public Creative creative;

    // 创意集
    @NameInMap("creatives")
    public java.util.List<Creative> creatives;

    public static CreativeRenderRes build(java.util.Map<String, ?> map) throws Exception {
        CreativeRenderRes self = new CreativeRenderRes();
        return TeaModel.build(map, self);
    }

    public CreativeRenderRes setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public CreativeRenderRes setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
        return this;
    }
    public String getBatchStatus() {
        return this.batchStatus;
    }

    public CreativeRenderRes setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreativeRenderRes setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreativeRenderRes setCreative(Creative creative) {
        this.creative = creative;
        return this;
    }
    public Creative getCreative() {
        return this.creative;
    }

    public CreativeRenderRes setCreatives(java.util.List<Creative> creatives) {
        this.creatives = creatives;
        return this;
    }
    public java.util.List<Creative> getCreatives() {
        return this.creatives;
    }

}
