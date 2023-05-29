// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.antverse.models;

import com.aliyun.tea.*;

public class GetInteractvideoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 问题
    @NameInMap("question")
    @Validation(required = true)
    public String question;

    // 数字人形象ID(不填写时,返回默认形象视频)
    @NameInMap("avatar_id")
    public String avatarId;

    // 交互类型（默认为QA, 问答：QA）
    @NameInMap("interact_type")
    public String interactType;

    public static GetInteractvideoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInteractvideoRequest self = new GetInteractvideoRequest();
        return TeaModel.build(map, self);
    }

    public GetInteractvideoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetInteractvideoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetInteractvideoRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public GetInteractvideoRequest setAvatarId(String avatarId) {
        this.avatarId = avatarId;
        return this;
    }
    public String getAvatarId() {
        return this.avatarId;
    }

    public GetInteractvideoRequest setInteractType(String interactType) {
        this.interactType = interactType;
        return this;
    }
    public String getInteractType() {
        return this.interactType;
    }

}
