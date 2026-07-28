// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MDIP.Models
{
    // Flow 成功后的产出列表。运行中或失败时为空。
    public class FlowRunOutput : TeaModel {
        // Flow 输出定义中的稳定字段标识。
        /// <summary>
        /// <b>Example:</b>
        /// <para>summary</para>
        /// </summary>
        [NameInMap("output_key")]
        [Validation(Required=true)]
        public string OutputKey { get; set; }

        // 输出类型，支持 STRING、NUMBER、BOOLEAN、JSON、FILE。
        /// <summary>
        /// <b>Example:</b>
        /// <para>STRING</para>
        /// </summary>
        [NameInMap("output_type")]
        [Validation(Required=true)]
        public string OutputType { get; set; }

        // 输出值。FILE 类型直接返回短期下载地址；JSON 类型返回 JSON 字符串；其他类型返回对应值的字符串形式。
        /// <summary>
        /// <b>Example:</b>
        /// <para>风险较低</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
