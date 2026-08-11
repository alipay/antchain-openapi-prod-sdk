// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class QueryAgreementAppRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 小程序用户open_id
    @NameInMap("open_id")
    public String openId;

    // 关联小程序appId
    @NameInMap("associated_app_id")
    public String associatedAppId;

    // 关联的小程序用户openId
    @NameInMap("associated_open_id")
    public String associatedOpenId;

    public static QueryAgreementAppRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAgreementAppRequest self = new QueryAgreementAppRequest();
        return TeaModel.build(map, self);
    }

    public QueryAgreementAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAgreementAppRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAgreementAppRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryAgreementAppRequest setAssociatedAppId(String associatedAppId) {
        this.associatedAppId = associatedAppId;
        return this;
    }
    public String getAssociatedAppId() {
        return this.associatedAppId;
    }

    public QueryAgreementAppRequest setAssociatedOpenId(String associatedOpenId) {
        this.associatedOpenId = associatedOpenId;
        return this;
    }
    public String getAssociatedOpenId() {
        return this.associatedOpenId;
    }

}
