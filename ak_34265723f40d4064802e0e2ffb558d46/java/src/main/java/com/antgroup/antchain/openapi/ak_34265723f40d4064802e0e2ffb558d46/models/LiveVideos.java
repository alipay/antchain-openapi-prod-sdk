// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_34265723f40d4064802e0e2ffb558d46.models;

import com.aliyun.tea.*;

public class LiveVideos extends TeaModel {
    // 蚂蚁数字人平台直播id
    @NameInMap("live_id")
    @Validation(required = true)
    public String liveId;

    // 场景id
    @NameInMap("scene_id")
    @Validation(required = true)
    public String sceneId;

    // 视频片段id
    @NameInMap("section_id")
    @Validation(required = true)
    public String sectionId;

    // 视频地址
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 是否插播，默认false
    @NameInMap("temp_video")
    @Validation(required = true)
    public Boolean tempVideo;

    // 触发插播行为的时间戳，当isTemp为true时，存在该值
    @NameInMap("occurrence_time_stamp")
    public Long occurrenceTimeStamp;

    // 视频类型（start欢迎语、end结束、trans转场、normal普通、temporary评论插播）
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 视频剧本
    @NameInMap("text")
    @Validation(required = true)
    public String text;

    public static LiveVideos build(java.util.Map<String, ?> map) throws Exception {
        LiveVideos self = new LiveVideos();
        return TeaModel.build(map, self);
    }

    public LiveVideos setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public LiveVideos setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public LiveVideos setSectionId(String sectionId) {
        this.sectionId = sectionId;
        return this;
    }
    public String getSectionId() {
        return this.sectionId;
    }

    public LiveVideos setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public LiveVideos setTempVideo(Boolean tempVideo) {
        this.tempVideo = tempVideo;
        return this;
    }
    public Boolean getTempVideo() {
        return this.tempVideo;
    }

    public LiveVideos setOccurrenceTimeStamp(Long occurrenceTimeStamp) {
        this.occurrenceTimeStamp = occurrenceTimeStamp;
        return this;
    }
    public Long getOccurrenceTimeStamp() {
        return this.occurrenceTimeStamp;
    }

    public LiveVideos setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public LiveVideos setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
