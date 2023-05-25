// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class GetRiskStatisticsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static GetRiskStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRiskStatisticsRequest self = new GetRiskStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetRiskStatisticsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
