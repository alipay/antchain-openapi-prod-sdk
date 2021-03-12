// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListMydidcommunWorkergroupPodversionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 部署id
    @NameInMap("pod_id")
    @Validation(required = true)
    public Long podId;

    public static ListMydidcommunWorkergroupPodversionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMydidcommunWorkergroupPodversionRequest self = new ListMydidcommunWorkergroupPodversionRequest();
        return TeaModel.build(map, self);
    }

    public ListMydidcommunWorkergroupPodversionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListMydidcommunWorkergroupPodversionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListMydidcommunWorkergroupPodversionRequest setPodId(Long podId) {
        this.podId = podId;
        return this;
    }
    public Long getPodId() {
        return this.podId;
    }

}
