// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class ApplyOauthUserinfotokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // accessToken请求
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    // 拉起页面的场景
    // nft_details 订单详情页
    // oauth_page 授权登陆页
    @NameInMap("page_token_scene")
    @Validation(required = true)
    public String pageTokenScene;

    public static ApplyOauthUserinfotokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyOauthUserinfotokenRequest self = new ApplyOauthUserinfotokenRequest();
        return TeaModel.build(map, self);
    }

    public ApplyOauthUserinfotokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyOauthUserinfotokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyOauthUserinfotokenRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ApplyOauthUserinfotokenRequest setPageTokenScene(String pageTokenScene) {
        this.pageTokenScene = pageTokenScene;
        return this;
    }
    public String getPageTokenScene() {
        return this.pageTokenScene;
    }

}
