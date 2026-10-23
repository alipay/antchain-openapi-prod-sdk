// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class AssistantExtra extends TeaModel {
    // 任务id
    /**
     * <strong>example:</strong>
     * <p>M_d3f7859e845a4ed58bedc446fec32427</p>
     */
    @NameInMap("task_id")
    public String taskId;

    // 生图状态
    /**
     * <strong>example:</strong>
     * <p>PROCESSING</p>
     */
    @NameInMap("render_status")
    public String renderStatus;

    // 生图结果
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("result_url")
    public java.util.List<String> resultUrl;

    // 基金长图子图列表，仅在 return_sub_images 为 true 且长图生成完成时返回。
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("sub_images")
    public java.util.List<LongImageSegment> subImages;

    public static AssistantExtra build(java.util.Map<String, ?> map) throws Exception {
        AssistantExtra self = new AssistantExtra();
        return TeaModel.build(map, self);
    }

    public AssistantExtra setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AssistantExtra setRenderStatus(String renderStatus) {
        this.renderStatus = renderStatus;
        return this;
    }
    public String getRenderStatus() {
        return this.renderStatus;
    }

    public AssistantExtra setResultUrl(java.util.List<String> resultUrl) {
        this.resultUrl = resultUrl;
        return this;
    }
    public java.util.List<String> getResultUrl() {
        return this.resultUrl;
    }

    public AssistantExtra setSubImages(java.util.List<LongImageSegment> subImages) {
        this.subImages = subImages;
        return this;
    }
    public java.util.List<LongImageSegment> getSubImages() {
        return this.subImages;
    }

}
