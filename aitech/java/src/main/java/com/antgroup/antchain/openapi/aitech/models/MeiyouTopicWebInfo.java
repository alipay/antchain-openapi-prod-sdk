// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class MeiyouTopicWebInfo extends TeaModel {
    // 内容文本
    /**
     * <strong>example:</strong>
     * <p>内容文本</p>
     */
    @NameInMap("content")
    public String content;

    // 当前楼层
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current_floor")
    public Long currentFloor;

    // 回复楼层
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("call_back_floor")
    public Long callBackFloor;

    // 发布时间戳(毫秒)
    // 
    @NameInMap("publish_time")
    public Long publishTime;

    // 图片URL数组(JSON字符串)
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("images")
    public String images;

    // 用户昵称
    /**
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("user_nickname")
    public String userNickname;

    // 用户ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("user_id")
    public String userId;

    // 用户类型
    // 
    /**
     * <strong>example:</strong>
     * <p>q</p>
     */
    @NameInMap("user_type")
    public String userType;

    // 用户头像URL
    /**
     * <strong>example:</strong>
     * <p><a href="http://test">http://test</a></p>
     */
    @NameInMap("user_avatar")
    public String userAvatar;

    // 主题ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("topic_id")
    public Long topicId;

    // 回复楼信息
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("call_back_floor_content")
    public String callBackFloorContent;

    // oss存储地址
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("oss_images")
    public String ossImages;

    public static MeiyouTopicWebInfo build(java.util.Map<String, ?> map) throws Exception {
        MeiyouTopicWebInfo self = new MeiyouTopicWebInfo();
        return TeaModel.build(map, self);
    }

    public MeiyouTopicWebInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public MeiyouTopicWebInfo setCurrentFloor(Long currentFloor) {
        this.currentFloor = currentFloor;
        return this;
    }
    public Long getCurrentFloor() {
        return this.currentFloor;
    }

    public MeiyouTopicWebInfo setCallBackFloor(Long callBackFloor) {
        this.callBackFloor = callBackFloor;
        return this;
    }
    public Long getCallBackFloor() {
        return this.callBackFloor;
    }

    public MeiyouTopicWebInfo setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public Long getPublishTime() {
        return this.publishTime;
    }

    public MeiyouTopicWebInfo setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public MeiyouTopicWebInfo setUserNickname(String userNickname) {
        this.userNickname = userNickname;
        return this;
    }
    public String getUserNickname() {
        return this.userNickname;
    }

    public MeiyouTopicWebInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public MeiyouTopicWebInfo setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public MeiyouTopicWebInfo setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
        return this;
    }
    public String getUserAvatar() {
        return this.userAvatar;
    }

    public MeiyouTopicWebInfo setTopicId(Long topicId) {
        this.topicId = topicId;
        return this;
    }
    public Long getTopicId() {
        return this.topicId;
    }

    public MeiyouTopicWebInfo setCallBackFloorContent(String callBackFloorContent) {
        this.callBackFloorContent = callBackFloorContent;
        return this;
    }
    public String getCallBackFloorContent() {
        return this.callBackFloorContent;
    }

    public MeiyouTopicWebInfo setOssImages(String ossImages) {
        this.ossImages = ossImages;
        return this;
    }
    public String getOssImages() {
        return this.ossImages;
    }

}
