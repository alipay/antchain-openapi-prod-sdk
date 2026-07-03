<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class EcBizContend extends Model
{
    // 企业名称
    /**
     * @example 张三的贸易有限公司
     *
     * @var string
     */
    public $dtEnterpriseName;

    // 企业社会信用代码
    /**
     * @example 91234500123400000R
     *
     * @var string
     */
    public $dtSocialCreditno;

    // 是否有关联关系Y/N
    /**
     * @example Y
     *
     * @var string
     */
    public $dtContractFlag;

    // 固定经营场所地址
    /**
     * @example 广东省深圳市区福田区
     *
     * @var string
     */
    public $dtFixedManageArea;

    // 近1个月商户在电商平台的交易额（GMV）
    /**
     * @example 10000234
     *
     * @var string
     */
    public $dtMerchtAtEmrchPlfLimitLt1m;

    // 近6个月的月均GMV
    /**
     * @example 10000234
     *
     * @var string
     */
    public $dtAvgGmvLt6m;

    // 近6个月平均退货率
    /**
     * @example 8
     *
     * @var string
     */
    public $dtAvgRetRateLt6m;

    // 近12个月平均退货率
    /**
     * @example 10
     *
     * @var string
     */
    public $dtAvgRetRateLt12m;

    // 退货率的季度均值
    /**
     * @example 10
     *
     * @var string
     */
    public $dtRetRateQtrAvgVal;

    // 近3个月累计违规处罚金额
    /**
     * @example 200.00
     *
     * @var string
     */
    public $dtAccuFoulPunishAmtLt3m;

    // 是否有重大违规或交易违约
    /**
     * @example Y
     *
     * @var string
     */
    public $dtIsHaveMajorFoulOrTxnDeflt;

    // 过往是否有刷单等虚假贸易记录
    /**
     * @example Y
     *
     * @var string
     */
    public $dtHisHaveSngEtcVtlFakeTradeRcrd;

    // 合作时长表
    /**
     * @example 抖音：24；天猫：12
     *
     * @var string
     */
    public $dtCoDuranTab;

    // 店铺经营品类（准入非翡翠/玉石类、黄金／彩宝／钻石／珍珠类、钟表类、珠宝／文玩类、房产/汽车、汽车售后服务、奢侈品、虚拟/服务、二手、到店美食、物流服务类）
    /**
     * @example 玉石类
     *
     * @var string
     */
    public $dtEntCustSeg;

    // 店铺名称
    /**
     * @example 张三的抖音小店
     *
     * @var string
     */
    public $dtShopName;

    // 近12个月经营数据
    /**
     * @example
     *
     * @var EcMonthData[]
     */
    public $monthData;
    protected $_name = [
        'dtEnterpriseName'                => 'dt_enterprise_name',
        'dtSocialCreditno'                => 'dt_social_creditno',
        'dtContractFlag'                  => 'dt_contract_flag',
        'dtFixedManageArea'               => 'dt_fixed_manage_area',
        'dtMerchtAtEmrchPlfLimitLt1m'     => 'dt_mercht_at_emrch_plf_limit_lt_1m',
        'dtAvgGmvLt6m'                    => 'dt_avg_gmv_lt_6m',
        'dtAvgRetRateLt6m'                => 'dt_avg_ret_rate_lt_6m',
        'dtAvgRetRateLt12m'               => 'dt_avg_ret_rate_lt_12m',
        'dtRetRateQtrAvgVal'              => 'dt_ret_rate_qtr_avg_val',
        'dtAccuFoulPunishAmtLt3m'         => 'dt_accu_foul_punish_amt_lt_3m',
        'dtIsHaveMajorFoulOrTxnDeflt'     => 'dt_is_have_major_foul_or_txn_deflt',
        'dtHisHaveSngEtcVtlFakeTradeRcrd' => 'dt_his_have_sng_etc_vtl_fake_trade_rcrd',
        'dtCoDuranTab'                    => 'dt_co_duran_tab',
        'dtEntCustSeg'                    => 'dt_ent_cust_seg',
        'dtShopName'                      => 'dt_shop_name',
        'monthData'                       => 'month_data',
    ];

    public function validate()
    {
        Model::validateRequired('dtEnterpriseName', $this->dtEnterpriseName, true);
        Model::validateRequired('dtSocialCreditno', $this->dtSocialCreditno, true);
        Model::validateRequired('dtContractFlag', $this->dtContractFlag, true);
        Model::validateRequired('dtAvgGmvLt6m', $this->dtAvgGmvLt6m, true);
        Model::validateRequired('dtAvgRetRateLt6m', $this->dtAvgRetRateLt6m, true);
        Model::validateRequired('dtAvgRetRateLt12m', $this->dtAvgRetRateLt12m, true);
        Model::validateRequired('dtAccuFoulPunishAmtLt3m', $this->dtAccuFoulPunishAmtLt3m, true);
        Model::validateRequired('dtIsHaveMajorFoulOrTxnDeflt', $this->dtIsHaveMajorFoulOrTxnDeflt, true);
        Model::validateRequired('dtHisHaveSngEtcVtlFakeTradeRcrd', $this->dtHisHaveSngEtcVtlFakeTradeRcrd, true);
        Model::validateRequired('dtCoDuranTab', $this->dtCoDuranTab, true);
        Model::validateRequired('dtEntCustSeg', $this->dtEntCustSeg, true);
        Model::validateRequired('dtShopName', $this->dtShopName, true);
        Model::validateRequired('monthData', $this->monthData, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dtEnterpriseName) {
            $res['dt_enterprise_name'] = $this->dtEnterpriseName;
        }
        if (null !== $this->dtSocialCreditno) {
            $res['dt_social_creditno'] = $this->dtSocialCreditno;
        }
        if (null !== $this->dtContractFlag) {
            $res['dt_contract_flag'] = $this->dtContractFlag;
        }
        if (null !== $this->dtFixedManageArea) {
            $res['dt_fixed_manage_area'] = $this->dtFixedManageArea;
        }
        if (null !== $this->dtMerchtAtEmrchPlfLimitLt1m) {
            $res['dt_mercht_at_emrch_plf_limit_lt_1m'] = $this->dtMerchtAtEmrchPlfLimitLt1m;
        }
        if (null !== $this->dtAvgGmvLt6m) {
            $res['dt_avg_gmv_lt_6m'] = $this->dtAvgGmvLt6m;
        }
        if (null !== $this->dtAvgRetRateLt6m) {
            $res['dt_avg_ret_rate_lt_6m'] = $this->dtAvgRetRateLt6m;
        }
        if (null !== $this->dtAvgRetRateLt12m) {
            $res['dt_avg_ret_rate_lt_12m'] = $this->dtAvgRetRateLt12m;
        }
        if (null !== $this->dtRetRateQtrAvgVal) {
            $res['dt_ret_rate_qtr_avg_val'] = $this->dtRetRateQtrAvgVal;
        }
        if (null !== $this->dtAccuFoulPunishAmtLt3m) {
            $res['dt_accu_foul_punish_amt_lt_3m'] = $this->dtAccuFoulPunishAmtLt3m;
        }
        if (null !== $this->dtIsHaveMajorFoulOrTxnDeflt) {
            $res['dt_is_have_major_foul_or_txn_deflt'] = $this->dtIsHaveMajorFoulOrTxnDeflt;
        }
        if (null !== $this->dtHisHaveSngEtcVtlFakeTradeRcrd) {
            $res['dt_his_have_sng_etc_vtl_fake_trade_rcrd'] = $this->dtHisHaveSngEtcVtlFakeTradeRcrd;
        }
        if (null !== $this->dtCoDuranTab) {
            $res['dt_co_duran_tab'] = $this->dtCoDuranTab;
        }
        if (null !== $this->dtEntCustSeg) {
            $res['dt_ent_cust_seg'] = $this->dtEntCustSeg;
        }
        if (null !== $this->dtShopName) {
            $res['dt_shop_name'] = $this->dtShopName;
        }
        if (null !== $this->monthData) {
            $res['month_data'] = [];
            if (null !== $this->monthData && \is_array($this->monthData)) {
                $n = 0;
                foreach ($this->monthData as $item) {
                    $res['month_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EcBizContend
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dt_enterprise_name'])) {
            $model->dtEnterpriseName = $map['dt_enterprise_name'];
        }
        if (isset($map['dt_social_creditno'])) {
            $model->dtSocialCreditno = $map['dt_social_creditno'];
        }
        if (isset($map['dt_contract_flag'])) {
            $model->dtContractFlag = $map['dt_contract_flag'];
        }
        if (isset($map['dt_fixed_manage_area'])) {
            $model->dtFixedManageArea = $map['dt_fixed_manage_area'];
        }
        if (isset($map['dt_mercht_at_emrch_plf_limit_lt_1m'])) {
            $model->dtMerchtAtEmrchPlfLimitLt1m = $map['dt_mercht_at_emrch_plf_limit_lt_1m'];
        }
        if (isset($map['dt_avg_gmv_lt_6m'])) {
            $model->dtAvgGmvLt6m = $map['dt_avg_gmv_lt_6m'];
        }
        if (isset($map['dt_avg_ret_rate_lt_6m'])) {
            $model->dtAvgRetRateLt6m = $map['dt_avg_ret_rate_lt_6m'];
        }
        if (isset($map['dt_avg_ret_rate_lt_12m'])) {
            $model->dtAvgRetRateLt12m = $map['dt_avg_ret_rate_lt_12m'];
        }
        if (isset($map['dt_ret_rate_qtr_avg_val'])) {
            $model->dtRetRateQtrAvgVal = $map['dt_ret_rate_qtr_avg_val'];
        }
        if (isset($map['dt_accu_foul_punish_amt_lt_3m'])) {
            $model->dtAccuFoulPunishAmtLt3m = $map['dt_accu_foul_punish_amt_lt_3m'];
        }
        if (isset($map['dt_is_have_major_foul_or_txn_deflt'])) {
            $model->dtIsHaveMajorFoulOrTxnDeflt = $map['dt_is_have_major_foul_or_txn_deflt'];
        }
        if (isset($map['dt_his_have_sng_etc_vtl_fake_trade_rcrd'])) {
            $model->dtHisHaveSngEtcVtlFakeTradeRcrd = $map['dt_his_have_sng_etc_vtl_fake_trade_rcrd'];
        }
        if (isset($map['dt_co_duran_tab'])) {
            $model->dtCoDuranTab = $map['dt_co_duran_tab'];
        }
        if (isset($map['dt_ent_cust_seg'])) {
            $model->dtEntCustSeg = $map['dt_ent_cust_seg'];
        }
        if (isset($map['dt_shop_name'])) {
            $model->dtShopName = $map['dt_shop_name'];
        }
        if (isset($map['month_data'])) {
            if (!empty($map['month_data'])) {
                $model->monthData = [];
                $n                = 0;
                foreach ($map['month_data'] as $item) {
                    $model->monthData[$n++] = null !== $item ? EcMonthData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
