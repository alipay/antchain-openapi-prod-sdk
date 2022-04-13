// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetUnireleasePipelineRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 解决方案发布单ID
    @NameInMap("solution_id")
    @Validation(required = true)
    public String solutionId;

    public static GetUnireleasePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUnireleasePipelineRequest self = new GetUnireleasePipelineRequest();
        return TeaModel.build(map, self);
    }

    public GetUnireleasePipelineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetUnireleasePipelineRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

}
