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

    // 字幕时间戳信息
    @NameInMap("captions_info")
    public CaptionsInfo captionsInfo;

    // 短视频生成失败原因
    @NameInMap("fail_reason")
    public String failReason;

    // 错误码
    @NameInMap("error_code")
    public String errorCode;

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

    public VideoTask setCaptionsInfo(CaptionsInfo captionsInfo) {
        this.captionsInfo = captionsInfo;
        return this;
    }
    public CaptionsInfo getCaptionsInfo() {
        return this.captionsInfo;
    }

    public VideoTask setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public VideoTask setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

}
