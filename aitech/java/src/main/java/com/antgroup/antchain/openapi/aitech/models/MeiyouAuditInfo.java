// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class MeiyouAuditInfo extends TeaModel {
    // 主键id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 审核记录ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("audit_id")
    @Validation(required = true)
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
     * <p>内容文本</p>
     */
    @NameInMap("content")
    public String content;

    // 发布时间戳
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("publish_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String publishTime;

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
     * <p>1</p>
     */
    @NameInMap("primary_business")
    public String primaryBusiness;

    // 二级业务
    /**
     * <strong>example:</strong>
     * <p>2</p>
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
     * <p>test</p>
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

    // 审核结果
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("audit_result")
    public String auditResult;

    // 审核原因
    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("audit_reason")
    public String auditReason;

    // 审核原因
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("audit_reason_msg")
    public String auditReasonMsg;

    // 操作人
    /**
     * <strong>example:</strong>
     * <p>小蜜</p>
     */
    @NameInMap("audit_operator")
    public String auditOperator;

    // 操作时间戳
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("audit_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String auditTime;

    // oss 转存后的图像地址
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("oss_images")
    public String ossImages;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    public static MeiyouAuditInfo build(java.util.Map<String, ?> map) throws Exception {
        MeiyouAuditInfo self = new MeiyouAuditInfo();
        return TeaModel.build(map, self);
    }

    public MeiyouAuditInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MeiyouAuditInfo setAuditId(Long auditId) {
        this.auditId = auditId;
        return this;
    }
    public Long getAuditId() {
        return this.auditId;
    }

    public MeiyouAuditInfo setTopicId(Long topicId) {
        this.topicId = topicId;
        return this;
    }
    public Long getTopicId() {
        return this.topicId;
    }

    public MeiyouAuditInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public MeiyouAuditInfo setPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public String getPublishTime() {
        return this.publishTime;
    }

    public MeiyouAuditInfo setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public MeiyouAuditInfo setPrimaryBusiness(String primaryBusiness) {
        this.primaryBusiness = primaryBusiness;
        return this;
    }
    public String getPrimaryBusiness() {
        return this.primaryBusiness;
    }

    public MeiyouAuditInfo setSecondaryBusiness(String secondaryBusiness) {
        this.secondaryBusiness = secondaryBusiness;
        return this;
    }
    public String getSecondaryBusiness() {
        return this.secondaryBusiness;
    }

    public MeiyouAuditInfo setUserNickname(String userNickname) {
        this.userNickname = userNickname;
        return this;
    }
    public String getUserNickname() {
        return this.userNickname;
    }

    public MeiyouAuditInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public MeiyouAuditInfo setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public MeiyouAuditInfo setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
        return this;
    }
    public String getUserAvatar() {
        return this.userAvatar;
    }

    public MeiyouAuditInfo setAuditResult(String auditResult) {
        this.auditResult = auditResult;
        return this;
    }
    public String getAuditResult() {
        return this.auditResult;
    }

    public MeiyouAuditInfo setAuditReason(String auditReason) {
        this.auditReason = auditReason;
        return this;
    }
    public String getAuditReason() {
        return this.auditReason;
    }

    public MeiyouAuditInfo setAuditReasonMsg(String auditReasonMsg) {
        this.auditReasonMsg = auditReasonMsg;
        return this;
    }
    public String getAuditReasonMsg() {
        return this.auditReasonMsg;
    }

    public MeiyouAuditInfo setAuditOperator(String auditOperator) {
        this.auditOperator = auditOperator;
        return this;
    }
    public String getAuditOperator() {
        return this.auditOperator;
    }

    public MeiyouAuditInfo setAuditTime(String auditTime) {
        this.auditTime = auditTime;
        return this;
    }
    public String getAuditTime() {
        return this.auditTime;
    }

    public MeiyouAuditInfo setOssImages(String ossImages) {
        this.ossImages = ossImages;
        return this;
    }
    public String getOssImages() {
        return this.ossImages;
    }

    public MeiyouAuditInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MeiyouAuditInfo setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
