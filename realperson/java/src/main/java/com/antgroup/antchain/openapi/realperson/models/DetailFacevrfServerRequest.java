// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class DetailFacevrfServerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实人认证唯一标识
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 预留扩展业务参数
    @NameInMap("extern_param")
    public String externParam;

    public static DetailFacevrfServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailFacevrfServerRequest self = new DetailFacevrfServerRequest();
        return TeaModel.build(map, self);
    }

    public DetailFacevrfServerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailFacevrfServerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailFacevrfServerRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public DetailFacevrfServerRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
