// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class DescribeImportassetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 物权凭证id
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 信息内容JSON格式
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static DescribeImportassetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportassetRequest self = new DescribeImportassetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImportassetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DescribeImportassetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DescribeImportassetRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public DescribeImportassetRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeImportassetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
