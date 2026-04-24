// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class EcBizContend extends TeaModel {
    // 企业名称
    /**
     * <strong>example:</strong>
     * <p>张三的贸易有限公司</p>
     */
    @NameInMap("dt_enterprise_name")
    @Validation(required = true)
    public String dtEnterpriseName;

    // 企业社会信用代码
    /**
     * <strong>example:</strong>
     * <p>91234500123400000R</p>
     */
    @NameInMap("dt_social_creditno")
    @Validation(required = true)
    public String dtSocialCreditno;

    // 是否有关联关系Y/N
    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("dt_contract_flag")
    @Validation(required = true)
    public String dtContractFlag;

    // 固定经营场所地址
    /**
     * <strong>example:</strong>
     * <p>广东省深圳市区福田区</p>
     */
    @NameInMap("dt_fixed_manage_area")
    public String dtFixedManageArea;

    // 近1个月商户在电商平台的交易额（GMV）
    /**
     * <strong>example:</strong>
     * <p>10000234</p>
     */
    @NameInMap("dt_mercht_at_emrch_plf_limit_lt_1m")
    public String dtMerchtAtEmrchPlfLimitLt1m;

    // 近6个月的月均GMV
    /**
     * <strong>example:</strong>
     * <p>10000234</p>
     */
    @NameInMap("dt_avg_gmv_lt_6m")
    @Validation(required = true)
    public String dtAvgGmvLt6m;

    // 近6个月平均退货率
    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("dt_avg_ret_rate_lt_6m")
    @Validation(required = true)
    public String dtAvgRetRateLt6m;

    // 近12个月平均退货率
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("dt_avg_ret_rate_lt_12m")
    @Validation(required = true)
    public String dtAvgRetRateLt12m;

    // 退货率的季度均值
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("dt_ret_rate_qtr_avg_val")
    public String dtRetRateQtrAvgVal;

    // 近3个月累计违规处罚金额
    /**
     * <strong>example:</strong>
     * <p>200.00</p>
     */
    @NameInMap("dt_accu_foul_punish_amt_lt_3m")
    @Validation(required = true)
    public String dtAccuFoulPunishAmtLt3m;

    // 是否有重大违规或交易违约
    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("dt_is_have_major_foul_or_txn_deflt")
    @Validation(required = true)
    public String dtIsHaveMajorFoulOrTxnDeflt;

    // 过往是否有刷单等虚假贸易记录
    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("dt_his_have_sng_etc_vtl_fake_trade_rcrd")
    @Validation(required = true)
    public String dtHisHaveSngEtcVtlFakeTradeRcrd;

    // 合作时长表
    /**
     * <strong>example:</strong>
     * <p>抖音：24；天猫：12</p>
     */
    @NameInMap("dt_co_duran_tab")
    @Validation(required = true)
    public String dtCoDuranTab;

    // 店铺经营品类（准入非翡翠/玉石类、黄金／彩宝／钻石／珍珠类、钟表类、珠宝／文玩类、房产/汽车、汽车售后服务、奢侈品、虚拟/服务、二手、到店美食、物流服务类）
    /**
     * <strong>example:</strong>
     * <p>玉石类</p>
     */
    @NameInMap("dt_ent_cust_seg")
    @Validation(required = true)
    public String dtEntCustSeg;

    // 店铺名称
    /**
     * <strong>example:</strong>
     * <p>张三的抖音小店</p>
     */
    @NameInMap("dt_shop_name")
    @Validation(required = true)
    public String dtShopName;

    // 近12个月经营数据
    @NameInMap("month_data")
    @Validation(required = true)
    public java.util.List<EcMonthData> monthData;

    public static EcBizContend build(java.util.Map<String, ?> map) throws Exception {
        EcBizContend self = new EcBizContend();
        return TeaModel.build(map, self);
    }

    public EcBizContend setDtEnterpriseName(String dtEnterpriseName) {
        this.dtEnterpriseName = dtEnterpriseName;
        return this;
    }
    public String getDtEnterpriseName() {
        return this.dtEnterpriseName;
    }

    public EcBizContend setDtSocialCreditno(String dtSocialCreditno) {
        this.dtSocialCreditno = dtSocialCreditno;
        return this;
    }
    public String getDtSocialCreditno() {
        return this.dtSocialCreditno;
    }

    public EcBizContend setDtContractFlag(String dtContractFlag) {
        this.dtContractFlag = dtContractFlag;
        return this;
    }
    public String getDtContractFlag() {
        return this.dtContractFlag;
    }

    public EcBizContend setDtFixedManageArea(String dtFixedManageArea) {
        this.dtFixedManageArea = dtFixedManageArea;
        return this;
    }
    public String getDtFixedManageArea() {
        return this.dtFixedManageArea;
    }

    public EcBizContend setDtMerchtAtEmrchPlfLimitLt1m(String dtMerchtAtEmrchPlfLimitLt1m) {
        this.dtMerchtAtEmrchPlfLimitLt1m = dtMerchtAtEmrchPlfLimitLt1m;
        return this;
    }
    public String getDtMerchtAtEmrchPlfLimitLt1m() {
        return this.dtMerchtAtEmrchPlfLimitLt1m;
    }

    public EcBizContend setDtAvgGmvLt6m(String dtAvgGmvLt6m) {
        this.dtAvgGmvLt6m = dtAvgGmvLt6m;
        return this;
    }
    public String getDtAvgGmvLt6m() {
        return this.dtAvgGmvLt6m;
    }

    public EcBizContend setDtAvgRetRateLt6m(String dtAvgRetRateLt6m) {
        this.dtAvgRetRateLt6m = dtAvgRetRateLt6m;
        return this;
    }
    public String getDtAvgRetRateLt6m() {
        return this.dtAvgRetRateLt6m;
    }

    public EcBizContend setDtAvgRetRateLt12m(String dtAvgRetRateLt12m) {
        this.dtAvgRetRateLt12m = dtAvgRetRateLt12m;
        return this;
    }
    public String getDtAvgRetRateLt12m() {
        return this.dtAvgRetRateLt12m;
    }

    public EcBizContend setDtRetRateQtrAvgVal(String dtRetRateQtrAvgVal) {
        this.dtRetRateQtrAvgVal = dtRetRateQtrAvgVal;
        return this;
    }
    public String getDtRetRateQtrAvgVal() {
        return this.dtRetRateQtrAvgVal;
    }

    public EcBizContend setDtAccuFoulPunishAmtLt3m(String dtAccuFoulPunishAmtLt3m) {
        this.dtAccuFoulPunishAmtLt3m = dtAccuFoulPunishAmtLt3m;
        return this;
    }
    public String getDtAccuFoulPunishAmtLt3m() {
        return this.dtAccuFoulPunishAmtLt3m;
    }

    public EcBizContend setDtIsHaveMajorFoulOrTxnDeflt(String dtIsHaveMajorFoulOrTxnDeflt) {
        this.dtIsHaveMajorFoulOrTxnDeflt = dtIsHaveMajorFoulOrTxnDeflt;
        return this;
    }
    public String getDtIsHaveMajorFoulOrTxnDeflt() {
        return this.dtIsHaveMajorFoulOrTxnDeflt;
    }

    public EcBizContend setDtHisHaveSngEtcVtlFakeTradeRcrd(String dtHisHaveSngEtcVtlFakeTradeRcrd) {
        this.dtHisHaveSngEtcVtlFakeTradeRcrd = dtHisHaveSngEtcVtlFakeTradeRcrd;
        return this;
    }
    public String getDtHisHaveSngEtcVtlFakeTradeRcrd() {
        return this.dtHisHaveSngEtcVtlFakeTradeRcrd;
    }

    public EcBizContend setDtCoDuranTab(String dtCoDuranTab) {
        this.dtCoDuranTab = dtCoDuranTab;
        return this;
    }
    public String getDtCoDuranTab() {
        return this.dtCoDuranTab;
    }

    public EcBizContend setDtEntCustSeg(String dtEntCustSeg) {
        this.dtEntCustSeg = dtEntCustSeg;
        return this;
    }
    public String getDtEntCustSeg() {
        return this.dtEntCustSeg;
    }

    public EcBizContend setDtShopName(String dtShopName) {
        this.dtShopName = dtShopName;
        return this;
    }
    public String getDtShopName() {
        return this.dtShopName;
    }

    public EcBizContend setMonthData(java.util.List<EcMonthData> monthData) {
        this.monthData = monthData;
        return this;
    }
    public java.util.List<EcMonthData> getMonthData() {
        return this.monthData;
    }

}
