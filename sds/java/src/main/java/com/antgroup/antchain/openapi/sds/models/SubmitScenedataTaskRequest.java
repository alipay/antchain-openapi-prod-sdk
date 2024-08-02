// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class SubmitScenedataTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 约定的场景枚举
    @NameInMap("scene")
    @Validation(required = true, maxLength = 32)
    public String scene;

    // 枚举
    // PHONE_SHA1
    // PHONE_MD5
    @NameInMap("biz_no_type")
    @Validation(required = true, maxLength = 32)
    public String bizNoType;

    // 适配客户的来源
    // 可能是客户的任务/AK
    @NameInMap("source_mark")
    @Validation(maxLength = 32)
    public String sourceMark;

    // 业务号预期条件
    @NameInMap("expect_condition")
    public java.util.List<BizNoCondition> expectCondition;

    public static SubmitScenedataTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitScenedataTaskRequest self = new SubmitScenedataTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitScenedataTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitScenedataTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitScenedataTaskRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SubmitScenedataTaskRequest setBizNoType(String bizNoType) {
        this.bizNoType = bizNoType;
        return this;
    }
    public String getBizNoType() {
        return this.bizNoType;
    }

    public SubmitScenedataTaskRequest setSourceMark(String sourceMark) {
        this.sourceMark = sourceMark;
        return this;
    }
    public String getSourceMark() {
        return this.sourceMark;
    }

    public SubmitScenedataTaskRequest setExpectCondition(java.util.List<BizNoCondition> expectCondition) {
        this.expectCondition = expectCondition;
        return this;
    }
    public java.util.List<BizNoCondition> getExpectCondition() {
        return this.expectCondition;
    }

}
