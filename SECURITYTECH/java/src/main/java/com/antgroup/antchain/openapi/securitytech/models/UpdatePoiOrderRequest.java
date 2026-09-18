// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class UpdatePoiOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝小程序用户唯一ID
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 商户入驻主体ID
    @NameInMap("merchant_id")
    public String merchantId;

    // 商城订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 履约状态：SHIPPED-已发货 / RECEIVED-已确认收货
    @NameInMap("fulfill_status")
    @Validation(required = true)
    public String fulfillStatus;

    // 状态发生业务时间，格式yyyy-MM-dd HH:mm:ss，建议传入便于对账
    @NameInMap("status_gmt")
    public String statusGmt;

    public static UpdatePoiOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePoiOrderRequest self = new UpdatePoiOrderRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePoiOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdatePoiOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdatePoiOrderRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public UpdatePoiOrderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public UpdatePoiOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdatePoiOrderRequest setFulfillStatus(String fulfillStatus) {
        this.fulfillStatus = fulfillStatus;
        return this;
    }
    public String getFulfillStatus() {
        return this.fulfillStatus;
    }

    public UpdatePoiOrderRequest setStatusGmt(String statusGmt) {
        this.statusGmt = statusGmt;
        return this;
    }
    public String getStatusGmt() {
        return this.statusGmt;
    }

}
