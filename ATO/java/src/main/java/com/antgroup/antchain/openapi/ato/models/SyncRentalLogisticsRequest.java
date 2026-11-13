// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncRentalLogisticsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商户社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 物流信息，JSON字符串，RentalLogisticsRequest定义
    @NameInMap("logistics_info")
    @Validation(required = true)
    public String logisticsInfo;

    public static SyncRentalLogisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRentalLogisticsRequest self = new SyncRentalLogisticsRequest();
        return TeaModel.build(map, self);
    }

    public SyncRentalLogisticsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncRentalLogisticsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncRentalLogisticsRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncRentalLogisticsRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncRentalLogisticsRequest setLogisticsInfo(String logisticsInfo) {
        this.logisticsInfo = logisticsInfo;
        return this;
    }
    public String getLogisticsInfo() {
        return this.logisticsInfo;
    }

}
