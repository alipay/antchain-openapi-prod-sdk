// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class ContentInfoDto extends TeaModel {
    // 视频地址 有效期为 24 小时
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx.alipay.com/paths/xx.png">https://xxx.alipay.com/paths/xx.png</a></p>
     */
    @NameInMap("video_url")
    @Validation(required = true)
    public String videoUrl;

    // 尾帧图像 URL 有效期为 24 小时
    // 任务创建 returnLastFrame=true时返回
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx.alipay.com/paths/xx.png">https://xxx.alipay.com/paths/xx.png</a></p>
     */
    @NameInMap("last_frame_url")
    public String lastFrameUrl;

    public static ContentInfoDto build(java.util.Map<String, ?> map) throws Exception {
        ContentInfoDto self = new ContentInfoDto();
        return TeaModel.build(map, self);
    }

    public ContentInfoDto setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public ContentInfoDto setLastFrameUrl(String lastFrameUrl) {
        this.lastFrameUrl = lastFrameUrl;
        return this;
    }
    public String getLastFrameUrl() {
        return this.lastFrameUrl;
    }

}
