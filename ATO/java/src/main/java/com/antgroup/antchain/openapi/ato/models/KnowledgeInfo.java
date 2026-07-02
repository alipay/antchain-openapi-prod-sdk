// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class KnowledgeInfo extends TeaModel {
    // 租户id
    /**
     * <strong>example:</strong>
     * <p>UDFXXXXX</p>
     */
    @NameInMap("tenant_id")
    public String tenantId;

    // 主键id
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("id")
    public Long id;

    // 类型
    /**
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("type")
    public String type;

    // 问题
    /**
     * <strong>example:</strong>
     * <p>问题</p>
     */
    @NameInMap("question")
    public String question;

    // 答案
    /**
     * <strong>example:</strong>
     * <p>答案</p>
     */
    @NameInMap("answer")
    public String answer;

    // 是否选择订单
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("has_order")
    public Boolean hasOrder;

    // 是否带小程序链接
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("has_app_link")
    public Boolean hasAppLink;

    // 是否转人工
    /**
     * <strong>example:</strong>
     * <p>true,false</p>
     */
    @NameInMap("has_manual")
    public Boolean hasManual;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>状态</p>
     */
    @NameInMap("status")
    public String status;

    // 驳回原因
    /**
     * <strong>example:</strong>
     * <p>驳回原因</p>
     */
    @NameInMap("refuse_reason")
    public String refuseReason;

    public static KnowledgeInfo build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeInfo self = new KnowledgeInfo();
        return TeaModel.build(map, self);
    }

    public KnowledgeInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public KnowledgeInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public KnowledgeInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public KnowledgeInfo setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public KnowledgeInfo setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public KnowledgeInfo setHasOrder(Boolean hasOrder) {
        this.hasOrder = hasOrder;
        return this;
    }
    public Boolean getHasOrder() {
        return this.hasOrder;
    }

    public KnowledgeInfo setHasAppLink(Boolean hasAppLink) {
        this.hasAppLink = hasAppLink;
        return this;
    }
    public Boolean getHasAppLink() {
        return this.hasAppLink;
    }

    public KnowledgeInfo setHasManual(Boolean hasManual) {
        this.hasManual = hasManual;
        return this;
    }
    public Boolean getHasManual() {
        return this.hasManual;
    }

    public KnowledgeInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public KnowledgeInfo setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
        return this;
    }
    public String getRefuseReason() {
        return this.refuseReason;
    }

}
