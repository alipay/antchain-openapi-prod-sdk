// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class PoiMallPointRechargeInfo extends TeaModel {
    // 充值唯一ID
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("recharge_id")
    @Validation(required = true)
    public String rechargeId;

    // 支付宝小程序用户唯一ID
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 门店ID
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 分期主订单号
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 商城总余额
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("total_mall_amount")
    @Validation(required = true)
    public String totalMallAmount;

    // 积分换算系数
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("exchange_rate")
    @Validation(required = true)
    public String exchangeRate;

    // 商城充值总期数
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("total_phase")
    @Validation(required = true)
    public String totalPhase;

    // 当前期数编号
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("phase_no")
    @Validation(required = true)
    public String phaseNo;

    // 当期充值金额
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("phase_amount")
    @Validation(required = true)
    public String phaseAmount;

    // 渠道Code
    /**
     * <strong>example:</strong>
     * <p>TBJHF</p>
     */
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 子渠道
    /**
     * <strong>example:</strong>
     * <p>NYG</p>
     */
    @NameInMap("traffic_platform")
    @Validation(required = true)
    public String trafficPlatform;

    // 充值来源
    /**
     * <strong>example:</strong>
     * <p>DUBHE_MALL_INTEGRAL_RECHARG</p>
     */
    @NameInMap("point_source")
    @Validation(required = true)
    public String pointSource;

    public static PoiMallPointRechargeInfo build(java.util.Map<String, ?> map) throws Exception {
        PoiMallPointRechargeInfo self = new PoiMallPointRechargeInfo();
        return TeaModel.build(map, self);
    }

    public PoiMallPointRechargeInfo setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId;
        return this;
    }
    public String getRechargeId() {
        return this.rechargeId;
    }

    public PoiMallPointRechargeInfo setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public PoiMallPointRechargeInfo setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public PoiMallPointRechargeInfo setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public PoiMallPointRechargeInfo setTotalMallAmount(String totalMallAmount) {
        this.totalMallAmount = totalMallAmount;
        return this;
    }
    public String getTotalMallAmount() {
        return this.totalMallAmount;
    }

    public PoiMallPointRechargeInfo setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }
    public String getExchangeRate() {
        return this.exchangeRate;
    }

    public PoiMallPointRechargeInfo setTotalPhase(String totalPhase) {
        this.totalPhase = totalPhase;
        return this;
    }
    public String getTotalPhase() {
        return this.totalPhase;
    }

    public PoiMallPointRechargeInfo setPhaseNo(String phaseNo) {
        this.phaseNo = phaseNo;
        return this;
    }
    public String getPhaseNo() {
        return this.phaseNo;
    }

    public PoiMallPointRechargeInfo setPhaseAmount(String phaseAmount) {
        this.phaseAmount = phaseAmount;
        return this;
    }
    public String getPhaseAmount() {
        return this.phaseAmount;
    }

    public PoiMallPointRechargeInfo setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public PoiMallPointRechargeInfo setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public PoiMallPointRechargeInfo setPointSource(String pointSource) {
        this.pointSource = pointSource;
        return this;
    }
    public String getPointSource() {
        return this.pointSource;
    }

}
