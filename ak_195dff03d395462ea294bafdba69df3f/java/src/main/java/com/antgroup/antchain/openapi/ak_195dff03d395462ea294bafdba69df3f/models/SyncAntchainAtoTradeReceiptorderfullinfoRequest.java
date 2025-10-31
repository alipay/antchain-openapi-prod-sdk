// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class SyncAntchainAtoTradeReceiptorderfullinfoRequest extends TeaModel {
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

    public static SyncAntchainAtoTradeReceiptorderfullinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainAtoTradeReceiptorderfullinfoRequest self = new SyncAntchainAtoTradeReceiptorderfullinfoRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainAtoTradeReceiptorderfullinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainAtoTradeReceiptorderfullinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainAtoTradeReceiptorderfullinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncAntchainAtoTradeReceiptorderfullinfoRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncAntchainAtoTradeReceiptorderfullinfoRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public SyncAntchainAtoTradeReceiptorderfullinfoRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public SyncAntchainAtoTradeReceiptorderfullinfoRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public SyncAntchainAtoTradeReceiptorderfullinfoRequest setReceiptOrderInfo(String receiptOrderInfo) {
        this.receiptOrderInfo = receiptOrderInfo;
        return this;
    }
    public String getReceiptOrderInfo() {
        return this.receiptOrderInfo;
    }

    public SyncAntchainAtoTradeReceiptorderfullinfoRequest setProductInfo(String productInfo) {
        this.productInfo = productInfo;
        return this;
    }
    public String getProductInfo() {
        return this.productInfo;
    }

}
