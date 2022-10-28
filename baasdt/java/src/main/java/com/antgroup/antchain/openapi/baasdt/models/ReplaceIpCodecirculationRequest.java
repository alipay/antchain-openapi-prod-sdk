// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ReplaceIpCodecirculationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 数字凭证加密编码或UNI序列号
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 领取用户的名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 领取用户的手机号
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 当前持有人手机号
    @NameInMap("seller_phone_number")
    @Validation(required = true)
    public String sellerPhoneNumber;

    // 外部客户自定义客户ID
    @NameInMap("external_user_id")
    public String externalUserId;

    // 用户头像地址
    @NameInMap("avatar")
    public String avatar;

    // 领取用户的位置信息
    @NameInMap("gps")
    public String gps;

    // 交易单ID
    @NameInMap("flow_order_id")
    @Validation(required = true)
    public String flowOrderId;

    // 交易金额
    @NameInMap("flow_amount")
    @Validation(required = true)
    public String flowAmount;

    // 流转交易平台
    @NameInMap("flow_trade_platform")
    @Validation(required = true)
    public String flowTradePlatform;

    // 商品名称
    @NameInMap("flow_goods_name")
    public String flowGoodsName;

    // 交易时间戳
    @NameInMap("flow_transaction_time")
    @Validation(required = true)
    public Long flowTransactionTime;

    // 流转信息jsonstring
    @NameInMap("ext_info")
    public String extInfo;

    public static ReplaceIpCodecirculationRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceIpCodecirculationRequest self = new ReplaceIpCodecirculationRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceIpCodecirculationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReplaceIpCodecirculationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReplaceIpCodecirculationRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ReplaceIpCodecirculationRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReplaceIpCodecirculationRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ReplaceIpCodecirculationRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ReplaceIpCodecirculationRequest setSellerPhoneNumber(String sellerPhoneNumber) {
        this.sellerPhoneNumber = sellerPhoneNumber;
        return this;
    }
    public String getSellerPhoneNumber() {
        return this.sellerPhoneNumber;
    }

    public ReplaceIpCodecirculationRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public ReplaceIpCodecirculationRequest setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public ReplaceIpCodecirculationRequest setGps(String gps) {
        this.gps = gps;
        return this;
    }
    public String getGps() {
        return this.gps;
    }

    public ReplaceIpCodecirculationRequest setFlowOrderId(String flowOrderId) {
        this.flowOrderId = flowOrderId;
        return this;
    }
    public String getFlowOrderId() {
        return this.flowOrderId;
    }

    public ReplaceIpCodecirculationRequest setFlowAmount(String flowAmount) {
        this.flowAmount = flowAmount;
        return this;
    }
    public String getFlowAmount() {
        return this.flowAmount;
    }

    public ReplaceIpCodecirculationRequest setFlowTradePlatform(String flowTradePlatform) {
        this.flowTradePlatform = flowTradePlatform;
        return this;
    }
    public String getFlowTradePlatform() {
        return this.flowTradePlatform;
    }

    public ReplaceIpCodecirculationRequest setFlowGoodsName(String flowGoodsName) {
        this.flowGoodsName = flowGoodsName;
        return this;
    }
    public String getFlowGoodsName() {
        return this.flowGoodsName;
    }

    public ReplaceIpCodecirculationRequest setFlowTransactionTime(Long flowTransactionTime) {
        this.flowTransactionTime = flowTransactionTime;
        return this;
    }
    public Long getFlowTransactionTime() {
        return this.flowTransactionTime;
    }

    public ReplaceIpCodecirculationRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
