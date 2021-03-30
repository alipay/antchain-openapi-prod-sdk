// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CheckCheckcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 物权码
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 验权码
    @NameInMap("check_code")
    @Validation(required = true)
    public String checkCode;

    public static CheckCheckcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCheckcodeRequest self = new CheckCheckcodeRequest();
        return TeaModel.build(map, self);
    }

    public CheckCheckcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckCheckcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckCheckcodeRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public CheckCheckcodeRequest setCheckCode(String checkCode) {
        this.checkCode = checkCode;
        return this;
    }
    public String getCheckCode() {
        return this.checkCode;
    }

}
