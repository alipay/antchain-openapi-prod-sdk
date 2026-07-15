// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class ExecPromotionConsultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户 open_id
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 支付宝小程序 App ID
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 支付宝小程序 App ID
    @NameInMap("activity_id")
    @Validation(required = true)
    public String activityId;

    public static ExecPromotionConsultRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecPromotionConsultRequest self = new ExecPromotionConsultRequest();
        return TeaModel.build(map, self);
    }

    public ExecPromotionConsultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecPromotionConsultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecPromotionConsultRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public ExecPromotionConsultRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ExecPromotionConsultRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

}
