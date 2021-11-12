// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class DescribeSolutioninstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 解决方案id
    @NameInMap("solution_id")
    @Validation(required = true)
    public String solutionId;

    public static DescribeSolutioninstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSolutioninstanceRequest self = new DescribeSolutioninstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSolutioninstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DescribeSolutioninstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DescribeSolutioninstanceRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

}
