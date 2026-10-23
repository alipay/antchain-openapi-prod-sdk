// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class MeiyouAuditSaveWebRequest extends TeaModel {
    // 审核记录ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("audit_id")
    public Long auditId;

    // 主题ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("topic_id")
    public Long topicId;

    // 内容文本
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("content")
    public String content;

    // 发布时间戳(毫秒)
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("publish_time")
    public Long publishTime;

    // 图片URL数组(JSON字符串)
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("images")
    public String images;

    // 一级业务
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("primary_business")
    public String primaryBusiness;

    // 二级业务
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("secondary_business")
    public String secondaryBusiness;

    // 用户昵称
    /**
     * <strong>example:</strong>
     * <p>小蜜</p>
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
    /**
     * <strong>example:</strong>
     * <p>INIT</p>
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

    // 操作人
    /**
     * <strong>example:</strong>
     * <p>小蜜</p>
     */
    @NameInMap("audit_operator")
    public String auditOperator;

    // 审核楼
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("audit_floor")
    public Long auditFloor;

    // 版本
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("version")
    public String version;

    // 主题信息
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("topic_infos")
    public java.util.List<MeiyouTopicWebInfo> topicInfos;

    public static MeiyouAuditSaveWebRequest build(java.util.Map<String, ?> map) throws Exception {
        MeiyouAuditSaveWebRequest self = new MeiyouAuditSaveWebRequest();
        return TeaModel.build(map, self);
    }

    public MeiyouAuditSaveWebRequest setAuditId(Long auditId) {
        this.auditId = auditId;
        return this;
    }
    public Long getAuditId() {
        return this.auditId;
    }

    public MeiyouAuditSaveWebRequest setTopicId(Long topicId) {
        this.topicId = topicId;
        return this;
    }
    public Long getTopicId() {
        return this.topicId;
    }

    public MeiyouAuditSaveWebRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public MeiyouAuditSaveWebRequest setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public Long getPublishTime() {
        return this.publishTime;
    }

    public MeiyouAuditSaveWebRequest setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public MeiyouAuditSaveWebRequest setPrimaryBusiness(String primaryBusiness) {
        this.primaryBusiness = primaryBusiness;
        return this;
    }
    public String getPrimaryBusiness() {
        return this.primaryBusiness;
    }

    public MeiyouAuditSaveWebRequest setSecondaryBusiness(String secondaryBusiness) {
        this.secondaryBusiness = secondaryBusiness;
        return this;
    }
    public String getSecondaryBusiness() {
        return this.secondaryBusiness;
    }

    public MeiyouAuditSaveWebRequest setUserNickname(String userNickname) {
        this.userNickname = userNickname;
        return this;
    }
    public String getUserNickname() {
        return this.userNickname;
    }

    public MeiyouAuditSaveWebRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public MeiyouAuditSaveWebRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public MeiyouAuditSaveWebRequest setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
        return this;
    }
    public String getUserAvatar() {
        return this.userAvatar;
    }

    public MeiyouAuditSaveWebRequest setAuditOperator(String auditOperator) {
        this.auditOperator = auditOperator;
        return this;
    }
    public String getAuditOperator() {
        return this.auditOperator;
    }

    public MeiyouAuditSaveWebRequest setAuditFloor(Long auditFloor) {
        this.auditFloor = auditFloor;
        return this;
    }
    public Long getAuditFloor() {
        return this.auditFloor;
    }

    public MeiyouAuditSaveWebRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public MeiyouAuditSaveWebRequest setTopicInfos(java.util.List<MeiyouTopicWebInfo> topicInfos) {
        this.topicInfos = topicInfos;
        return this;
    }
    public java.util.List<MeiyouTopicWebInfo> getTopicInfos() {
        return this.topicInfos;
    }

}
