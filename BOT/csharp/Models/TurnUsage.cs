// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 轮次模型用量
    public class TurnUsage : TeaModel {
        // 对话轮次ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>7468486322254688256</para>
        /// </summary>
        [NameInMap("turn_id")]
        [Validation(Required=true)]
        public string TurnId { get; set; }

        // 该轮用量是否完整
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("complete")]
        [Validation(Required=true)]
        public bool? Complete { get; set; }

        // 模型调用明细
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{},{}]</para>
        /// </summary>
        [NameInMap("model_calls")]
        [Validation(Required=true)]
        public List<TurnModelCallsUsages> ModelCalls { get; set; }

    }

}
