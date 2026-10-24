// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncAcctOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 平台传入的签约单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 平台商统一社会信用代码
    @NameInMap("platform_id")
    @Validation(required = true)
    public String platformId;

    // 平台商名称
    @NameInMap("platform_name")
    @Validation(required = true)
    public String platformName;

    // 签约单信息，JSON字符串，参考后文 OrderInfoRequest 定义
    @NameInMap("order_info")
    @Validation(required = true)
    public String orderInfo;

    // 卖家信息，JSON字符串，参考后文 UserInfoRequest 定义
    @NameInMap("user_info")
    @Validation(required = true)
    public String userInfo;

    public static SyncAcctOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAcctOrderRequest self = new SyncAcctOrderRequest();
        return TeaModel.build(map, self);
    }

    public SyncAcctOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAcctOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAcctOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncAcctOrderRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public SyncAcctOrderRequest setPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }
    public String getPlatformName() {
        return this.platformName;
    }

    public SyncAcctOrderRequest setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public String getOrderInfo() {
        return this.orderInfo;
    }

    public SyncAcctOrderRequest setUserInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public String getUserInfo() {
        return this.userInfo;
    }

}
