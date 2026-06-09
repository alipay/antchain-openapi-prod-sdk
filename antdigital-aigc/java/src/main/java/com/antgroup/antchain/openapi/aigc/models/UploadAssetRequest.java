// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aigc.models;

import com.aliyun.tea.*;

public class UploadAssetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产类型
    @NameInMap("asset_type")
    @Validation(required = true)
    public String assetType;

    // 文件公网可访问 URL
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 测试
    @NameInMap("asset_name")
    @Validation(required = true)
    public String assetName;

    // 资产分组 ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    public static UploadAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAssetRequest self = new UploadAssetRequest();
        return TeaModel.build(map, self);
    }

    public UploadAssetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadAssetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadAssetRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public UploadAssetRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadAssetRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public UploadAssetRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
