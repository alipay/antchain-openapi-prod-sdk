// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 文本素材
    public class TextInfoDto : TeaModel {
        // 文本素材信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>文本素材信息</para>
        /// </summary>
        [NameInMap("text")]
        [Validation(Required=true)]
        public string Text { get; set; }

    }

}
