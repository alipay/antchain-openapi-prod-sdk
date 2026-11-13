// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class UploadMaasAssetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 幂等标识，由客户端生成
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 文件公网可访问 URL
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 资产类型
    @NameInMap("asset_type")
    @Validation(required = true)
    public String assetType;

    // 资产名称
    @NameInMap("asset_name")
    @Validation(required = true)
    public String assetName;

    public static UploadMaasAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMaasAssetRequest self = new UploadMaasAssetRequest();
        return TeaModel.build(map, self);
    }

    public UploadMaasAssetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadMaasAssetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadMaasAssetRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadMaasAssetRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadMaasAssetRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public UploadMaasAssetRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

}
