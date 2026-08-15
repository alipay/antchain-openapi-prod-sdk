// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class MaterialContentDto extends TeaModel {
    // 文本素材信息列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("text_info_dtos")
    public java.util.List<TextInfoDto> textInfoDtos;

    // 图片素材列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("image_info_dtos")
    public java.util.List<ImageInfoDto> imageInfoDtos;

    // 视频素材内容列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("video_info_dtos")
    public java.util.List<FileInfoDto> videoInfoDtos;

    // 音频素材内容列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("audio_info_dtos")
    public java.util.List<FileInfoDto> audioInfoDtos;

    public static MaterialContentDto build(java.util.Map<String, ?> map) throws Exception {
        MaterialContentDto self = new MaterialContentDto();
        return TeaModel.build(map, self);
    }

    public MaterialContentDto setTextInfoDtos(java.util.List<TextInfoDto> textInfoDtos) {
        this.textInfoDtos = textInfoDtos;
        return this;
    }
    public java.util.List<TextInfoDto> getTextInfoDtos() {
        return this.textInfoDtos;
    }

    public MaterialContentDto setImageInfoDtos(java.util.List<ImageInfoDto> imageInfoDtos) {
        this.imageInfoDtos = imageInfoDtos;
        return this;
    }
    public java.util.List<ImageInfoDto> getImageInfoDtos() {
        return this.imageInfoDtos;
    }

    public MaterialContentDto setVideoInfoDtos(java.util.List<FileInfoDto> videoInfoDtos) {
        this.videoInfoDtos = videoInfoDtos;
        return this;
    }
    public java.util.List<FileInfoDto> getVideoInfoDtos() {
        return this.videoInfoDtos;
    }

    public MaterialContentDto setAudioInfoDtos(java.util.List<FileInfoDto> audioInfoDtos) {
        this.audioInfoDtos = audioInfoDtos;
        return this;
    }
    public java.util.List<FileInfoDto> getAudioInfoDtos() {
        return this.audioInfoDtos;
    }

}
