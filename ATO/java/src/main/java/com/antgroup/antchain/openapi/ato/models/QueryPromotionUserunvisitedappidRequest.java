// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryPromotionUserunvisitedappidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝用户uid
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 订阅的appid列表，不支持的appid会自动忽略
    @NameInMap("app_id_list")
    @Validation(required = true)
    public java.util.List<String> appIdList;

    // 默认appid，无法判断推荐结果时返回此默认值
    @NameInMap("default_app_id")
    @Validation(required = true)
    public String defaultAppId;

    public static QueryPromotionUserunvisitedappidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPromotionUserunvisitedappidRequest self = new QueryPromotionUserunvisitedappidRequest();
        return TeaModel.build(map, self);
    }

    public QueryPromotionUserunvisitedappidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPromotionUserunvisitedappidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPromotionUserunvisitedappidRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryPromotionUserunvisitedappidRequest setAppIdList(java.util.List<String> appIdList) {
        this.appIdList = appIdList;
        return this;
    }
    public java.util.List<String> getAppIdList() {
        return this.appIdList;
    }

    public QueryPromotionUserunvisitedappidRequest setDefaultAppId(String defaultAppId) {
        this.defaultAppId = defaultAppId;
        return this;
    }
    public String getDefaultAppId() {
        return this.defaultAppId;
    }

}
