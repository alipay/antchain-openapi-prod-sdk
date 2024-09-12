// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.unitycs.models;

import com.aliyun.tea.*;

public class CreateDepositRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 元数据编码
    @NameInMap("metadata_code")
    @Validation(required = true)
    public String metadataCode;

    // 基础信息json
    @NameInMap("base_info_json")
    @Validation(required = true)
    public String baseInfoJson;

    public static CreateDepositRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDepositRequest self = new CreateDepositRequest();
        return TeaModel.build(map, self);
    }

    public CreateDepositRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDepositRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDepositRequest setMetadataCode(String metadataCode) {
        this.metadataCode = metadataCode;
        return this;
    }
    public String getMetadataCode() {
        return this.metadataCode;
    }

    public CreateDepositRequest setBaseInfoJson(String baseInfoJson) {
        this.baseInfoJson = baseInfoJson;
        return this;
    }
    public String getBaseInfoJson() {
        return this.baseInfoJson;
    }

}
