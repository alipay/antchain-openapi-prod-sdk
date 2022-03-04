// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class QueryFaceplusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证会话唯一标识
    @NameInMap("zim_id")
    @Validation(required = true)
    public String zimId;

    // 唯一单号
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 外部参数
    // 
    @NameInMap("extern_param")
    public String externParam;

    public static QueryFaceplusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceplusRequest self = new QueryFaceplusRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceplusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFaceplusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFaceplusRequest setZimId(String zimId) {
        this.zimId = zimId;
        return this;
    }
    public String getZimId() {
        return this.zimId;
    }

    public QueryFaceplusRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryFaceplusRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
