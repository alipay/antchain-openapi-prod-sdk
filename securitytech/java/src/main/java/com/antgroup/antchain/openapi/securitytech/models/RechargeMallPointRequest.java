// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RechargeMallPointRequest extends TeaModel {
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

    // 当前期数编号
    @NameInMap("phase_no")
    @Validation(required = true)
    public String phaseNo;

    // 当期充值金额
    @NameInMap("phase_amount")
    @Validation(required = true)
    public String phaseAmount;

    public static RechargeMallPointRequest build(java.util.Map<String, ?> map) throws Exception {
        RechargeMallPointRequest self = new RechargeMallPointRequest();
        return TeaModel.build(map, self);
    }

    public RechargeMallPointRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RechargeMallPointRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RechargeMallPointRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public RechargeMallPointRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public RechargeMallPointRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public RechargeMallPointRequest setTotalMallAmount(String totalMallAmount) {
        this.totalMallAmount = totalMallAmount;
        return this;
    }
    public String getTotalMallAmount() {
        return this.totalMallAmount;
    }

    public RechargeMallPointRequest setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }
    public String getExchangeRate() {
        return this.exchangeRate;
    }

    public RechargeMallPointRequest setTotalPhase(String totalPhase) {
        this.totalPhase = totalPhase;
        return this;
    }
    public String getTotalPhase() {
        return this.totalPhase;
    }

    public RechargeMallPointRequest setPhaseNo(String phaseNo) {
        this.phaseNo = phaseNo;
        return this;
    }
    public String getPhaseNo() {
        return this.phaseNo;
    }

    public RechargeMallPointRequest setPhaseAmount(String phaseAmount) {
        this.phaseAmount = phaseAmount;
        return this;
    }
    public String getPhaseAmount() {
        return this.phaseAmount;
    }

}
