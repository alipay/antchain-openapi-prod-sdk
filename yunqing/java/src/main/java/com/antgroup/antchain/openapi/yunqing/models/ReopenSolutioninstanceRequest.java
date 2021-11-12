// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ReopenSolutioninstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 解决方案id
    @NameInMap("solution_id")
    @Validation(required = true)
    public String solutionId;

    public static ReopenSolutioninstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReopenSolutioninstanceRequest self = new ReopenSolutioninstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReopenSolutioninstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReopenSolutioninstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReopenSolutioninstanceRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

}
