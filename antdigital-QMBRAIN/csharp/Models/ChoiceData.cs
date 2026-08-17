// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QMBRAIN.Models
{
    // 响应结果
    public class ChoiceData : TeaModel {
        // 结束原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>stop</para>
        /// </summary>
        [NameInMap("finish_reason")]
        [Validation(Required=true)]
        public string FinishReason { get; set; }

        // 序号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("index")]
        [Validation(Required=true)]
        public long? Index { get; set; }

        // 消息内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>{         &quot;content&quot;: &quot;我无法获取实时天气信息。建议您查看当地气象台或使用天气应用（如中国气象局、墨迹天气、AccuWeather等）获取准确的天气情况。&quot;,         &quot;role&quot;: &quot;assistant&quot;       }</para>
        /// </summary>
        [NameInMap("message")]
        [Validation(Required=true)]
        public ChatMessage Message { get; set; }

    }

}
