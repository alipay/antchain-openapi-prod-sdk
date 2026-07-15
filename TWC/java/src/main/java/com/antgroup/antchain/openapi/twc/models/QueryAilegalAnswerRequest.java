// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryAilegalAnswerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // twc.notary.ailegal.question.init(提出问题)接口返回的问题id
    // 长度不超过32位
    @NameInMap("question_id")
    @Validation(required = true)
    public String questionId;

    public static QueryAilegalAnswerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAilegalAnswerRequest self = new QueryAilegalAnswerRequest();
        return TeaModel.build(map, self);
    }

    public QueryAilegalAnswerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAilegalAnswerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAilegalAnswerRequest setQuestionId(String questionId) {
        this.questionId = questionId;
        return this;
    }
    public String getQuestionId() {
        return this.questionId;
    }

}
