// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class InitContentriskInternalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 进行识别的音频地址
    @NameInMap("audio_urls")
    public String audioUrls;

    // 内部字段
    @NameInMap("biz_info")
    @Validation(required = true)
    public BizInfo bizInfo;

    // 待校验连接
    @NameInMap("link_urls")
    public String linkUrls;

    // 图片连接
    @NameInMap("picture_urls")
    public String pictureUrls;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 待校验文本
    @NameInMap("text")
    public String text;

    // 进行识别的视频地址
    @NameInMap("video_urls")
    public String videoUrls;

    // 用户id
    @NameInMap("account_id")
    public String accountId;

    public static InitContentriskInternalRequest build(java.util.Map<String, ?> map) throws Exception {
        InitContentriskInternalRequest self = new InitContentriskInternalRequest();
        return TeaModel.build(map, self);
    }

    public InitContentriskInternalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitContentriskInternalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitContentriskInternalRequest setAudioUrls(String audioUrls) {
        this.audioUrls = audioUrls;
        return this;
    }
    public String getAudioUrls() {
        return this.audioUrls;
    }

    public InitContentriskInternalRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

    public InitContentriskInternalRequest setLinkUrls(String linkUrls) {
        this.linkUrls = linkUrls;
        return this;
    }
    public String getLinkUrls() {
        return this.linkUrls;
    }

    public InitContentriskInternalRequest setPictureUrls(String pictureUrls) {
        this.pictureUrls = pictureUrls;
        return this;
    }
    public String getPictureUrls() {
        return this.pictureUrls;
    }

    public InitContentriskInternalRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public InitContentriskInternalRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public InitContentriskInternalRequest setVideoUrls(String videoUrls) {
        this.videoUrls = videoUrls;
        return this;
    }
    public String getVideoUrls() {
        return this.videoUrls;
    }

    public InitContentriskInternalRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
