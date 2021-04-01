// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetMydidcommunWorkergroupTappRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // TAPPInstance所对应的部署ID
    @NameInMap("pod_id")
    @Validation(required = true)
    public Long podId;

    public static GetMydidcommunWorkergroupTappRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMydidcommunWorkergroupTappRequest self = new GetMydidcommunWorkergroupTappRequest();
        return TeaModel.build(map, self);
    }

    public GetMydidcommunWorkergroupTappRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMydidcommunWorkergroupTappRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetMydidcommunWorkergroupTappRequest setPodId(Long podId) {
        this.podId = podId;
        return this;
    }
    public Long getPodId() {
        return this.podId;
    }

}
