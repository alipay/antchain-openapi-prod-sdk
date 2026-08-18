// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 模型工具
    public class ModelToolDto : TeaModel {
        // 指定使用的工具类型。
        // 枚举值：
        // + web_search（联网搜索工具。开启联网搜索后，模型会根据用户的提示词自主判断是否搜索互联网内容（如商品、天气等）。可提升生成视频的时效性，但也会增加一定的时延）0
        /// <summary>
        /// <b>Example:</b>
        /// <para>web_search</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
