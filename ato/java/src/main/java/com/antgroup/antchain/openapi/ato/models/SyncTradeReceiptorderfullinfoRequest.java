// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncTradeReceiptorderfullinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 49, minLength = 7)
    public String orderId;

    // 商户社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 63, minLength = 1)
    public String merchantId;

    // 商户公司名字
    @NameInMap("merchant_name")
    @Validation(required = true, maxLength = 199, minLength = 1)
    public String merchantName;

    // 场景码
    @NameInMap("biz_scene")
    @Validation(required = true, minLength = 1)
    public String bizScene;

    // 业务类型
    @NameInMap("biz_type")
    @Validation(required = true, minLength = 1)
    public String bizType;

    // 主订单信息，资产订单定义
    @NameInMap("receipt_order_info")
    @Validation(required = true, minLength = 1)
    public String receiptOrderInfo;

    // 订单包含的商品信息
    @NameInMap("product_info")
    @Validation(required = true, minLength = 1)
    public String productInfo;

    public static SyncTradeReceiptorderfullinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncTradeReceiptorderfullinfoRequest self = new SyncTradeReceiptorderfullinfoRequest();
        return TeaModel.build(map, self);
    }

    public SyncTradeReceiptorderfullinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncTradeReceiptorderfullinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncTradeReceiptorderfullinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncTradeReceiptorderfullinfoRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncTradeReceiptorderfullinfoRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public SyncTradeReceiptorderfullinfoRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public SyncTradeReceiptorderfullinfoRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public SyncTradeReceiptorderfullinfoRequest setReceiptOrderInfo(String receiptOrderInfo) {
        this.receiptOrderInfo = receiptOrderInfo;
        return this;
    }
    public String getReceiptOrderInfo() {
        return this.receiptOrderInfo;
    }

    public SyncTradeReceiptorderfullinfoRequest setProductInfo(String productInfo) {
        this.productInfo = productInfo;
        return this;
    }
    public String getProductInfo() {
        return this.productInfo;
    }

}
