// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_f0f16236ed254bd499e3fe0f9600e0d5.models;

import com.aliyun.tea.*;

public class QueryMaxCopilotFinRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户问题
    @NameInMap("question")
    @Validation(required = true)
    public String question;

    // 指定的专家框架
    @NameInMap("user_framework_code")
    public String userFrameworkCode;

    public static QueryMaxCopilotFinRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMaxCopilotFinRequest self = new QueryMaxCopilotFinRequest();
        return TeaModel.build(map, self);
    }

    public QueryMaxCopilotFinRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMaxCopilotFinRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMaxCopilotFinRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryMaxCopilotFinRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public QueryMaxCopilotFinRequest setUserFrameworkCode(String userFrameworkCode) {
        this.userFrameworkCode = userFrameworkCode;
        return this;
    }
    public String getUserFrameworkCode() {
        return this.userFrameworkCode;
    }

}
