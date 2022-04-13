// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetUnireleaseSolutionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 解决方案发布ID
    @NameInMap("solution_id")
    @Validation(required = true)
    public String solutionId;

    public static GetUnireleaseSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUnireleaseSolutionRequest self = new GetUnireleaseSolutionRequest();
        return TeaModel.build(map, self);
    }

    public GetUnireleaseSolutionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetUnireleaseSolutionRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

}
