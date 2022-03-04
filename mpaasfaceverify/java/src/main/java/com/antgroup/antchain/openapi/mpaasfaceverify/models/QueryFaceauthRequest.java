// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class QueryFaceauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务单据号，用于核对和排查
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 预留扩展业务参数
    @NameInMap("extern_param")
    public String externParam;

    // zimId，用于查询认证结果
    @NameInMap("zim_id")
    @Validation(required = true)
    public String zimId;

    public static QueryFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceauthRequest self = new QueryFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFaceauthRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryFaceauthRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public QueryFaceauthRequest setZimId(String zimId) {
        this.zimId = zimId;
        return this;
    }
    public String getZimId() {
        return this.zimId;
    }

}
