// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopCompanyFeedback extends TeaModel {
    // 评论
    @NameInMap("comment")
    @Validation(required = true)
    public String comment;

    // 企业ID
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    // 反馈原因
    @NameInMap("feedback_reason")
    @Validation(required = true)
    public String feedbackReason;

    // 反馈原因详情
    @NameInMap("feedback_reason_detail")
    @Validation(required = true)
    public String feedbackReasonDetail;

    // 主键
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static RtopCompanyFeedback build(java.util.Map<String, ?> map) throws Exception {
        RtopCompanyFeedback self = new RtopCompanyFeedback();
        return TeaModel.build(map, self);
    }

    public RtopCompanyFeedback setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public RtopCompanyFeedback setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public RtopCompanyFeedback setFeedbackReason(String feedbackReason) {
        this.feedbackReason = feedbackReason;
        return this;
    }
    public String getFeedbackReason() {
        return this.feedbackReason;
    }

    public RtopCompanyFeedback setFeedbackReasonDetail(String feedbackReasonDetail) {
        this.feedbackReasonDetail = feedbackReasonDetail;
        return this;
    }
    public String getFeedbackReasonDetail() {
        return this.feedbackReasonDetail;
    }

    public RtopCompanyFeedback setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
