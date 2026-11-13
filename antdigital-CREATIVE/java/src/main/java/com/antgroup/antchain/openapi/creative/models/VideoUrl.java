// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class VideoUrl extends TeaModel {
    // 视频 URL（成功时返回）
    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/output.mp4">https://example.com/output.mp4</a></p>
     */
    @NameInMap("video_url")
    public String videoUrl;

    public static VideoUrl build(java.util.Map<String, ?> map) throws Exception {
        VideoUrl self = new VideoUrl();
        return TeaModel.build(map, self);
    }

    public VideoUrl setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
