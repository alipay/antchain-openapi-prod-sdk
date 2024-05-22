// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushRpaasReportAnswerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // chat trace id
    @NameInMap("chat_trace_id")
    @Validation(required = true)
    public String chatTraceId;

    // 响应结果
    @NameInMap("answer")
    @Validation(required = true)
    public String answer;

    public static PushRpaasReportAnswerRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRpaasReportAnswerRequest self = new PushRpaasReportAnswerRequest();
        return TeaModel.build(map, self);
    }

    public PushRpaasReportAnswerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRpaasReportAnswerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRpaasReportAnswerRequest setChatTraceId(String chatTraceId) {
        this.chatTraceId = chatTraceId;
        return this;
    }
    public String getChatTraceId() {
        return this.chatTraceId;
    }

    public PushRpaasReportAnswerRequest setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

}
