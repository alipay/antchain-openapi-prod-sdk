// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_630ce8157b69499bbf96c1910a852241.models;

import com.aliyun.tea.*;

public class CreateBaasUnionUnionRequest extends TeaModel {
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

    public static CreateBaasUnionUnionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasUnionUnionRequest self = new CreateBaasUnionUnionRequest();
        return TeaModel.build(map, self);
    }

    public CreateBaasUnionUnionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBaasUnionUnionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBaasUnionUnionRequest setConsortiumDescription(String consortiumDescription) {
        this.consortiumDescription = consortiumDescription;
        return this;
    }
    public String getConsortiumDescription() {
        return this.consortiumDescription;
    }

    public CreateBaasUnionUnionRequest setConsortiumName(String consortiumName) {
        this.consortiumName = consortiumName;
        return this;
    }
    public String getConsortiumName() {
        return this.consortiumName;
    }

    public CreateBaasUnionUnionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
