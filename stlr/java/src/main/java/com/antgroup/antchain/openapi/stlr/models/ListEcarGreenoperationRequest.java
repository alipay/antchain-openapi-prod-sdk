// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class ListEcarGreenoperationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 限制的记录条数
    @NameInMap("limit")
    @Validation(required = true)
    public Long limit;

    public static ListEcarGreenoperationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEcarGreenoperationRequest self = new ListEcarGreenoperationRequest();
        return TeaModel.build(map, self);
    }

    public ListEcarGreenoperationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListEcarGreenoperationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListEcarGreenoperationRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

}
