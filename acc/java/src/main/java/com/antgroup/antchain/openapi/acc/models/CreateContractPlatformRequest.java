// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CreateContractPlatformRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 创建个人
    @NameInMap("creator")
    @Validation(required = true)
    public Contractaccountapplication creator;

    // 合同企业信息
    @NameInMap("platform")
    @Validation(required = true)
    public Contractorganizationapplication platform;

    public static CreateContractPlatformRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractPlatformRequest self = new CreateContractPlatformRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractPlatformRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractPlatformRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractPlatformRequest setCreator(Contractaccountapplication creator) {
        this.creator = creator;
        return this;
    }
    public Contractaccountapplication getCreator() {
        return this.creator;
    }

    public CreateContractPlatformRequest setPlatform(Contractorganizationapplication platform) {
        this.platform = platform;
        return this;
    }
    public Contractorganizationapplication getPlatform() {
        return this.platform;
    }

}
