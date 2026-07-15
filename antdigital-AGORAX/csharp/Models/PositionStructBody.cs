// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // TriggerLogDTO类成员
    public class PositionStructBody : TeaModel {
        // 错误计数
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;1&quot;</para>
        /// </summary>
        [NameInMap("error_count")]
        [Validation(Required=false)]
        public string ErrorCount { get; set; }

        // 高度
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;10&quot;</para>
        /// </summary>
        [NameInMap("height")]
        [Validation(Required=false)]
        public string Height { get; set; }

        // 序号
        /// <summary>
        /// <b>Example:</b>
        /// <para>“1”</para>
        /// </summary>
        [NameInMap("index")]
        [Validation(Required=false)]
        public string Index { get; set; }

        // 最后一个错误
        /// <summary>
        /// <b>Example:</b>
        /// <para>“”</para>
        /// </summary>
        [NameInMap("last_error")]
        [Validation(Required=false)]
        public string LastError { get; set; }

        // 类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
