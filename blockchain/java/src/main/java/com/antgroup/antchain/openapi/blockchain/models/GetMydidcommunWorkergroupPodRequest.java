// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetMydidcommunWorkergroupPodRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 部署ID
    @NameInMap("pod_id")
    @Validation(required = true)
    public Long podId;

    public static GetMydidcommunWorkergroupPodRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMydidcommunWorkergroupPodRequest self = new GetMydidcommunWorkergroupPodRequest();
        return TeaModel.build(map, self);
    }

    public GetMydidcommunWorkergroupPodRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMydidcommunWorkergroupPodRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetMydidcommunWorkergroupPodRequest setPodId(Long podId) {
        this.podId = podId;
        return this;
    }
    public Long getPodId() {
        return this.podId;
    }

}
