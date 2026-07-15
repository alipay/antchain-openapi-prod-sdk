// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class ExecPromotionCouponRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // open_id
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // appId
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 活动ID
    @NameInMap("activity_id")
    @Validation(required = true)
    public String activityId;

    // 奖品ID，需要指定奖品抽奖时传入
    @NameInMap("prize_id")
    public String prizeId;

    public static ExecPromotionCouponRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecPromotionCouponRequest self = new ExecPromotionCouponRequest();
        return TeaModel.build(map, self);
    }

    public ExecPromotionCouponRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecPromotionCouponRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecPromotionCouponRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ExecPromotionCouponRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public ExecPromotionCouponRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ExecPromotionCouponRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public ExecPromotionCouponRequest setPrizeId(String prizeId) {
        this.prizeId = prizeId;
        return this;
    }
    public String getPrizeId() {
        return this.prizeId;
    }

}
