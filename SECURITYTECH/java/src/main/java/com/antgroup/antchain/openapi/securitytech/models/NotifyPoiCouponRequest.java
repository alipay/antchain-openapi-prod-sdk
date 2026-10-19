// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class NotifyPoiCouponRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝小程序用户唯一ID
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 通知模版枚举值：
    // COUPON_RECEIVE_REMIND-优惠券领取提醒（用户接收频次：2周1次）；COUPON_EXPIRE_REMIND-优惠券到期提醒（用户接收频次：1周1次）。
    @NameInMap("notify_template")
    @Validation(required = true)
    public String notifyTemplate;

    // 通知模版内容（JSON格式）
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static NotifyPoiCouponRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyPoiCouponRequest self = new NotifyPoiCouponRequest();
        return TeaModel.build(map, self);
    }

    public NotifyPoiCouponRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyPoiCouponRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyPoiCouponRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public NotifyPoiCouponRequest setNotifyTemplate(String notifyTemplate) {
        this.notifyTemplate = notifyTemplate;
        return this;
    }
    public String getNotifyTemplate() {
        return this.notifyTemplate;
    }

    public NotifyPoiCouponRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
