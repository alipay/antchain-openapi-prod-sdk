// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5511b931fbd04feba92b64ebc082aac0.models;

import com.aliyun.tea.*;

public class ConfirmAntchainEkycMultiZimRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实人认证id
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 扩展信息,Map的json格式
    @NameInMap("extern_param")
    public String externParam;

    public static ConfirmAntchainEkycMultiZimRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAntchainEkycMultiZimRequest self = new ConfirmAntchainEkycMultiZimRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmAntchainEkycMultiZimRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmAntchainEkycMultiZimRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmAntchainEkycMultiZimRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public ConfirmAntchainEkycMultiZimRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
