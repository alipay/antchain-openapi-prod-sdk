// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SubmitAilegalFeedbackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // twc.notary.ailegal.question.init(提出问题)接口返回的问题id,长度不超过32位
    @NameInMap("question_id")
    @Validation(required = true)
    public String questionId;

    // 用户态度，参见枚举类AttitudeEnum
    @NameInMap("attitude")
    @Validation(required = true)
    public String attitude;

    // 用户反馈标签集合，与用户态度相对应，参见枚举类TagEnum定义
    @NameInMap("tags")
    @Validation(required = true)
    public java.util.List<String> tags;

    public static SubmitAilegalFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAilegalFeedbackRequest self = new SubmitAilegalFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAilegalFeedbackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAilegalFeedbackRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAilegalFeedbackRequest setQuestionId(String questionId) {
        this.questionId = questionId;
        return this;
    }
    public String getQuestionId() {
        return this.questionId;
    }

    public SubmitAilegalFeedbackRequest setAttitude(String attitude) {
        this.attitude = attitude;
        return this;
    }
    public String getAttitude() {
        return this.attitude;
    }

    public SubmitAilegalFeedbackRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
