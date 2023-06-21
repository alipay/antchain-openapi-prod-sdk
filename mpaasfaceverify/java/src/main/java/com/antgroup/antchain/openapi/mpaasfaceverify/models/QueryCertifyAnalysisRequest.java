// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class QueryCertifyAnalysisRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证单据号
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 接入方场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 预留扩展业务参数
    @NameInMap("extern_param")
    public String externParam;

    public static QueryCertifyAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCertifyAnalysisRequest self = new QueryCertifyAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public QueryCertifyAnalysisRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCertifyAnalysisRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCertifyAnalysisRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public QueryCertifyAnalysisRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryCertifyAnalysisRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
