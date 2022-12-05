// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class DetailUserbadgeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 元徽章id
    @NameInMap("poap_meta_id")
    @Validation(required = true, maxLength = 100)
    public String poapMetaId;

    // 支付宝用户id
    @NameInMap("alipay_user_id")
    @Validation(required = true, maxLength = 16, minLength = 16)
    public String alipayUserId;

    public static DetailUserbadgeRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailUserbadgeRequest self = new DetailUserbadgeRequest();
        return TeaModel.build(map, self);
    }

    public DetailUserbadgeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailUserbadgeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailUserbadgeRequest setPoapMetaId(String poapMetaId) {
        this.poapMetaId = poapMetaId;
        return this;
    }
    public String getPoapMetaId() {
        return this.poapMetaId;
    }

    public DetailUserbadgeRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

}
