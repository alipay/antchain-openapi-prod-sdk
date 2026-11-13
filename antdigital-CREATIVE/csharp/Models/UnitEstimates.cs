// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    // 各输出单元的试算明细
    public class UnitEstimates : TeaModel {
        // 从 0 开始，与请求的 units[] 顺序一致
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("unit_index")]
        [Validation(Required=false)]
        public long? UnitIndex { get; set; }

        // 当前单元是否命中
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("matched")]
        [Validation(Required=false)]
        public bool? Matched { get; set; }

        // 当前单元是否命中兜底规则
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("fallback")]
        [Validation(Required=false)]
        public bool? Fallback { get; set; }

        // 规则编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>规则编码</para>
        /// </summary>
        [NameInMap("price_rule_code")]
        [Validation(Required=false)]
        public string PriceRuleCode { get; set; }

        // 规则版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("matched_rule_version")]
        [Validation(Required=false)]
        public long? MatchedRuleVersion { get; set; }

        // 规则名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>规则名称</para>
        /// </summary>
        [NameInMap("rule_name")]
        [Validation(Required=false)]
        public string RuleName { get; set; }

        // 规则优先级
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("priority")]
        [Validation(Required=false)]
        public long? Priority { get; set; }

        // 费用明细
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("items")]
        [Validation(Required=false)]
        public List<RequestItems> Items { get; set; }

        // 当前单元金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>当前单元金额</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=false)]
        public string Amount { get; set; }

        // 未命中或部分命中时的提示
        /// <summary>
        /// <b>Example:</b>
        /// <para>未命中或部分命中时的提示</para>
        /// </summary>
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
