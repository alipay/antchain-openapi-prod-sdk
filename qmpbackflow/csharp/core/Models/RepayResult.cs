// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢系统专用RepayResult结构体
    public class RepayResult : TeaModel {
        // 客户编码
        [NameInMap("custom_no")]
        [Validation(Required=true)]
        public string CustomNo { get; set; }

        // 当前期数
        [NameInMap("period")]
        [Validation(Required=true)]
        public string Period { get; set; }

        // 应还总额
        [NameInMap("need_amount")]
        [Validation(Required=true)]
        public long? NeedAmount { get; set; }

        // 应还本金
        [NameInMap("need_corpus")]
        [Validation(Required=true)]
        public long? NeedCorpus { get; set; }

        // 应还利息
        [NameInMap("need_accrual")]
        [Validation(Required=true)]
        public long? NeedAccrual { get; set; }

        // 应还手续费
        [NameInMap("need_fee")]
        [Validation(Required=true)]
        public long? NeedFee { get; set; }

        // 已还总额
        [NameInMap("already_amount")]
        [Validation(Required=true)]
        public long? AlreadyAmount { get; set; }

        // 已还本金
        [NameInMap("already_corpus")]
        [Validation(Required=true)]
        public long? AlreadyCorpus { get; set; }

        // 已还逾期本金
        [NameInMap("already_overcorpus")]
        [Validation(Required=true)]
        public long? AlreadyOvercorpus { get; set; }

        // 已还利息
        [NameInMap("already_accrual")]
        [Validation(Required=true)]
        public long? AlreadyAccrual { get; set; }

        // 已还逾期息
        [NameInMap("already_punish")]
        [Validation(Required=true)]
        public long? AlreadyPunish { get; set; }

        // 已还手续费
        [NameInMap("already_fee")]
        [Validation(Required=true)]
        public long? AlreadyFee { get; set; }

        // 利率
        [NameInMap("rate")]
        [Validation(Required=true)]
        public long? Rate { get; set; }

        // 罚息率
        [NameInMap("penalty_value")]
        [Validation(Required=true)]
        public long? PenaltyValue { get; set; }

        // 当期剩余总额
        [NameInMap("rest_amount")]
        [Validation(Required=true)]
        public long? RestAmount { get; set; }

        // 当期剩余本金
        [NameInMap("rest_corpus")]
        [Validation(Required=true)]
        public long? RestCorpus { get; set; }

        // 当期剩余利息
        [NameInMap("rest_accrual")]
        [Validation(Required=true)]
        public long? RestAccrual { get; set; }

        // 当期剩余罚息
        [NameInMap("rest_punish")]
        [Validation(Required=true)]
        public long? RestPunish { get; set; }

        // 期末本金
        [NameInMap("remain_corpus")]
        [Validation(Required=true)]
        public long? RemainCorpus { get; set; }

        // 借据编号
        [NameInMap("receipt_no")]
        [Validation(Required=true)]
        public string ReceiptNo { get; set; }

        // 还款状态1：已还清 2 未还 3 部分还款
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 应还日期
        [NameInMap("settle_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SettleDate { get; set; }

        // 还款日期
        [NameInMap("trade_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TradeDate { get; set; }

        // 已还担保费
        [NameInMap("already_guarantee_fee")]
        [Validation(Required=true)]
        public long? AlreadyGuaranteeFee { get; set; }

        // 已还违约金
        [NameInMap("already_liquidated_damages")]
        [Validation(Required=true)]
        public long? AlreadyLiquidatedDamages { get; set; }

        // 当期剩余担保费
        [NameInMap("rest_guarantee_fee")]
        [Validation(Required=true)]
        public long? RestGuaranteeFee { get; set; }

        // 当期剩余违约金
        [NameInMap("rest_liquidated_damages")]
        [Validation(Required=true)]
        public long? RestLiquidatedDamages { get; set; }

        // 应还担保费
        [NameInMap("need_guarantee_fee")]
        [Validation(Required=true)]
        public long? NeedGuaranteeFee { get; set; }

        // 应还违约金
        [NameInMap("need_liquidated_damages")]
        [Validation(Required=true)]
        public long? NeedLiquidatedDamages { get; set; }

        // 逾期天数
        [NameInMap("overdue_days")]
        [Validation(Required=true)]
        public long? OverdueDays { get; set; }

    }

}
