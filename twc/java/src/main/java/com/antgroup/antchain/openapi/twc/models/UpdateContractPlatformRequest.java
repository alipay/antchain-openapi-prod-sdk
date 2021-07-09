// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UpdateContractPlatformRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 平台方企业信息
    @NameInMap("platform")
    public ContractPlatformOrganizationApplication platform;

    // 平台方经办人信息
    @NameInMap("creator")
    public ContractPlatformAccountApplication creator;

    public static UpdateContractPlatformRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContractPlatformRequest self = new UpdateContractPlatformRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContractPlatformRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateContractPlatformRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateContractPlatformRequest setPlatform(ContractPlatformOrganizationApplication platform) {
        this.platform = platform;
        return this;
    }
    public ContractPlatformOrganizationApplication getPlatform() {
        return this.platform;
    }

    public UpdateContractPlatformRequest setCreator(ContractPlatformAccountApplication creator) {
        this.creator = creator;
        return this;
    }
    public ContractPlatformAccountApplication getCreator() {
        return this.creator;
    }

}
