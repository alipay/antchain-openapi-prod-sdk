// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class VideoOutput extends TeaModel {
    // 产物类型
    /**
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("type")
    public String type;

    // 可下载的视频地址
    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/result.mp4">https://example.com/result.mp4</a></p>
     */
    @NameInMap("url")
    public String url;

    // 产物 ID
    /**
     * <strong>example:</strong>
     * <p>video-001</p>
     */
    @NameInMap("id")
    public String id;

    // 实际视频时长，单位秒
    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("duration")
    public Long duration;

    // URL 过期时间，毫秒时间戳；能确定时返回
    /**
     * <strong>example:</strong>
     * <p>1790000000000</p>
     */
    @NameInMap("expire_time")
    public Long expireTime;

    public static VideoOutput build(java.util.Map<String, ?> map) throws Exception {
        VideoOutput self = new VideoOutput();
        return TeaModel.build(map, self);
    }

    public VideoOutput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public VideoOutput setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public VideoOutput setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public VideoOutput setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public VideoOutput setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

}
