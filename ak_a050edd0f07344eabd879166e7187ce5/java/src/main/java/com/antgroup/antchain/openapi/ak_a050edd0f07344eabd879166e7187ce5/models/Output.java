// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class Output extends TeaModel {
    // 交互类型多媒体节点使用
    // 
    @NameInMap("interaction_type")
    @Validation(required = true)
    public String interactionType;

    // 播报内容类型
    @NameInMap("content_key")
    @Validation(required = true)
    public String contentKey;

    // 合成的播报内容或者是录音的文件地址
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 视频文件id
    @NameInMap("video_file_id")
    @Validation(required = true)
    public String videoFileId;

    // 视频文件播放长度毫秒
    @NameInMap("video_file_content_time")
    @Validation(required = true)
    public Long videoFileContentTime;

    // 扩展信息
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    // key为上面content中的变量value为名称
    @NameInMap("variable_map")
    @Validation(required = true)
    public String variableMap;

    // 视频文件code
    @NameInMap("video_code")
    @Validation(required = true)
    public String videoCode;

    // 语音文件code
    @NameInMap("voice_code")
    @Validation(required = true)
    public String voiceCode;

    // 输出内容list
    @NameInMap("content_list")
    @Validation(required = true)
    public java.util.List<String> contentList;

    public static Output build(java.util.Map<String, ?> map) throws Exception {
        Output self = new Output();
        return TeaModel.build(map, self);
    }

    public Output setInteractionType(String interactionType) {
        this.interactionType = interactionType;
        return this;
    }
    public String getInteractionType() {
        return this.interactionType;
    }

    public Output setContentKey(String contentKey) {
        this.contentKey = contentKey;
        return this;
    }
    public String getContentKey() {
        return this.contentKey;
    }

    public Output setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public Output setVideoFileId(String videoFileId) {
        this.videoFileId = videoFileId;
        return this;
    }
    public String getVideoFileId() {
        return this.videoFileId;
    }

    public Output setVideoFileContentTime(Long videoFileContentTime) {
        this.videoFileContentTime = videoFileContentTime;
        return this;
    }
    public Long getVideoFileContentTime() {
        return this.videoFileContentTime;
    }

    public Output setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public Output setVariableMap(String variableMap) {
        this.variableMap = variableMap;
        return this;
    }
    public String getVariableMap() {
        return this.variableMap;
    }

    public Output setVideoCode(String videoCode) {
        this.videoCode = videoCode;
        return this;
    }
    public String getVideoCode() {
        return this.videoCode;
    }

    public Output setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public Output setContentList(java.util.List<String> contentList) {
        this.contentList = contentList;
        return this;
    }
    public java.util.List<String> getContentList() {
        return this.contentList;
    }

}
