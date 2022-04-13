// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryReleasepipelinestageEventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 发布单发布分组的id，对应ReleasePipeline中的stage
    @NameInMap("stage_id")
    @Validation(required = true)
    public String stageId;

    public static QueryReleasepipelinestageEventRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryReleasepipelinestageEventRequest self = new QueryReleasepipelinestageEventRequest();
        return TeaModel.build(map, self);
    }

    public QueryReleasepipelinestageEventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryReleasepipelinestageEventRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
