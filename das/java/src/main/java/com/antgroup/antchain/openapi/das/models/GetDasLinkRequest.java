// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class GetDasLinkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被授权人接入应用biz_uuid
    @NameInMap("be_authed_person_app_biz_uuid")
    @Validation(required = true)
    public String beAuthedPersonAppBizUuid;

    public static GetDasLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDasLinkRequest self = new GetDasLinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDasLinkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDasLinkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDasLinkRequest setBeAuthedPersonAppBizUuid(String beAuthedPersonAppBizUuid) {
        this.beAuthedPersonAppBizUuid = beAuthedPersonAppBizUuid;
        return this;
    }
    public String getBeAuthedPersonAppBizUuid() {
        return this.beAuthedPersonAppBizUuid;
    }

}
