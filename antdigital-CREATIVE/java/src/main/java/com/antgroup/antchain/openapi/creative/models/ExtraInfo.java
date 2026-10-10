// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class ExtraInfo extends TeaModel {
    // 原厂任务ID
    /**
     * <strong>example:</strong>
     * <p>xxx-xxx-xxx</p>
     */
    @NameInMap("original_task_id")
    public String originalTaskId;

    // 原厂视频输出URL
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx">https://xxx</a></p>
     */
    @NameInMap("original_video_url")
    public String originalVideoUrl;

    // 原厂响应体快照
    /**
     * <strong>example:</strong>
     * <p>&quot;{&quot;task_id&quot;:&quot;csg-xxx-xx&quot;...}&quot;</p>
     */
    @NameInMap("original_response_snapshot")
    public String originalResponseSnapshot;

    public static ExtraInfo build(java.util.Map<String, ?> map) throws Exception {
        ExtraInfo self = new ExtraInfo();
        return TeaModel.build(map, self);
    }

    public ExtraInfo setOriginalTaskId(String originalTaskId) {
        this.originalTaskId = originalTaskId;
        return this;
    }
    public String getOriginalTaskId() {
        return this.originalTaskId;
    }

    public ExtraInfo setOriginalVideoUrl(String originalVideoUrl) {
        this.originalVideoUrl = originalVideoUrl;
        return this;
    }
    public String getOriginalVideoUrl() {
        return this.originalVideoUrl;
    }

    public ExtraInfo setOriginalResponseSnapshot(String originalResponseSnapshot) {
        this.originalResponseSnapshot = originalResponseSnapshot;
        return this;
    }
    public String getOriginalResponseSnapshot() {
        return this.originalResponseSnapshot;
    }

}
