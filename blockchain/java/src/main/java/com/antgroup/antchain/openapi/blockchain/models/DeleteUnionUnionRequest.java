// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DeleteUnionUnionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    @NameInMap("consortium_id")
    @Validation(required = true)
    public String consortiumId;

    // 区域id
    @NameInMap("region_id")
    public String regionId;

    public static DeleteUnionUnionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUnionUnionRequest self = new DeleteUnionUnionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUnionUnionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteUnionUnionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteUnionUnionRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DeleteUnionUnionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
