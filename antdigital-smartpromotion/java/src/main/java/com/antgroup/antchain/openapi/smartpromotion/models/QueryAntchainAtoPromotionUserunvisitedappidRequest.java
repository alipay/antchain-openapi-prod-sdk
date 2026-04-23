// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoPromotionUserunvisitedappidRequest extends TeaModel {
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

    public static QueryAntchainAtoPromotionUserunvisitedappidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoPromotionUserunvisitedappidRequest self = new QueryAntchainAtoPromotionUserunvisitedappidRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoPromotionUserunvisitedappidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoPromotionUserunvisitedappidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoPromotionUserunvisitedappidRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAntchainAtoPromotionUserunvisitedappidRequest setAppIdList(java.util.List<String> appIdList) {
        this.appIdList = appIdList;
        return this;
    }
    public java.util.List<String> getAppIdList() {
        return this.appIdList;
    }

    public QueryAntchainAtoPromotionUserunvisitedappidRequest setDefaultAppId(String defaultAppId) {
        this.defaultAppId = defaultAppId;
        return this;
    }
    public String getDefaultAppId() {
        return this.defaultAppId;
    }

}
