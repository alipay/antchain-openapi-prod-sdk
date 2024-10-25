// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class VideoTask extends TeaModel {
    // RUNNING, COMPLETE,FAIL
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 完成状态，会返回视频地址
    @NameInMap("video_url")
    public String videoUrl;

    // 视频时长
    @NameInMap("video_duration")
    public Long videoDuration;

    public static VideoTask build(java.util.Map<String, ?> map) throws Exception {
        VideoTask self = new VideoTask();
        return TeaModel.build(map, self);
    }

    public VideoTask setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public VideoTask setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public VideoTask setVideoDuration(Long videoDuration) {
        this.videoDuration = videoDuration;
        return this;
    }
    public Long getVideoDuration() {
        return this.videoDuration;
    }

}
