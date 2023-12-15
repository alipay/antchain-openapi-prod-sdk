// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.antverse.models;

import com.aliyun.tea.*;

public class SendLiveMessageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 问题
    @NameInMap("question")
    public String question;

    // 回答文本
    @NameInMap("answer")
    @Validation(required = true)
    public String answer;

    // 插播类型(QA-问答插播,REAL_TIME-实时消息插播)
    @NameInMap("intercut_type")
    @Validation(required = true)
    public String intercutType;

    public static SendLiveMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendLiveMessageRequest self = new SendLiveMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendLiveMessageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendLiveMessageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendLiveMessageRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public SendLiveMessageRequest setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public SendLiveMessageRequest setIntercutType(String intercutType) {
        this.intercutType = intercutType;
        return this;
    }
    public String getIntercutType() {
        return this.intercutType;
    }

}
