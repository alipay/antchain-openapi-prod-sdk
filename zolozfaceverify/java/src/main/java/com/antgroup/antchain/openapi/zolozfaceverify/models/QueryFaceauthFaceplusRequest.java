// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class QueryFaceauthFaceplusRequest extends TeaModel {
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
    @NameInMap("extern_param")
    public String externParam;

    public static QueryFaceauthFaceplusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceauthFaceplusRequest self = new QueryFaceauthFaceplusRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceauthFaceplusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFaceauthFaceplusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFaceauthFaceplusRequest setZimId(String zimId) {
        this.zimId = zimId;
        return this;
    }
    public String getZimId() {
        return this.zimId;
    }

    public QueryFaceauthFaceplusRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryFaceauthFaceplusRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
