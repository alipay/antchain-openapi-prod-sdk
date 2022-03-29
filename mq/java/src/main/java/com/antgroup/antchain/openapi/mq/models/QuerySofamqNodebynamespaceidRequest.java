// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqNodebynamespaceidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // instanceid
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static QuerySofamqNodebynamespaceidRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqNodebynamespaceidRequest self = new QuerySofamqNodebynamespaceidRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqNodebynamespaceidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqNodebynamespaceidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqNodebynamespaceidRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
