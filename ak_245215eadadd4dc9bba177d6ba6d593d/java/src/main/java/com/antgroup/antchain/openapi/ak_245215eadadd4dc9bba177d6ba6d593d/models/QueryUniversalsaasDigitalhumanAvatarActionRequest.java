// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class QueryUniversalsaasDigitalhumanAvatarActionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数字人id
    @NameInMap("avatar_id")
    @Validation(required = true)
    public Long avatarId;

    public static QueryUniversalsaasDigitalhumanAvatarActionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUniversalsaasDigitalhumanAvatarActionRequest self = new QueryUniversalsaasDigitalhumanAvatarActionRequest();
        return TeaModel.build(map, self);
    }

    public QueryUniversalsaasDigitalhumanAvatarActionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUniversalsaasDigitalhumanAvatarActionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUniversalsaasDigitalhumanAvatarActionRequest setAvatarId(Long avatarId) {
        this.avatarId = avatarId;
        return this;
    }
    public Long getAvatarId() {
        return this.avatarId;
    }

}
