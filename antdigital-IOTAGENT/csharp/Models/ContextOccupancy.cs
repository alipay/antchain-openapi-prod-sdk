// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 上下文占用分析
    public class ContextOccupancy : TeaModel {
        // 最后一次模型调用的模型名
        /// <summary>
        /// <b>Example:</b>
        /// <para>deepseek-flash</para>
        /// </summary>
        [NameInMap("model")]
        [Validation(Required=false)]
        public string Model { get; set; }

        // 当前上下文占用token数
        /// <summary>
        /// <b>Example:</b>
        /// <para>5000</para>
        /// </summary>
        [NameInMap("estimated_input_tokens")]
        [Validation(Required=false)]
        public long? EstimatedInputTokens { get; set; }

        // 模型上下文窗口上限
        /// <summary>
        /// <b>Example:</b>
        /// <para>128000</para>
        /// </summary>
        [NameInMap("context_window_tokens")]
        [Validation(Required=false)]
        public long? ContextWindowTokens { get; set; }

        // 上下文占用比率
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.039</para>
        /// </summary>
        [NameInMap("input_window_ratio")]
        [Validation(Required=false)]
        public long? InputWindowRatio { get; set; }

        // 剩余上下文预算token数
        /// <summary>
        /// <b>Example:</b>
        /// <para>123000</para>
        /// </summary>
        [NameInMap("remaining_input_budget_tokens")]
        [Validation(Required=false)]
        public long? RemainingInputBudgetTokens { get; set; }

        // 告警级别
        /// <summary>
        /// <b>Example:</b>
        /// <para>NORMAL</para>
        /// </summary>
        [NameInMap("warning")]
        [Validation(Required=false)]
        public string Warning { get; set; }

    }

}
