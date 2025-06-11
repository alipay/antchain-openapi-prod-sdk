// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class MeiyouAuditSaveWebInfo extends TeaModel {
    // 主题ID
    @NameInMap("topic_id")
    public Long topicId;

    // 审核记录ID
    @NameInMap("audit_id")
    @Validation(required = true)
    public Long auditId;

    // 内容文本
    @NameInMap("content")
    public String content;

    // 发布时间戳(毫秒)
    @NameInMap("publish_time")
    public Long publishTime;

    // 图片URL数组(JSON字符串)
    @NameInMap("images")
    public String images;

    // 一级业务
    @NameInMap("primary_business")
    public String primaryBusiness;

    // 二级业务
    @NameInMap("secondary_business")
    public String secondaryBusiness;

    // 用户昵称
    @NameInMap("user_nickname")
    public String userNickname;

    // 用户ID
    @NameInMap("user_id")
    public String userId;

    // 用户类型
    // 
    @NameInMap("user_type")
    public String userType;

    // 用户头像URL
    @NameInMap("user_avatar")
    public String userAvatar;

    //  主题信息
    @NameInMap("topic_infos")
    public MeiyouTopicWebInfo topicInfos;

    public static MeiyouAuditSaveWebInfo build(java.util.Map<String, ?> map) throws Exception {
        MeiyouAuditSaveWebInfo self = new MeiyouAuditSaveWebInfo();
        return TeaModel.build(map, self);
    }

    public MeiyouAuditSaveWebInfo setTopicId(Long topicId) {
        this.topicId = topicId;
        return this;
    }
    public Long getTopicId() {
        return this.topicId;
    }

    public MeiyouAuditSaveWebInfo setAuditId(Long auditId) {
        this.auditId = auditId;
        return this;
    }
    public Long getAuditId() {
        return this.auditId;
    }

    public MeiyouAuditSaveWebInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public MeiyouAuditSaveWebInfo setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public Long getPublishTime() {
        return this.publishTime;
    }

    public MeiyouAuditSaveWebInfo setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public MeiyouAuditSaveWebInfo setPrimaryBusiness(String primaryBusiness) {
        this.primaryBusiness = primaryBusiness;
        return this;
    }
    public String getPrimaryBusiness() {
        return this.primaryBusiness;
    }

    public MeiyouAuditSaveWebInfo setSecondaryBusiness(String secondaryBusiness) {
        this.secondaryBusiness = secondaryBusiness;
        return this;
    }
    public String getSecondaryBusiness() {
        return this.secondaryBusiness;
    }

    public MeiyouAuditSaveWebInfo setUserNickname(String userNickname) {
        this.userNickname = userNickname;
        return this;
    }
    public String getUserNickname() {
        return this.userNickname;
    }

    public MeiyouAuditSaveWebInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public MeiyouAuditSaveWebInfo setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public MeiyouAuditSaveWebInfo setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
        return this;
    }
    public String getUserAvatar() {
        return this.userAvatar;
    }

    public MeiyouAuditSaveWebInfo setTopicInfos(MeiyouTopicWebInfo topicInfos) {
        this.topicInfos = topicInfos;
        return this;
    }
    public MeiyouTopicWebInfo getTopicInfos() {
        return this.topicInfos;
    }

}
