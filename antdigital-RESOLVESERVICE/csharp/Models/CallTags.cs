// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RESOLVESERVICE.Models
{
    // 通话标签
    public class CallTags : TeaModel {
        // 一级标签
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("primary_tag")]
        [Validation(Required=true)]
        public string PrimaryTag { get; set; }

        // 二级标签
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("secondary_tag")]
        [Validation(Required=true)]
        public string SecondaryTag { get; set; }

    }

}
