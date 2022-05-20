// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class QueryCertifyrecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 预留扩展业务参数
    @NameInMap("extern_param")
    public String externParam;

    // certifyId，用于查询认证结果
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    public static QueryCertifyrecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCertifyrecordRequest self = new QueryCertifyrecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryCertifyrecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCertifyrecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCertifyrecordRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public QueryCertifyrecordRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

}
