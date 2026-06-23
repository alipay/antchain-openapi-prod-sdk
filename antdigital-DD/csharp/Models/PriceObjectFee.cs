// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 收费项结果明细
    public class PriceObjectFee : TeaModel {
        // 收费项CODE
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("price_object_code")]
        [Validation(Required=false)]
        public string PriceObjectCode { get; set; }

        // 收费项名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("price_object_name")]
        [Validation(Required=false)]
        public string PriceObjectName { get; set; }

        // 高精度价格12位
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("price")]
        [Validation(Required=false)]
        public string Price { get; set; }

        // 价格类型，标准价格，一客一价
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("price_type")]
        [Validation(Required=false)]
        public string PriceType { get; set; }

        // 结算信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("settle_type")]
        [Validation(Required=false)]
        public string SettleType { get; set; }

        // 币种
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 命中的定价计划
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("price_plan_vo")]
        [Validation(Required=false)]
        public PricePlanVO PricePlanVo { get; set; }

        // 命中的定价计划约束
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("price_constraint_vo")]
        [Validation(Required=false)]
        public PriceConstraintVO PriceConstraintVo { get; set; }

        // 扩展信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("extends_map")]
        [Validation(Required=false)]
        public string ExtendsMap { get; set; }

        // BD销售价格区间
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("bd_price")]
        [Validation(Required=false)]
        public string BdPrice { get; set; }

        // 最低成本价
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("cost_price")]
        [Validation(Required=false)]
        public string CostPrice { get; set; }

    }

}
