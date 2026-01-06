// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class UpdateMeiyouItagRelationWebInfo extends TeaModel {
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
    public String auditId;

    // itag数据ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("itag_data_id")
    public Long itagDataId;

    // 美柚任务审核结果推送状态
    /**
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("meiyou_audit_state")
    public String meiyouAuditState;

    // 审核不通过原因
    /**
     * <strong>example:</strong>
     * <p>34</p>
     */
    @NameInMap("refuse_reson")
    public String refuseReson;

    // 审核不通过图片序号
    /**
     * <strong>example:</strong>
     * <p>[&quot;1&quot;,&quot;2&quot;]</p>
     */
    @NameInMap("refuse_images")
    public String refuseImages;

    // 美柚itag关联状态
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("audit_state")
    public String auditState;

    // 美柚itag关联状态
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("topic_state")
    public String topicState;

    // 审核结果
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("audit_result")
    public String auditResult;

    // 审核人员
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("audit_user")
    public String auditUser;

    // 审核时间
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("audit_time")
    public Long auditTime;

    public static UpdateMeiyouItagRelationWebInfo build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeiyouItagRelationWebInfo self = new UpdateMeiyouItagRelationWebInfo();
        return TeaModel.build(map, self);
    }

    public UpdateMeiyouItagRelationWebInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMeiyouItagRelationWebInfo setAuditId(String auditId) {
        this.auditId = auditId;
        return this;
    }
    public String getAuditId() {
        return this.auditId;
    }

    public UpdateMeiyouItagRelationWebInfo setItagDataId(Long itagDataId) {
        this.itagDataId = itagDataId;
        return this;
    }
    public Long getItagDataId() {
        return this.itagDataId;
    }

    public UpdateMeiyouItagRelationWebInfo setMeiyouAuditState(String meiyouAuditState) {
        this.meiyouAuditState = meiyouAuditState;
        return this;
    }
    public String getMeiyouAuditState() {
        return this.meiyouAuditState;
    }

    public UpdateMeiyouItagRelationWebInfo setRefuseReson(String refuseReson) {
        this.refuseReson = refuseReson;
        return this;
    }
    public String getRefuseReson() {
        return this.refuseReson;
    }

    public UpdateMeiyouItagRelationWebInfo setRefuseImages(String refuseImages) {
        this.refuseImages = refuseImages;
        return this;
    }
    public String getRefuseImages() {
        return this.refuseImages;
    }

    public UpdateMeiyouItagRelationWebInfo setAuditState(String auditState) {
        this.auditState = auditState;
        return this;
    }
    public String getAuditState() {
        return this.auditState;
    }

    public UpdateMeiyouItagRelationWebInfo setTopicState(String topicState) {
        this.topicState = topicState;
        return this;
    }
    public String getTopicState() {
        return this.topicState;
    }

    public UpdateMeiyouItagRelationWebInfo setAuditResult(String auditResult) {
        this.auditResult = auditResult;
        return this;
    }
    public String getAuditResult() {
        return this.auditResult;
    }

    public UpdateMeiyouItagRelationWebInfo setAuditUser(String auditUser) {
        this.auditUser = auditUser;
        return this;
    }
    public String getAuditUser() {
        return this.auditUser;
    }

    public UpdateMeiyouItagRelationWebInfo setAuditTime(Long auditTime) {
        this.auditTime = auditTime;
        return this;
    }
    public Long getAuditTime() {
        return this.auditTime;
    }

}
