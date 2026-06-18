// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class FreezeMallPointRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝小程序用户唯一ID
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 门店ID
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 账户ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 收货信息
    @NameInMap("receiver_info")
    @Validation(required = true)
    public PointReceiverInfo receiverInfo;

    // 订单信息（子）
    @NameInMap("order_info_list")
    @Validation(required = true)
    public java.util.List<PointOrderInfo> orderInfoList;

    // 扩展字段
    @NameInMap("extra_info")
    public String extraInfo;

    public static FreezeMallPointRequest build(java.util.Map<String, ?> map) throws Exception {
        FreezeMallPointRequest self = new FreezeMallPointRequest();
        return TeaModel.build(map, self);
    }

    public FreezeMallPointRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FreezeMallPointRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FreezeMallPointRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public FreezeMallPointRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public FreezeMallPointRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public FreezeMallPointRequest setReceiverInfo(PointReceiverInfo receiverInfo) {
        this.receiverInfo = receiverInfo;
        return this;
    }
    public PointReceiverInfo getReceiverInfo() {
        return this.receiverInfo;
    }

    public FreezeMallPointRequest setOrderInfoList(java.util.List<PointOrderInfo> orderInfoList) {
        this.orderInfoList = orderInfoList;
        return this;
    }
    public java.util.List<PointOrderInfo> getOrderInfoList() {
        return this.orderInfoList;
    }

    public FreezeMallPointRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
