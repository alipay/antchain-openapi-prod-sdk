// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class AntCloudProdProviderHttpResponse extends TeaModel {
    // maya返回结果
    @NameInMap("response")
    @Validation(required = true)
    public MayaStreamResult response;

    // 签名
    @NameInMap("sign")
    @Validation(required = true)
    public String sign;

    public static AntCloudProdProviderHttpResponse build(java.util.Map<String, ?> map) throws Exception {
        AntCloudProdProviderHttpResponse self = new AntCloudProdProviderHttpResponse();
        return TeaModel.build(map, self);
    }

    public AntCloudProdProviderHttpResponse setResponse(MayaStreamResult response) {
        this.response = response;
        return this;
    }
    public MayaStreamResult getResponse() {
        return this.response;
    }

    public AntCloudProdProviderHttpResponse setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

}
