// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    // 只计一次的请求级费用明细
    public class RequestItems : TeaModel {
        // 规则编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>规则编码</para>
        /// </summary>
        [NameInMap("price_rule_code")]
        [Validation(Required=false)]
        public string PriceRuleCode { get; set; }

        // 收费项编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>收费项编码</para>
        /// </summary>
        [NameInMap("charge_item_code")]
        [Validation(Required=false)]
        public string ChargeItemCode { get; set; }

        // 计量指标类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>计量指标类型</para>
        /// </summary>
        [NameInMap("metric_type")]
        [Validation(Required=false)]
        public string MetricType { get; set; }

        // 原始计量数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>原始计量数量</para>
        /// </summary>
        [NameInMap("quantity")]
        [Validation(Required=false)]
        public string Quantity { get; set; }

        // 免费额度
        /// <summary>
        /// <b>Example:</b>
        /// <para>免费额度</para>
        /// </summary>
        [NameInMap("free_quota")]
        [Validation(Required=false)]
        public string FreeQuota { get; set; }

        // 计费数量（扣除免费额度后的值）
        /// <summary>
        /// <b>Example:</b>
        /// <para>计费数量（扣除免费额度后的值）</para>
        /// </summary>
        [NameInMap("billable_quantity")]
        [Validation(Required=false)]
        public string BillableQuantity { get; set; }

        // 计费单位大小
        /// <summary>
        /// <b>Example:</b>
        /// <para>计费单位大小</para>
        /// </summary>
        [NameInMap("unit_size")]
        [Validation(Required=false)]
        public string UnitSize { get; set; }

        // 单价
        /// <summary>
        /// <b>Example:</b>
        /// <para>单价</para>
        /// </summary>
        [NameInMap("unit_price")]
        [Validation(Required=false)]
        public string UnitPrice { get; set; }

        // 币种
        /// <summary>
        /// <b>Example:</b>
        /// <para>币种</para>
        /// </summary>
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 单项金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>单项金额</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=false)]
        public string Amount { get; set; }

    }

}
