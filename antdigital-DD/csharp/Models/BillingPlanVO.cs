// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 计费计划信息
    public class BillingPlanVO : TeaModel {
        // 计费规则code
        /// <summary>
        /// <b>Example:</b>
        /// <para>计费规则code</para>
        /// </summary>
        [NameInMap("billing_rule_code")]
        [Validation(Required=false)]
        public string BillingRuleCode { get; set; }

        // 计量域code
        /// <summary>
        /// <b>Example:</b>
        /// <para>domain_code</para>
        /// </summary>
        [NameInMap("domain_code")]
        [Validation(Required=false)]
        public string DomainCode { get; set; }

        // 产品名称 -> 商品模型2.0中的渠道产品Code
        /// <summary>
        /// <b>Example:</b>
        /// <para>DYC</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 商品名称 -> 商品模型2.0中的offerInnerCode
        /// <summary>
        /// <b>Example:</b>
        /// <para>twc_post</para>
        /// </summary>
        [NameInMap("offer_code")]
        [Validation(Required=false)]
        public string OfferCode { get; set; }

        // 采集维度，主实例/逻辑实例，默认主实例
        /// <summary>
        /// <b>Example:</b>
        /// <para>mterid#instanceId</para>
        /// </summary>
        [NameInMap("bill_dimension")]
        [Validation(Required=false)]
        public string BillDimension { get; set; }

        // 是否启用资源包，默认是
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("enable_resource_package")]
        [Validation(Required=false)]
        public bool? EnableResourcePackage { get; set; }

        // 累计模式(月/年/指定时间)
        /// <summary>
        /// <b>Example:</b>
        /// <para>month</para>
        /// </summary>
        [NameInMap("cumulate_cycle")]
        [Validation(Required=false)]
        public string CumulateCycle { get; set; }

        // 转账类型(数字商品户解冻/文娱链户解冻/权益宝户解冻)，默认空
        /// <summary>
        /// <b>Example:</b>
        /// <para>文娱链户解冻</para>
        /// </summary>
        [NameInMap("transfer_type")]
        [Validation(Required=false)]
        public string TransferType { get; set; }

        // 支付类型(代扣)，默认空
        /// <summary>
        /// <b>Example:</b>
        /// <para>out</para>
        /// </summary>
        [NameInMap("pay_accept_type")]
        [Validation(Required=false)]
        public string PayAcceptType { get; set; }

        // 核销类型(业务侧)，默认空
        /// <summary>
        /// <b>Example:</b>
        /// <para>核销类型(业务侧)，默认空</para>
        /// </summary>
        [NameInMap("write_off_type")]
        [Validation(Required=false)]
        public string WriteOffType { get; set; }

        // 单次计价最大价格保护（元），默认1000000元
        /// <summary>
        /// <b>Example:</b>
        /// <para>100000000</para>
        /// </summary>
        [NameInMap("max_price_yuan")]
        [Validation(Required=false)]
        public string MaxPriceYuan { get; set; }

        // 计费因子
        [NameInMap("billingfactor_metas")]
        [Validation(Required=false)]
        public List<BillingFactorMeta> BillingfactorMetas { get; set; }

        // 受理类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>send</para>
        /// </summary>
        [NameInMap("accept_type")]
        [Validation(Required=false)]
        public string AcceptType { get; set; }

        // 周期
        /// <summary>
        /// <b>Example:</b>
        /// <para>02</para>
        /// </summary>
        [NameInMap("collect_period")]
        [Validation(Required=false)]
        public string CollectPeriod { get; set; }

        // 外部支付类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>02</para>
        /// </summary>
        [NameInMap("out_paid_type")]
        [Validation(Required=false)]
        public string OutPaidType { get; set; }

        // 是否立即出账
        /// <summary>
        /// <b>Example:</b>
        /// <para>true,false</para>
        /// </summary>
        [NameInMap("enable_right_row_charge")]
        [Validation(Required=false)]
        public bool? EnableRightRowCharge { get; set; }

        // 高精度累计类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>HIGH_PRECISION_S_M</para>
        /// </summary>
        [NameInMap("high_precision_cumulative_type")]
        [Validation(Required=false)]
        public string HighPrecisionCumulativeType { get; set; }

    }

}
