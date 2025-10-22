// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class BatchqueryCarloanUsersRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户匹配数据
    @NameInMap("user_match")
    @Validation(required = true)
    public java.util.List<CarUserMatch> userMatch;

    public static BatchqueryCarloanUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryCarloanUsersRequest self = new BatchqueryCarloanUsersRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryCarloanUsersRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryCarloanUsersRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryCarloanUsersRequest setUserMatch(java.util.List<CarUserMatch> userMatch) {
        this.userMatch = userMatch;
        return this;
    }
    public java.util.List<CarUserMatch> getUserMatch() {
        return this.userMatch;
    }

}
