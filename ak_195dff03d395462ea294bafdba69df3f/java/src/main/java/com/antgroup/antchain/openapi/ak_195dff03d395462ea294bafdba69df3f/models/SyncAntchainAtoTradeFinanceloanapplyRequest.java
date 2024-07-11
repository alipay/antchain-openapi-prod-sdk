// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class SyncAntchainAtoTradeFinanceloanapplyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id 
    @NameInMap("order_id")
    @Validation(maxLength = 50, minLength = 1)
    public String orderId;

    // 订单所属商户的社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String merchantId;

    // 融资放款申请接口
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 资方的社会信用代码
    @NameInMap("fund_id")
    @Validation(maxLength = 64)
    public String fundId;

    // 类型
    // ● 默认为：ORDER, 单订单申请
    // ● PACKAGE_ORDER , 资产包订单模式
    @NameInMap("type")
    public String type;

    // 资产包id
    // type = PACKAGE_ORDER ， 必填
    @NameInMap("asset_package_id")
    @Validation(maxLength = 50, minLength = 6)
    public String assetPackageId;

    // type = PACKAGE_ORDER ， 必填
    // 
    // ● APPEND: 追加订单列表
    // ● FINIISH : 结束
    @NameInMap("stage")
    public String stage;

    // 订单id列表的jsonArray
    @NameInMap("order_id_list")
    public String orderIdList;

    public static SyncAntchainAtoTradeFinanceloanapplyRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainAtoTradeFinanceloanapplyRequest self = new SyncAntchainAtoTradeFinanceloanapplyRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainAtoTradeFinanceloanapplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainAtoTradeFinanceloanapplyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainAtoTradeFinanceloanapplyRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncAntchainAtoTradeFinanceloanapplyRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncAntchainAtoTradeFinanceloanapplyRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public SyncAntchainAtoTradeFinanceloanapplyRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public SyncAntchainAtoTradeFinanceloanapplyRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SyncAntchainAtoTradeFinanceloanapplyRequest setAssetPackageId(String assetPackageId) {
        this.assetPackageId = assetPackageId;
        return this;
    }
    public String getAssetPackageId() {
        return this.assetPackageId;
    }

    public SyncAntchainAtoTradeFinanceloanapplyRequest setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public SyncAntchainAtoTradeFinanceloanapplyRequest setOrderIdList(String orderIdList) {
        this.orderIdList = orderIdList;
        return this;
    }
    public String getOrderIdList() {
        return this.orderIdList;
    }

}
