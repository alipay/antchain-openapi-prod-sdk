// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 资产包资金方案内容
    public class AssetPackageFinancePlan : TeaModel {
        // 版本号，从1开始
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=false)]
        public long? Version { get; set; }

        // 状态，ENABLE：启用，不启用时默认null
        /// <summary>
        /// <b>Example:</b>
        /// <para>ENABLE</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 放款比例
        // 0~100，保留小数2位
        /// <summary>
        /// <b>Example:</b>
        /// <para>75</para>
        /// </summary>
        [NameInMap("loan_rate")]
        [Validation(Required=false)]
        public string LoanRate { get; set; }

        // 放款金额，单位分
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("loan_money")]
        [Validation(Required=false)]
        public long? LoanMoney { get; set; }

        // 放款金额，单位元
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.00</para>
        /// </summary>
        [NameInMap("loan_money_yuan")]
        [Validation(Required=false)]
        public string LoanMoneyYuan { get; set; }

        // 计息方式，枚举：
        // ● 年化利率：APR
        // ● 固定金额：FIXED_AMOUNT
        // ● 固定比例：FIXED_RATE
        /// <summary>
        /// <b>Example:</b>
        /// <para>APR</para>
        /// </summary>
        [NameInMap("interest_accrual_method")]
        [Validation(Required=false)]
        public string InterestAccrualMethod { get; set; }

        // 年计息天数
        /// <summary>
        /// <b>Example:</b>
        /// <para>360</para>
        /// </summary>
        [NameInMap("day_count_convention")]
        [Validation(Required=false)]
        public long? DayCountConvention { get; set; }

        // 息费率
        /// <summary>
        /// <b>Example:</b>
        /// <para>7</para>
        /// </summary>
        [NameInMap("allin_financing_cost_rate")]
        [Validation(Required=false)]
        public string AllinFinancingCostRate { get; set; }

        // 还款方式，枚举：
        // ● 等额本息：EQUAL_INSTALLMENT_METHOD
        /// <summary>
        /// <b>Example:</b>
        /// <para>EQUAL_INSTALLMENT_METHOD</para>
        /// </summary>
        [NameInMap("repayment_method")]
        [Validation(Required=false)]
        public string RepaymentMethod { get; set; }

        // 还款频率，枚举：
        // ● 按月：MONTH
        /// <summary>
        /// <b>Example:</b>
        /// <para>MONTH</para>
        /// </summary>
        [NameInMap("repayment_frequency")]
        [Validation(Required=false)]
        public string RepaymentFrequency { get; set; }

        // 融资期数，范围0~36
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("finance_num")]
        [Validation(Required=false)]
        public long? FinanceNum { get; set; }

        // 计划还款日期，范围1～28
        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("pay_day")]
        [Validation(Required=false)]
        public long? PayDay { get; set; }

        // 触发商家代偿时间，单位天
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("merchant_compensation_day")]
        [Validation(Required=false)]
        public long? MerchantCompensationDay { get; set; }

        // 订单未还款总金额，单位分
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("unreleased_amount")]
        [Validation(Required=false)]
        public long? UnreleasedAmount { get; set; }

    }

}
