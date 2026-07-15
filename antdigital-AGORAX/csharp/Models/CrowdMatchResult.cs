// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 人群匹配结果
    public class CrowdMatchResult : TeaModel {
        // 人群匹配结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("match")]
        [Validation(Required=true)]
        public bool? Match { get; set; }

    }

}
