// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IpChannelInfo extends TeaModel {
    // 渠道名字
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 授权模式 商品授权 0普通授权/1独家授权  本期只有0
    @NameInMap("authorization_mode")
    @Validation(required = true)
    public Long authorizationMode;

    // 计费模式 0:按量 1:按金额
    @NameInMap("pay_mode")
    @Validation(required = true)
    public Long payMode;

    // ip等级 （5位数字） 对应a，0:经典IP/1:流量IP/2:设计IP
    @NameInMap("ip_level")
    @Validation(required = true)
    public Long ipLevel;

    // 商品状态（0:待上架，1:上架，2:下架）
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 交易是否需要确认
    @NameInMap("trade_need_confirm")
    public Boolean tradeNeedConfirm;

    // 保底金区间，0：0；1：10万以下；2:10-30万；3:30-50万；4:50万以上
    @NameInMap("guarantee_range")
    public Long guaranteeRange;

    // 交易模式
    @NameInMap("ip_trade_mode")
    public IPTradeMode ipTradeMode;

    // 授权行业
    @NameInMap("authorization_industry")
    public java.util.List<String> authorizationIndustry;

    public static IpChannelInfo build(java.util.Map<String, ?> map) throws Exception {
        IpChannelInfo self = new IpChannelInfo();
        return TeaModel.build(map, self);
    }

    public IpChannelInfo setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public IpChannelInfo setAuthorizationMode(Long authorizationMode) {
        this.authorizationMode = authorizationMode;
        return this;
    }
    public Long getAuthorizationMode() {
        return this.authorizationMode;
    }

    public IpChannelInfo setPayMode(Long payMode) {
        this.payMode = payMode;
        return this;
    }
    public Long getPayMode() {
        return this.payMode;
    }

    public IpChannelInfo setIpLevel(Long ipLevel) {
        this.ipLevel = ipLevel;
        return this;
    }
    public Long getIpLevel() {
        return this.ipLevel;
    }

    public IpChannelInfo setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public IpChannelInfo setTradeNeedConfirm(Boolean tradeNeedConfirm) {
        this.tradeNeedConfirm = tradeNeedConfirm;
        return this;
    }
    public Boolean getTradeNeedConfirm() {
        return this.tradeNeedConfirm;
    }

    public IpChannelInfo setGuaranteeRange(Long guaranteeRange) {
        this.guaranteeRange = guaranteeRange;
        return this;
    }
    public Long getGuaranteeRange() {
        return this.guaranteeRange;
    }

    public IpChannelInfo setIpTradeMode(IPTradeMode ipTradeMode) {
        this.ipTradeMode = ipTradeMode;
        return this;
    }
    public IPTradeMode getIpTradeMode() {
        return this.ipTradeMode;
    }

    public IpChannelInfo setAuthorizationIndustry(java.util.List<String> authorizationIndustry) {
        this.authorizationIndustry = authorizationIndustry;
        return this;
    }
    public java.util.List<String> getAuthorizationIndustry() {
        return this.authorizationIndustry;
    }

}
