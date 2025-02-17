// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class GetApplicationProxysignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 代签名相关参数
    @NameInMap("sign_params")
    @Validation(required = true)
    public String signParams;

    // 对应的服务id
    @NameInMap("data_set_id")
    public String dataSetId;

    public static GetApplicationProxysignRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationProxysignRequest self = new GetApplicationProxysignRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationProxysignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetApplicationProxysignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetApplicationProxysignRequest setSignParams(String signParams) {
        this.signParams = signParams;
        return this;
    }
    public String getSignParams() {
        return this.signParams;
    }

    public GetApplicationProxysignRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

}
