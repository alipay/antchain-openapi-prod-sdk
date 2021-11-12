// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IpChannelWithSku extends TeaModel {
    // 渠道名字
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 授权模式 商品授权 0普通授权/1独家授权 本期只有0
    // 
    @NameInMap("authorization_mode")
    @Validation(required = true)
    public Long authorizationMode;

    // 新授权模式，0普通授权，1独家授权，支持多选
    @NameInMap("new_authorization_model")
    public java.util.List<Long> newAuthorizationModel;

    // 计费模式 0:按量 1:按金额
    // 
    @NameInMap("pay_mode")
    @Validation(required = true)
    public Long payMode;

    // ip等级  0:经典IP/1:流量IP/2:设计IP
    @NameInMap("ip_level")
    @Validation(required = true)
    public Long ipLevel;

    // sku信息
    @NameInMap("sku_info")
    @Validation(required = true)
    public java.util.List<IpSkuInfo> skuInfo;

    // 商品状态（0:待上架，1:上架，2:下架）
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 交易是否需要确认
    @NameInMap("trade_need_confirm")
    public Boolean tradeNeedConfirm;

    // 授权类型
    @NameInMap("authorization_type")
    public java.util.List<String> authorizationType;

    public static IpChannelWithSku build(java.util.Map<String, ?> map) throws Exception {
        IpChannelWithSku self = new IpChannelWithSku();
        return TeaModel.build(map, self);
    }

    public IpChannelWithSku setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public IpChannelWithSku setAuthorizationMode(Long authorizationMode) {
        this.authorizationMode = authorizationMode;
        return this;
    }
    public Long getAuthorizationMode() {
        return this.authorizationMode;
    }

    public IpChannelWithSku setNewAuthorizationModel(java.util.List<Long> newAuthorizationModel) {
        this.newAuthorizationModel = newAuthorizationModel;
        return this;
    }
    public java.util.List<Long> getNewAuthorizationModel() {
        return this.newAuthorizationModel;
    }

    public IpChannelWithSku setPayMode(Long payMode) {
        this.payMode = payMode;
        return this;
    }
    public Long getPayMode() {
        return this.payMode;
    }

    public IpChannelWithSku setIpLevel(Long ipLevel) {
        this.ipLevel = ipLevel;
        return this;
    }
    public Long getIpLevel() {
        return this.ipLevel;
    }

    public IpChannelWithSku setSkuInfo(java.util.List<IpSkuInfo> skuInfo) {
        this.skuInfo = skuInfo;
        return this;
    }
    public java.util.List<IpSkuInfo> getSkuInfo() {
        return this.skuInfo;
    }

    public IpChannelWithSku setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public IpChannelWithSku setTradeNeedConfirm(Boolean tradeNeedConfirm) {
        this.tradeNeedConfirm = tradeNeedConfirm;
        return this;
    }
    public Boolean getTradeNeedConfirm() {
        return this.tradeNeedConfirm;
    }

    public IpChannelWithSku setAuthorizationType(java.util.List<String> authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public java.util.List<String> getAuthorizationType() {
        return this.authorizationType;
    }

}
