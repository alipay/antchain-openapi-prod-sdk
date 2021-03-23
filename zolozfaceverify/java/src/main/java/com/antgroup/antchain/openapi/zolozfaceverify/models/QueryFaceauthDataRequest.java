// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class QueryFaceauthDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 数据地址
    @NameInMap("data_url")
    @Validation(required = true)
    public String dataUrl;

    public static QueryFaceauthDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceauthDataRequest self = new QueryFaceauthDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceauthDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFaceauthDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFaceauthDataRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryFaceauthDataRequest setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
        return this;
    }
    public String getDataUrl() {
        return this.dataUrl;
    }

}
