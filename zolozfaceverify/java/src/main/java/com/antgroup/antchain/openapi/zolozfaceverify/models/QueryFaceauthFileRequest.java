// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class QueryFaceauthFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // zoloz认证会话主键
    @NameInMap("zim_id")
    @Validation(required = true)
    public String zimId;

    // 预留扩展业务参数
    @NameInMap("extern_param")
    public String externParam;

    public static QueryFaceauthFileRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceauthFileRequest self = new QueryFaceauthFileRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceauthFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFaceauthFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFaceauthFileRequest setZimId(String zimId) {
        this.zimId = zimId;
        return this;
    }
    public String getZimId() {
        return this.zimId;
    }

    public QueryFaceauthFileRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
