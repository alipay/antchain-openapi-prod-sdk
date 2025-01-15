// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class SubmitActivityInformationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 活动标识
    @NameInMap("activity_id")
    @Validation(required = true)
    public String activityId;

    // 渠道编码
    @NameInMap("activity_channel")
    @Validation(required = true)
    public String activityChannel;

    // 活动表单
    @NameInMap("activity_form_data")
    @Validation(required = true)
    public String activityFormData;

    // 提交时间，ISO_DATE_TIME 时间格式
    @NameInMap("submit_date")
    public String submitDate;

    // 情报标识，存在则更新
    @NameInMap("information_id")
    public String informationId;

    // 可选附件
    @NameInMap("attachments")
    public java.util.List<Attachment> attachments;

    public static SubmitActivityInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitActivityInformationRequest self = new SubmitActivityInformationRequest();
        return TeaModel.build(map, self);
    }

    public SubmitActivityInformationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitActivityInformationRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public SubmitActivityInformationRequest setActivityChannel(String activityChannel) {
        this.activityChannel = activityChannel;
        return this;
    }
    public String getActivityChannel() {
        return this.activityChannel;
    }

    public SubmitActivityInformationRequest setActivityFormData(String activityFormData) {
        this.activityFormData = activityFormData;
        return this;
    }
    public String getActivityFormData() {
        return this.activityFormData;
    }

    public SubmitActivityInformationRequest setSubmitDate(String submitDate) {
        this.submitDate = submitDate;
        return this;
    }
    public String getSubmitDate() {
        return this.submitDate;
    }

    public SubmitActivityInformationRequest setInformationId(String informationId) {
        this.informationId = informationId;
        return this;
    }
    public String getInformationId() {
        return this.informationId;
    }

    public SubmitActivityInformationRequest setAttachments(java.util.List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<Attachment> getAttachments() {
        return this.attachments;
    }

}
