// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class GetUserSharecodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分享者账号，如果账号类型为手机号则格式如 +86-11 位手机号，如果账号类型为支付宝账号，则填写邮箱地址或者 11 位手机号
    @NameInMap("sharer_id")
    @Validation(required = true)
    public String sharerId;

    // 分享者账号类型，PHONE：手机号，ALIPAY_LOGON_ID：支付宝账号
    @NameInMap("sharer_id_type")
    @Validation(required = true)
    public String sharerIdType;

    public static GetUserSharecodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserSharecodeRequest self = new GetUserSharecodeRequest();
        return TeaModel.build(map, self);
    }

    public GetUserSharecodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetUserSharecodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetUserSharecodeRequest setSharerId(String sharerId) {
        this.sharerId = sharerId;
        return this;
    }
    public String getSharerId() {
        return this.sharerId;
    }

    public GetUserSharecodeRequest setSharerIdType(String sharerIdType) {
        this.sharerIdType = sharerIdType;
        return this;
    }
    public String getSharerIdType() {
        return this.sharerIdType;
    }

}
