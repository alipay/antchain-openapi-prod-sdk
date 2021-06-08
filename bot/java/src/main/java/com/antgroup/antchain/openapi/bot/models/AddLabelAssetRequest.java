// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AddLabelAssetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 标签Id
    @NameInMap("label_id")
    @Validation(required = true)
    public String labelId;

    // 资产Id
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    public static AddLabelAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLabelAssetRequest self = new AddLabelAssetRequest();
        return TeaModel.build(map, self);
    }

    public AddLabelAssetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddLabelAssetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddLabelAssetRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public AddLabelAssetRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

    public AddLabelAssetRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

}
