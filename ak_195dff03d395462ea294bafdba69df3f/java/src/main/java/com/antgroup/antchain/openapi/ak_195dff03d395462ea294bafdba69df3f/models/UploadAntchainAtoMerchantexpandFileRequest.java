// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class UploadAntchainAtoMerchantexpandFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件名称 包含后缀
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // ● BUSINESS_LICENSE 营业执照 ● CARD_FRONT 身份证正面 ● CARD_BACK 身份证反面 ● SPLITTING 分账 
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    public static UploadAntchainAtoMerchantexpandFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAntchainAtoMerchantexpandFileRequest self = new UploadAntchainAtoMerchantexpandFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadAntchainAtoMerchantexpandFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadAntchainAtoMerchantexpandFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadAntchainAtoMerchantexpandFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadAntchainAtoMerchantexpandFileRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

}
