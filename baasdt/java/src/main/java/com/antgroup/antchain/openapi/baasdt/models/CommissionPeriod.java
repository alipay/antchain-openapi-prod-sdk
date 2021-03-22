// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CommissionPeriod extends TeaModel {
    // 手续费费率
    @NameInMap("deduct_ratio")
    @Validation(required = true)
    public String deductRatio;

    // 手续费子结构
    @NameInMap("sub_commission_rules")
    @Validation(required = true)
    public java.util.List<SubCommissionRule> subCommissionRules;

    // 买家的历史统计做阶梯计费，最多50个
    @NameInMap("merchant_layers")
    @Validation(required = true)
    public java.util.List<CommissionLayer> merchantLayers;

    // 商品阶梯
    @NameInMap("goods_layers")
    @Validation(required = true)
    public java.util.List<CommissionLayer> goodsLayers;

    // 手续费开始时间（无结束时间）
    @NameInMap("start_time_mills")
    @Validation(required = true)
    public Long startTimeMills;

    // 0: txcount（成功的交易）; 1: 累计交易金额; 2:累计手续费; 3：单笔金额, ...
    @NameInMap("layer_type")
    @Validation(required = true)
    public Long layerType;

    // 分层的周期，（0是月，1是日，2是年（这期不用，需要设置一下）, 3是季度）
    @NameInMap("counter_time_type")
    @Validation(required = true)
    public Long counterTimeType;

    // 商品固定费用
    @NameInMap("deduct_token")
    @Validation(required = true)
    public String deductToken;

    public static CommissionPeriod build(java.util.Map<String, ?> map) throws Exception {
        CommissionPeriod self = new CommissionPeriod();
        return TeaModel.build(map, self);
    }

    public CommissionPeriod setDeductRatio(String deductRatio) {
        this.deductRatio = deductRatio;
        return this;
    }
    public String getDeductRatio() {
        return this.deductRatio;
    }

    public CommissionPeriod setSubCommissionRules(java.util.List<SubCommissionRule> subCommissionRules) {
        this.subCommissionRules = subCommissionRules;
        return this;
    }
    public java.util.List<SubCommissionRule> getSubCommissionRules() {
        return this.subCommissionRules;
    }

    public CommissionPeriod setMerchantLayers(java.util.List<CommissionLayer> merchantLayers) {
        this.merchantLayers = merchantLayers;
        return this;
    }
    public java.util.List<CommissionLayer> getMerchantLayers() {
        return this.merchantLayers;
    }

    public CommissionPeriod setGoodsLayers(java.util.List<CommissionLayer> goodsLayers) {
        this.goodsLayers = goodsLayers;
        return this;
    }
    public java.util.List<CommissionLayer> getGoodsLayers() {
        return this.goodsLayers;
    }

    public CommissionPeriod setStartTimeMills(Long startTimeMills) {
        this.startTimeMills = startTimeMills;
        return this;
    }
    public Long getStartTimeMills() {
        return this.startTimeMills;
    }

    public CommissionPeriod setLayerType(Long layerType) {
        this.layerType = layerType;
        return this;
    }
    public Long getLayerType() {
        return this.layerType;
    }

    public CommissionPeriod setCounterTimeType(Long counterTimeType) {
        this.counterTimeType = counterTimeType;
        return this;
    }
    public Long getCounterTimeType() {
        return this.counterTimeType;
    }

    public CommissionPeriod setDeductToken(String deductToken) {
        this.deductToken = deductToken;
        return this;
    }
    public String getDeductToken() {
        return this.deductToken;
    }

}
