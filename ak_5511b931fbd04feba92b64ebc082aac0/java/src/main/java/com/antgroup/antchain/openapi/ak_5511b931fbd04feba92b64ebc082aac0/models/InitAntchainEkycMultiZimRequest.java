// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5511b931fbd04feba92b64ebc082aac0.models;

import com.aliyun.tea.*;

public class InitAntchainEkycMultiZimRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 环境参数
    @NameInMap("meta_info")
    @Validation(required = true)
    public String metaInfo;

    // 实人认证id
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 产品类型
    @NameInMap("product_type")
    @Validation(required = true)
    public String productType;

    public static InitAntchainEkycMultiZimRequest build(java.util.Map<String, ?> map) throws Exception {
        InitAntchainEkycMultiZimRequest self = new InitAntchainEkycMultiZimRequest();
        return TeaModel.build(map, self);
    }

    public InitAntchainEkycMultiZimRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitAntchainEkycMultiZimRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitAntchainEkycMultiZimRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public InitAntchainEkycMultiZimRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public InitAntchainEkycMultiZimRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
