// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetIpCodeinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 正版码对应的订单上版权方的账户链上ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 订单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 正版码商品信息配置列表
    @NameInMap("goods_info_list")
    public java.util.List<IPCodeGoodsInfo> goodsInfoList;

    // 正版码资源位配置信息列表
    @NameInMap("ad_info_list")
    public java.util.List<IPCodeAdvertisingInfo> adInfoList;

    public static SetIpCodeinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIpCodeinfoRequest self = new SetIpCodeinfoRequest();
        return TeaModel.build(map, self);
    }

    public SetIpCodeinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetIpCodeinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetIpCodeinfoRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public SetIpCodeinfoRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SetIpCodeinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SetIpCodeinfoRequest setGoodsInfoList(java.util.List<IPCodeGoodsInfo> goodsInfoList) {
        this.goodsInfoList = goodsInfoList;
        return this;
    }
    public java.util.List<IPCodeGoodsInfo> getGoodsInfoList() {
        return this.goodsInfoList;
    }

    public SetIpCodeinfoRequest setAdInfoList(java.util.List<IPCodeAdvertisingInfo> adInfoList) {
        this.adInfoList = adInfoList;
        return this;
    }
    public java.util.List<IPCodeAdvertisingInfo> getAdInfoList() {
        return this.adInfoList;
    }

}
