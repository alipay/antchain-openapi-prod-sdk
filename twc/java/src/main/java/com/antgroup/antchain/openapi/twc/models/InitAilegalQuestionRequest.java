// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class InitAilegalQuestionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 提问问题
    @NameInMap("question")
    @Validation(required = true, maxLength = 1000)
    public String question;

    // 是否开启新会话
    @NameInMap("first")
    @Validation(required = true)
    public Boolean first;

    // 用户id，用户唯一标识
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户类型，参见枚举类UserTypeEnum
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // app类型，参见枚举类AppTypeEnum
    @NameInMap("app_type")
    @Validation(required = true)
    public String appType;

    public static InitAilegalQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        InitAilegalQuestionRequest self = new InitAilegalQuestionRequest();
        return TeaModel.build(map, self);
    }

    public InitAilegalQuestionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitAilegalQuestionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitAilegalQuestionRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public InitAilegalQuestionRequest setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public InitAilegalQuestionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public InitAilegalQuestionRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public InitAilegalQuestionRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

}
