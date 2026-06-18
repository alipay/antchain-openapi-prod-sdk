// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RechargePoiMallpointRequest extends TeaModel {
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

    // 分期主订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 商城总余额
    @NameInMap("total_mall_amount")
    @Validation(required = true)
    public String totalMallAmount;

    // 积分换算系数
    @NameInMap("exchange_rate")
    @Validation(required = true)
    public String exchangeRate;

    // 商城充值总期数
    @NameInMap("total_phase")
    @Validation(required = true)
    public String totalPhase;

    // 当期充值金额
    @NameInMap("phase_amount")
    @Validation(required = true)
    public String phaseAmount;

    // 当前期数编号
    @NameInMap("phase_no")
    @Validation(required = true)
    public String phaseNo;

    // 渠道Code
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    public static RechargePoiMallpointRequest build(java.util.Map<String, ?> map) throws Exception {
        RechargePoiMallpointRequest self = new RechargePoiMallpointRequest();
        return TeaModel.build(map, self);
    }

    public RechargePoiMallpointRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RechargePoiMallpointRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RechargePoiMallpointRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public RechargePoiMallpointRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public RechargePoiMallpointRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public RechargePoiMallpointRequest setTotalMallAmount(String totalMallAmount) {
        this.totalMallAmount = totalMallAmount;
        return this;
    }
    public String getTotalMallAmount() {
        return this.totalMallAmount;
    }

    public RechargePoiMallpointRequest setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }
    public String getExchangeRate() {
        return this.exchangeRate;
    }

    public RechargePoiMallpointRequest setTotalPhase(String totalPhase) {
        this.totalPhase = totalPhase;
        return this;
    }
    public String getTotalPhase() {
        return this.totalPhase;
    }

    public RechargePoiMallpointRequest setPhaseAmount(String phaseAmount) {
        this.phaseAmount = phaseAmount;
        return this;
    }
    public String getPhaseAmount() {
        return this.phaseAmount;
    }

    public RechargePoiMallpointRequest setPhaseNo(String phaseNo) {
        this.phaseNo = phaseNo;
        return this;
    }
    public String getPhaseNo() {
        return this.phaseNo;
    }

    public RechargePoiMallpointRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

}
