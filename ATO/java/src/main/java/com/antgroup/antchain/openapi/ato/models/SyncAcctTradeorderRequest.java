// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncAcctTradeorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 关联的签约单号，长度大于6小于50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 平台商统一社会信用代码，长度大于0小于等于32
    @NameInMap("platform_id")
    @Validation(required = true)
    public String platformId;

    // 平台传入的交易订单号，长度大于6小于50
    @NameInMap("acct_trade_order_id")
    @Validation(required = true)
    public String acctTradeOrderId;

    // 交易订单信息，JSON字符串，参考后文 TradeOrderInfoRequest 定义
    @NameInMap("order_info")
    @Validation(required = true)
    public String orderInfo;

    // 商品信息，JSON字符串，参考后文 TradeProductInfoRequest 定义
    @NameInMap("product_info")
    @Validation(required = true)
    public String productInfo;

    // 交易卖家信息，JSON字符串，参考后文 TradeUserInfoRequest 定义；平台账号ID、姓名、身份证号需与关联签约单一致
    @NameInMap("user_info")
    @Validation(required = true)
    public String userInfo;

    // 交易买家信息，JSON字符串，参考后文 TradeThirdUserInfoRequest 定义
    @NameInMap("third_user_info")
    @Validation(required = true)
    public String thirdUserInfo;

    public static SyncAcctTradeorderRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAcctTradeorderRequest self = new SyncAcctTradeorderRequest();
        return TeaModel.build(map, self);
    }

    public SyncAcctTradeorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAcctTradeorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAcctTradeorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncAcctTradeorderRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public SyncAcctTradeorderRequest setAcctTradeOrderId(String acctTradeOrderId) {
        this.acctTradeOrderId = acctTradeOrderId;
        return this;
    }
    public String getAcctTradeOrderId() {
        return this.acctTradeOrderId;
    }

    public SyncAcctTradeorderRequest setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public String getOrderInfo() {
        return this.orderInfo;
    }

    public SyncAcctTradeorderRequest setProductInfo(String productInfo) {
        this.productInfo = productInfo;
        return this;
    }
    public String getProductInfo() {
        return this.productInfo;
    }

    public SyncAcctTradeorderRequest setUserInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public String getUserInfo() {
        return this.userInfo;
    }

    public SyncAcctTradeorderRequest setThirdUserInfo(String thirdUserInfo) {
        this.thirdUserInfo = thirdUserInfo;
        return this;
    }
    public String getThirdUserInfo() {
        return this.thirdUserInfo;
    }

}
