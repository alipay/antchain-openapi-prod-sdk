// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class AddIpChannelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础字段
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // ip的链上id
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // 渠道信息
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 商品授权 0普通授权/1独家授权,本期只支持0
    @NameInMap("authorization_model")
    public Long authorizationModel;

    // 新授权模式，0普通授权，1独家授权，支持多选
    @NameInMap("new_authorization_model")
    public java.util.List<Long> newAuthorizationModel;

    // 授权类型，衍生品授权；营销授权；商标授权；数字虚拟授权；其他
    @NameInMap("authorization_type")
    public java.util.List<String> authorizationType;

    // 计费模式 0:按量 1:按金额
    @NameInMap("pay_mode")
    public Long payMode;

    // ip等级  0:经典IP/1:流量IP/2:设计IP
    @NameInMap("ip_level")
    public Long ipLevel;

    // 交易是否需要确认，默认需要确认
    @NameInMap("trade_need_confirm")
    public Boolean tradeNeedConfirm;

    // 保底金区间，0：0；1：10万以下；2:10-30万；3:30-50万；4:50万以上
    @NameInMap("guarantee_range")
    public Long guaranteeRange;

    // 交易模式
    @NameInMap("ip_trade_mode")
    public IPTradeMode ipTradeMode;

    public static AddIpChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIpChannelRequest self = new AddIpChannelRequest();
        return TeaModel.build(map, self);
    }

    public AddIpChannelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddIpChannelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddIpChannelRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public AddIpChannelRequest setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public AddIpChannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public AddIpChannelRequest setAuthorizationModel(Long authorizationModel) {
        this.authorizationModel = authorizationModel;
        return this;
    }
    public Long getAuthorizationModel() {
        return this.authorizationModel;
    }

    public AddIpChannelRequest setNewAuthorizationModel(java.util.List<Long> newAuthorizationModel) {
        this.newAuthorizationModel = newAuthorizationModel;
        return this;
    }
    public java.util.List<Long> getNewAuthorizationModel() {
        return this.newAuthorizationModel;
    }

    public AddIpChannelRequest setAuthorizationType(java.util.List<String> authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public java.util.List<String> getAuthorizationType() {
        return this.authorizationType;
    }

    public AddIpChannelRequest setPayMode(Long payMode) {
        this.payMode = payMode;
        return this;
    }
    public Long getPayMode() {
        return this.payMode;
    }

    public AddIpChannelRequest setIpLevel(Long ipLevel) {
        this.ipLevel = ipLevel;
        return this;
    }
    public Long getIpLevel() {
        return this.ipLevel;
    }

    public AddIpChannelRequest setTradeNeedConfirm(Boolean tradeNeedConfirm) {
        this.tradeNeedConfirm = tradeNeedConfirm;
        return this;
    }
    public Boolean getTradeNeedConfirm() {
        return this.tradeNeedConfirm;
    }

    public AddIpChannelRequest setGuaranteeRange(Long guaranteeRange) {
        this.guaranteeRange = guaranteeRange;
        return this;
    }
    public Long getGuaranteeRange() {
        return this.guaranteeRange;
    }

    public AddIpChannelRequest setIpTradeMode(IPTradeMode ipTradeMode) {
        this.ipTradeMode = ipTradeMode;
        return this;
    }
    public IPTradeMode getIpTradeMode() {
        return this.ipTradeMode;
    }

}
