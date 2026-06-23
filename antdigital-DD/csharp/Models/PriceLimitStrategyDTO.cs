// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 价格限制策略
    // 目前只支持保底价格配置
    public class PriceLimitStrategyDTO : TeaModel {
        // 创建人
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // 修改人
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("modifier")]
        [Validation(Required=false)]
        public string Modifier { get; set; }

        // 是否删除
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("deleted")]
        [Validation(Required=false)]
        public bool? Deleted { get; set; }

        // 定价计划ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>0,1</para>
        /// </summary>
        [NameInMap("price_plan_id")]
        [Validation(Required=true)]
        public long? PricePlanId { get; set; }

        // 保底周期,year年、month月
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("duration_type")]
        [Validation(Required=false)]
        public string DurationType { get; set; }

        // 保底价格
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("guarantee_price")]
        [Validation(Required=false)]
        public string GuaranteePrice { get; set; }

        // 产品成本
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("guarantee_cost_price")]
        [Validation(Required=false)]
        public string GuaranteeCostPrice { get; set; }

    }

}
