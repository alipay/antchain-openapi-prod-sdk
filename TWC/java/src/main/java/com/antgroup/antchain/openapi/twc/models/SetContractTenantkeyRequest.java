// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SetContractTenantkeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被通信秘钥加密后的解密密钥字符串。
    @NameInMap("file_decrypt_key")
    @Validation(required = true)
    public String fileDecryptKey;

    // 使用base64编码后的RSA公钥；用于解密decryptKey以及加密入参
    @NameInMap("signal_pub_key_encoded")
    public String signalPubKeyEncoded;

    public static SetContractTenantkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetContractTenantkeyRequest self = new SetContractTenantkeyRequest();
        return TeaModel.build(map, self);
    }

    public SetContractTenantkeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetContractTenantkeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetContractTenantkeyRequest setFileDecryptKey(String fileDecryptKey) {
        this.fileDecryptKey = fileDecryptKey;
        return this;
    }
    public String getFileDecryptKey() {
        return this.fileDecryptKey;
    }

    public SetContractTenantkeyRequest setSignalPubKeyEncoded(String signalPubKeyEncoded) {
        this.signalPubKeyEncoded = signalPubKeyEncoded;
        return this;
    }
    public String getSignalPubKeyEncoded() {
        return this.signalPubKeyEncoded;
    }

}
