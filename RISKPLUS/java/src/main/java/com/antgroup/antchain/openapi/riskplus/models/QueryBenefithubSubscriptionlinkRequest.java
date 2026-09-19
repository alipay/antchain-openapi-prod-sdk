// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryBenefithubSubscriptionlinkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 平台码 注：不同平台的平台码都是固定好的，如果传入的平台码有误会抛出平台码错误的信息
    @NameInMap("platform_code")
    @Validation(required = true)
    public String platformCode;

    // 用户id
    @NameInMap("user_unique_id")
    @Validation(required = true)
    public String userUniqueId;

    // 产品code必填，后续多产品时可以区分
    @NameInMap("product_code")
    public String productCode;

    // 渠道、平台方推送的手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 场景配置信息字符串，用于透传
    @NameInMap("scene_config")
    @Validation(required = true)
    public String sceneConfig;

    // 区分流量来源
    @NameInMap("traffic_source")
    public String trafficSource;

    // json字符串包含姓名md5、手机号md5、身份证md5，（非必传，用于后续扩展字段使用）
    @NameInMap("extra_info")
    public String extraInfo;

    public static QueryBenefithubSubscriptionlinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBenefithubSubscriptionlinkRequest self = new QueryBenefithubSubscriptionlinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryBenefithubSubscriptionlinkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBenefithubSubscriptionlinkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBenefithubSubscriptionlinkRequest setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
        return this;
    }
    public String getPlatformCode() {
        return this.platformCode;
    }

    public QueryBenefithubSubscriptionlinkRequest setUserUniqueId(String userUniqueId) {
        this.userUniqueId = userUniqueId;
        return this;
    }
    public String getUserUniqueId() {
        return this.userUniqueId;
    }

    public QueryBenefithubSubscriptionlinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryBenefithubSubscriptionlinkRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryBenefithubSubscriptionlinkRequest setSceneConfig(String sceneConfig) {
        this.sceneConfig = sceneConfig;
        return this;
    }
    public String getSceneConfig() {
        return this.sceneConfig;
    }

    public QueryBenefithubSubscriptionlinkRequest setTrafficSource(String trafficSource) {
        this.trafficSource = trafficSource;
        return this;
    }
    public String getTrafficSource() {
        return this.trafficSource;
    }

    public QueryBenefithubSubscriptionlinkRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
