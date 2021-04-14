// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractPlatformRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 平台方经办人信息
    @NameInMap("creator")
    @Validation(required = true)
    public ContractAccountApplication creator;

    // 平台机构信息
    @NameInMap("platform")
    @Validation(required = true)
    public ContractOrganizationApplication platform;

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

    public CreateContractPlatformRequest setCreator(ContractAccountApplication creator) {
        this.creator = creator;
        return this;
    }
    public ContractAccountApplication getCreator() {
        return this.creator;
    }

    public CreateContractPlatformRequest setPlatform(ContractOrganizationApplication platform) {
        this.platform = platform;
        return this;
    }
    public ContractOrganizationApplication getPlatform() {
        return this.platform;
    }

}
