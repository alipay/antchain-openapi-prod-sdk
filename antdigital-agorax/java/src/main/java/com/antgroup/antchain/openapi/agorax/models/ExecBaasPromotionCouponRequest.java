// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class ExecBaasPromotionCouponRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // openId
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // appId
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 活动ID，由运营线下通知分配
    @NameInMap("activity_id")
    @Validation(required = true)
    public String activityId;

    // 奖品ID，需要指定奖品抽奖时传入
    @NameInMap("prize_id")
    public String prizeId;

    public static ExecBaasPromotionCouponRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecBaasPromotionCouponRequest self = new ExecBaasPromotionCouponRequest();
        return TeaModel.build(map, self);
    }

    public ExecBaasPromotionCouponRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecBaasPromotionCouponRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecBaasPromotionCouponRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ExecBaasPromotionCouponRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public ExecBaasPromotionCouponRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ExecBaasPromotionCouponRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public ExecBaasPromotionCouponRequest setPrizeId(String prizeId) {
        this.prizeId = prizeId;
        return this;
    }
    public String getPrizeId() {
        return this.prizeId;
    }

}
