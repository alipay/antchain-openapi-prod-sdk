// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 工具用量
    public class ToolUsage : TeaModel {
        // 联网搜索调用次数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("web_search")]
        [Validation(Required=true)]
        public long? WebSearch { get; set; }

    }

}
