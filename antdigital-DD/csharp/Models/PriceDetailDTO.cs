// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // PriceDetailDTO
    public class PriceDetailDTO : TeaModel {
        // 定价约束id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("constraint_id")]
        [Validation(Required=true)]
        public long? ConstraintId { get; set; }

        // 计费项code
        /// <summary>
        /// <b>Example:</b>
        /// <para>IN_NO_CACHE</para>
        /// </summary>
        [NameInMap("charge_item")]
        [Validation(Required=true)]
        public string ChargeItem { get; set; }

        // 定价阶梯
        /// <summary>
        /// <b>Example:</b>
        /// <para>L0</para>
        /// </summary>
        [NameInMap("stage_level")]
        [Validation(Required=true)]
        public string StageLevel { get; set; }

        // 供应商
        /// <summary>
        /// <b>Example:</b>
        /// <para>aliyun</para>
        /// </summary>
        [NameInMap("provider")]
        [Validation(Required=true)]
        public string Provider { get; set; }

        // 刊例价
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.01</para>
        /// </summary>
        [NameInMap("base_price")]
        [Validation(Required=true)]
        public string BasePrice { get; set; }

        // BD权限价
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.1</para>
        /// </summary>
        [NameInMap("bd_price")]
        [Validation(Required=true)]
        public string BdPrice { get; set; }

        // 底价
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.1</para>
        /// </summary>
        [NameInMap("cost_price")]
        [Validation(Required=true)]
        public string CostPrice { get; set; }

        // 定价单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>元</para>
        /// </summary>
        [NameInMap("price_unit")]
        [Validation(Required=true)]
        public string PriceUnit { get; set; }

        // 币种
        /// <summary>
        /// <b>Example:</b>
        /// <para>156</para>
        /// </summary>
        [NameInMap("currency_value")]
        [Validation(Required=true)]
        public string CurrencyValue { get; set; }

        // 阶梯起始值
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("ladder_start")]
        [Validation(Required=true)]
        public string LadderStart { get; set; }

        // 阶梯结束值
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("ladder_end")]
        [Validation(Required=true)]
        public string LadderEnd { get; set; }

        // 定价id
        /// <summary>
        /// <b>Example:</b>
        /// <para>12344</para>
        /// </summary>
        [NameInMap("price_plan_id")]
        [Validation(Required=true)]
        public long? PricePlanId { get; set; }

        // 定价计划名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>1234</para>
        /// </summary>
        [NameInMap("price_plan_name")]
        [Validation(Required=true)]
        public string PricePlanName { get; set; }

        // 定价开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-06-01</para>
        /// </summary>
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        // 定价结束时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-06-30</para>
        /// </summary>
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public string EndTime { get; set; }

    }

}
