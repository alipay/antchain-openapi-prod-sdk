// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5511b931fbd04feba92b64ebc082aac0.models;

import com.aliyun.tea.*;

public class InitAntchainEkycSingleZimRequest extends TeaModel {
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
    @NameInMap("zim_id")
    @Validation(required = true)
    public String zimId;

    public static InitAntchainEkycSingleZimRequest build(java.util.Map<String, ?> map) throws Exception {
        InitAntchainEkycSingleZimRequest self = new InitAntchainEkycSingleZimRequest();
        return TeaModel.build(map, self);
    }

    public InitAntchainEkycSingleZimRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitAntchainEkycSingleZimRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitAntchainEkycSingleZimRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public InitAntchainEkycSingleZimRequest setZimId(String zimId) {
        this.zimId = zimId;
        return this;
    }
    public String getZimId() {
        return this.zimId;
    }

}
