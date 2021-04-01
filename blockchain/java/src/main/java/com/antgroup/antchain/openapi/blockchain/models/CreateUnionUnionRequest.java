// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateUnionUnionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟描述
    @NameInMap("consortium_description")
    public String consortiumDescription;

    // 联盟名称
    @NameInMap("consortium_name")
    @Validation(required = true)
    public String consortiumName;

    // 区域信息
    @NameInMap("region_id")
    public String regionId;

    public static CreateUnionUnionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUnionUnionRequest self = new CreateUnionUnionRequest();
        return TeaModel.build(map, self);
    }

    public CreateUnionUnionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateUnionUnionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateUnionUnionRequest setConsortiumDescription(String consortiumDescription) {
        this.consortiumDescription = consortiumDescription;
        return this;
    }
    public String getConsortiumDescription() {
        return this.consortiumDescription;
    }

    public CreateUnionUnionRequest setConsortiumName(String consortiumName) {
        this.consortiumName = consortiumName;
        return this;
    }
    public String getConsortiumName() {
        return this.consortiumName;
    }

    public CreateUnionUnionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
