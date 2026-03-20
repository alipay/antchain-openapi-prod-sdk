// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢-电商-授信补充-拓展字段
    public class EcBizContend : TeaModel {
        // 企业名称
        [NameInMap("dt_enterprise_name")]
        [Validation(Required=true)]
        public string DtEnterpriseName { get; set; }

        // 企业社会信用代码
        [NameInMap("dt_social_creditno")]
        [Validation(Required=true)]
        public string DtSocialCreditno { get; set; }

        // 是否有关联关系Y/N
        [NameInMap("dt_contract_flag")]
        [Validation(Required=true)]
        public string DtContractFlag { get; set; }

        // 固定经营场所地址
        [NameInMap("dt_fixed_manage_area")]
        [Validation(Required=false)]
        public string DtFixedManageArea { get; set; }

        // 近1个月商户在电商平台的交易额（GMV）
        [NameInMap("dt_mercht_at_emrch_plf_limit_lt_1m")]
        [Validation(Required=false)]
        public string DtMerchtAtEmrchPlfLimitLt1m { get; set; }

        // 近6个月的月均GMV
        [NameInMap("dt_avg_gmv_lt_6m")]
        [Validation(Required=true)]
        public string DtAvgGmvLt6m { get; set; }

        // 近6个月平均退货率
        [NameInMap("dt_avg_ret_rate_lt_6m")]
        [Validation(Required=true)]
        public string DtAvgRetRateLt6m { get; set; }

        // 近12个月平均退货率
        [NameInMap("dt_avg_ret_rate_lt_12m")]
        [Validation(Required=true)]
        public string DtAvgRetRateLt12m { get; set; }

        // 退货率的季度均值
        [NameInMap("dt_ret_rate_qtr_avg_val")]
        [Validation(Required=false)]
        public string DtRetRateQtrAvgVal { get; set; }

        // 近3个月累计违规处罚金额
        [NameInMap("dt_accu_foul_punish_amt_lt_3m")]
        [Validation(Required=true)]
        public string DtAccuFoulPunishAmtLt3m { get; set; }

        // 是否有重大违规或交易违约
        [NameInMap("dt_is_have_major_foul_or_txn_deflt")]
        [Validation(Required=true)]
        public string DtIsHaveMajorFoulOrTxnDeflt { get; set; }

        // 过往是否有刷单等虚假贸易记录
        [NameInMap("dt_his_have_sng_etc_vtl_fake_trade_rcrd")]
        [Validation(Required=true)]
        public string DtHisHaveSngEtcVtlFakeTradeRcrd { get; set; }

        // 合作时长表
        [NameInMap("dt_co_duran_tab")]
        [Validation(Required=true)]
        public string DtCoDuranTab { get; set; }

        // 店铺经营品类（准入非翡翠/玉石类、黄金／彩宝／钻石／珍珠类、钟表类、珠宝／文玩类、房产/汽车、汽车售后服务、奢侈品、虚拟/服务、二手、到店美食、物流服务类）
        [NameInMap("dt_ent_cust_seg")]
        [Validation(Required=true)]
        public string DtEntCustSeg { get; set; }

        // 店铺名称
        [NameInMap("dt_shop_name")]
        [Validation(Required=true)]
        public string DtShopName { get; set; }

        // 近12个月经营数据
        [NameInMap("month_data")]
        [Validation(Required=true)]
        public List<EcMonthData> MonthData { get; set; }

    }

}
